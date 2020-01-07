package com.bms.domain.modules.sys.entity;

public class Hospital {
    private Integer id;

    private String hospitalType;

    private String hospitalName;

    private String hospitalLocation;

    private String hospitalLogo;

    public Hospital(Integer id, String hospitalType, String hospitalName, String hospitalLocation, String hospitalLogo) {
        this.id = id;
        this.hospitalType = hospitalType;
        this.hospitalName = hospitalName;
        this.hospitalLocation = hospitalLocation;
        this.hospitalLogo = hospitalLogo;
    }

    public Hospital() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHospitalType() {
        return hospitalType;
    }

    public void setHospitalType(String hospitalType) {
        this.hospitalType = hospitalType == null ? null : hospitalType.trim();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    public String getHospitalLocation() {
        return hospitalLocation;
    }

    public void setHospitalLocation(String hospitalLocation) {
        this.hospitalLocation = hospitalLocation == null ? null : hospitalLocation.trim();
    }

    public String getHospitalLogo() {
        return hospitalLogo;
    }

    public void setHospitalLogo(String hospitalLogo) {
        this.hospitalLogo = hospitalLogo == null ? null : hospitalLogo.trim();
    }
}