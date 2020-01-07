package com.bms.domain.modules.sys.entity;

public class InternshipDetail {
    private Integer id;

    private Integer personId;

    private String internshipProof;

    private Integer startTime;

    private Integer endTime;

    private String hospitalId;

    private String hospitalName;

    public InternshipDetail(Integer id, Integer personId, String internshipProof, Integer startTime, Integer endTime, String hospitalId, String hospitalName) {
        this.id = id;
        this.personId = personId;
        this.internshipProof = internshipProof;
        this.startTime = startTime;
        this.endTime = endTime;
        this.hospitalId = hospitalId;
        this.hospitalName = hospitalName;
    }

    public InternshipDetail() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getInternshipProof() {
        return internshipProof;
    }

    public void setInternshipProof(String internshipProof) {
        this.internshipProof = internshipProof == null ? null : internshipProof.trim();
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId == null ? null : hospitalId.trim();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }
}