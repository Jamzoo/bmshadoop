package com.bms.domain.modules.sys.entity;

public class PersonnelRecords {
    private Integer id;

    private Integer personId;

    private String hospitalId;

    private Byte applyFor;

    private String memo;

    private Long createTime;

    private String create_time_str;

    public String getCreate_time_str() {
        return create_time_str;
    }

    public void setCreate_time_str(String create_time_str) {
        this.create_time_str = create_time_str;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public PersonnelRecords(Integer id, Integer personId, String hospitalId, Byte applyFor, String memo, Long createTime, String create_time_str) {
        this.id = id;
        this.personId = personId;
        this.hospitalId = hospitalId;
        this.applyFor = applyFor;
        this.memo = memo;
        this.createTime = createTime;
        this.create_time_str = create_time_str;
    }

    public PersonnelRecords() {
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

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId == null ? null : hospitalId.trim();
    }

    public Byte getApplyFor() {
        return applyFor;
    }

    public void setApplyFor(Byte applyFor) {
        this.applyFor = applyFor;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}