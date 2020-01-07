package com.bms.domain.modules.sys.entity;

public class WorkExperience {
    private Integer id;

    private Integer entryTime;

    private Integer positiveTime;

    private Byte dimission;

    private String workExperience;

    private String performCertificate;

    private Integer personId;

    private Integer acquisitionTime;

    private Integer expiryDate;

    private String performNo;

    private String performImg;

    public WorkExperience(Integer id, Integer entryTime, Integer positiveTime, Byte dimission, String workExperience, String performCertificate, Integer personId, Integer acquisitionTime, Integer expiryDate, String performNo, String performImg) {
        this.id = id;
        this.entryTime = entryTime;
        this.positiveTime = positiveTime;
        this.dimission = dimission;
        this.workExperience = workExperience;
        this.performCertificate = performCertificate;
        this.personId = personId;
        this.acquisitionTime = acquisitionTime;
        this.expiryDate = expiryDate;
        this.performNo = performNo;
        this.performImg = performImg;
    }

    public WorkExperience() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Integer entryTime) {
        this.entryTime = entryTime;
    }

    public Integer getPositiveTime() {
        return positiveTime;
    }

    public void setPositiveTime(Integer positiveTime) {
        this.positiveTime = positiveTime;
    }

    public Byte getDimission() {
        return dimission;
    }

    public void setDimission(Byte dimission) {
        this.dimission = dimission;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience == null ? null : workExperience.trim();
    }

    public String getPerformCertificate() {
        return performCertificate;
    }

    public void setPerformCertificate(String performCertificate) {
        this.performCertificate = performCertificate == null ? null : performCertificate.trim();
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getAcquisitionTime() {
        return acquisitionTime;
    }

    public void setAcquisitionTime(Integer acquisitionTime) {
        this.acquisitionTime = acquisitionTime;
    }

    public Integer getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Integer expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getPerformNo() {
        return performNo;
    }

    public void setPerformNo(String performNo) {
        this.performNo = performNo == null ? null : performNo.trim();
    }

    public String getPerformImg() {
        return performImg;
    }

    public void setPerformImg(String performImg) {
        this.performImg = performImg == null ? null : performImg.trim();
    }
}