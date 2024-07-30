package org.example.webhook;

import lombok.Data;

@Data
public class DataDetails {
    private String locale;
    private String numberOfMembers;
    private String numberOfDependents;
    private String noOfChildren;
    private String dateOfVerification;
    private String dateFormat;
    private String addressLine;
    private String street;
    private String landmark;
    private int countryCdCountry;
    private String stateCdState;
    private String districtCdDistrict;
    private String pincode;
}