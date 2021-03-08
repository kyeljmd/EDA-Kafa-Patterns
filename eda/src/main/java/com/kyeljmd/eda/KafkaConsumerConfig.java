package com.kyeljmd.eda;

import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

import static org.apache.kafka.clients.consumer.ConsumerConfig.*;
import static org.springframework.kafka.support.serializer.JsonDeserializer.TRUSTED_PACKAGES;

@EnableKafka
@Configuration
public class KafkaConsumerConfig {

    /**
     * On the application properties, use comma seperated
     * list of values when need to specify multiple bootstrap address
     */
    @Value("${kafka.bootstrap.server}")
    private String KAFKA_BOOTSTRAP_ADDRESS;

    /**
     * GROUPIds are supposed to be
     * automatically assigned. Upon creation
     */
    @Value("${kafka.consumer.groupId}")
    private String KAFKA_CONSUMER_GROUP_ID;

    /**
     * Specify trust packages - is useful when we expect to
     * receive Kafka Messages Serialized as JSONS.
     */
    @Value("${kafka.consumer.trusted-packages}")
    private String KAFKA_MESSAGE_TRUSTED_PACKAGES;

    /**
     * String Consumer Factory
     * @return
     */
    @Bean
    public ConsumerFactory<String, String> consumerFactory() {
        Map<String, Object> props = new HashMap<>();
        props.put(BOOTSTRAP_SERVERS_CONFIG, KAFKA_BOOTSTRAP_ADDRESS);
        props.put(GROUP_ID_CONFIG, KAFKA_CONSUMER_GROUP_ID);
        props.put(KEY_DESERIALIZER_CLASS_CONFIG,
                StringDeserializer.class);
        props.put(VALUE_DESERIALIZER_CLASS_CONFIG,
                StringDeserializer.class);
        props.put(TRUSTED_PACKAGES, "*");
        return new DefaultKafkaConsumerFactory<>(props);
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, String>
    kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, String> factory
                = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        return factory;
    }
}
