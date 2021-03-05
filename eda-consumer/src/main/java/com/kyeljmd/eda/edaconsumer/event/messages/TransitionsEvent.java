package com.kyeljmd.eda.edaconsumer.event.messages;

public class TransitionsEvent {
    
    private String transitionTitle;

    private String description;
    private String imagePath;
    private String lastName;
    private String companyName;
    private String updatedAt;
    private String status; 
    private String allowEmailNotifications; 
    private String role; 
    private String companyType; 
    private String dateOfBirth; 
    private String id; 
    private String email; 
    private String companySize; 
    private String isAgreeTermsAndPrivacy; 
    private String uuid;
    private Long createdAt;
    private long startDate;
    private long endDate;
    private boolean parallelRequired;
    private boolean executionRequired;


    private String reason;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public long getStartDate() {
        return startDate;
    }

    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }

    public long getEndDate() {
        return endDate;
    }

    public void setEndDate(long endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTransitionTitle() {
        return transitionTitle;
    }

    public void setTransitionTitle(String transitionTitle) {
        this.transitionTitle = transitionTitle;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAllowEmailNotifications() {
        return allowEmailNotifications;
    }

    public void setAllowEmailNotifications(String allowEmailNotifications) {
        this.allowEmailNotifications = allowEmailNotifications;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanySize() {
        return companySize;
    }

    public void setCompanySize(String companySize) {
        this.companySize = companySize;
    }

    public String getIsAgreeTermsAndPrivacy() {
        return isAgreeTermsAndPrivacy;
    }

    public void setIsAgreeTermsAndPrivacy(String isAgreeTermsAndPrivacy) {
        this.isAgreeTermsAndPrivacy = isAgreeTermsAndPrivacy;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isParallelRequired() {
        return parallelRequired;
    }

    public void setParallelRequired(boolean parallelRequired) {
        this.parallelRequired = parallelRequired;
    }

    public boolean isExecutionRequired() {
        return executionRequired;
    }

    public void setExecutionRequired(boolean executionRequired) {
        this.executionRequired = executionRequired;
    }

    @Override
    public String toString() {
        return "TransitionsEvent{" +
                "transitionTitle='" + transitionTitle + '\'' +
                ", description='" + description + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", lastName='" + lastName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", status='" + status + '\'' +
                ", allowEmailNotifications='" + allowEmailNotifications + '\'' +
                ", role='" + role + '\'' +
                ", companyType='" + companyType + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", companySize='" + companySize + '\'' +
                ", isAgreeTermsAndPrivacy='" + isAgreeTermsAndPrivacy + '\'' +
                ", uuid='" + uuid + '\'' +
                ", createdAt=" + createdAt +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", parallelRequired=" + parallelRequired +
                ", executionRequired=" + executionRequired +
                ", reason='" + reason + '\'' +
                '}';
    }
}
