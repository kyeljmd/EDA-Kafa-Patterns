package com.kyeljmd.eda.edaconsumer.event.messages;


public class UsersEvent {
    public int id;
    public String uuid;
    public String firstName;
    public String lastName;
    public String status;
    public String email;
    public String role;
    public String companyName;
    public String companySize;
    public String companyType;
    public String dateOfBirth;
    public String imagePath;
    public String isAgreeTermsAndPrivacy;
    public String allowEmailNotifications;
    public long createdAt;
    public long updatedAt;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanySize() {
        return companySize;
    }

    public void setCompanySize(String companySize) {
        this.companySize = companySize;
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

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getIsAgreeTermsAndPrivacy() {
        return isAgreeTermsAndPrivacy;
    }

    public void setIsAgreeTermsAndPrivacy(String isAgreeTermsAndPrivacy) {
        this.isAgreeTermsAndPrivacy = isAgreeTermsAndPrivacy;
    }

    public String getAllowEmailNotifications() {
        return allowEmailNotifications;
    }

    public void setAllowEmailNotifications(String allowEmailNotifications) {
        this.allowEmailNotifications = allowEmailNotifications;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "UsersConnect{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", status='" + status + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", companyName='" + companyName + '\'' +
                ", companySize='" + companySize + '\'' +
                ", companyType='" + companyType + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", isAgreeTermsAndPrivacy='" + isAgreeTermsAndPrivacy + '\'' +
                ", allowEmailNotifications='" + allowEmailNotifications + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
