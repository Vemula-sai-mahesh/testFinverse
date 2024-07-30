package org.example.webhook;
import lombok.Data;

@Data
public class WebhookPayload {
    private int officeId;
    private String firstname;
    private String lastname;
    private String externalId;

    public int getOfficeId() {
        return officeId;
    }

    public void setOfficeId(int officeId) {
        this.officeId = officeId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(String activationDate) {
        this.activationDate = activationDate;
    }

    public String getSubmittedOnDate() {
        return submittedOnDate;
    }

    public void setSubmittedOnDate(String submittedOnDate) {
        this.submittedOnDate = submittedOnDate;
    }

    public int getSavingsProductId() {
        return savingsProductId;
    }

    public void setSavingsProductId(int savingsProductId) {
        this.savingsProductId = savingsProductId;
    }

    public Datatable[] getDatatables() {
        return datatables;
    }

    public void setDatatables(Datatable[] datatables) {
        this.datatables = datatables;
    }

    private String dateFormat;
    private String locale;
    private boolean active;
    private String activationDate;
    private String submittedOnDate;
    private int savingsProductId;
    private Datatable[] datatables;
}


