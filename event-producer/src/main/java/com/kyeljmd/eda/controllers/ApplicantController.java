package com.kyeljmd.eda.controllers;

import com.kyeljmd.eda.event.messages.pageevent.RegisterApplicantDTO;
import com.kyeljmd.eda.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@RestController
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;

    @PostMapping
    @ResponseBody
    public RegisterApplicantDTO createApplicant(@RequestBody RegisterApplicantDTO
                                                            registerApplicantDTO) {
        System.out.println("Creating new applicant");
        applicantService.createApplicant(registerApplicantDTO);
        return registerApplicantDTO;
    }

    @GetMapping
    public List<RegisterApplicantDTO> getApplicants() {
        return null;
    }
}
