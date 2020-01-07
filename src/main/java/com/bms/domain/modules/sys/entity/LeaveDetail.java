package com.bms.domain.modules.sys.entity;

public class LeaveDetail {
    private Integer recordsId;

    private String leaveTime;

    private Integer personId;

    private String leaveProve;

    private Integer leaveDays;

    public LeaveDetail(Integer recordsId, String leaveTime, Integer personId, String leaveProve, Integer leaveDays) {
        this.recordsId = recordsId;
        this.leaveTime = leaveTime;
        this.personId = personId;
        this.leaveProve = leaveProve;
        this.leaveDays = leaveDays;
    }

    public LeaveDetail() {
        super();
    }

    public Integer getRecordsId() {
        return recordsId;
    }

    public void setRecordsId(Integer recordsId) {
        this.recordsId = recordsId;
    }

    public String getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(String leaveTime) {
        this.leaveTime = leaveTime == null ? null : leaveTime.trim();
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getLeaveProve() {
        return leaveProve;
    }

    public void setLeaveProve(String leaveProve) {
        this.leaveProve = leaveProve == null ? null : leaveProve.trim();
    }

    public Integer getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(Integer leaveDays) {
        this.leaveDays = leaveDays;
    }
}