package com.bms.domain.modules.sys.entity;

public class RotateDetail {
    private Integer recordsId;

    private String rotateTime;

    private String rotateBefore;

    private String rotateAfter;

    private Integer personId;

    private String rotateProve;

    public RotateDetail(Integer recordsId, String rotateTime, String rotateBefore, String rotateAfter, Integer personId, String rotateProve) {
        this.recordsId = recordsId;
        this.rotateTime = rotateTime;
        this.rotateBefore = rotateBefore;
        this.rotateAfter = rotateAfter;
        this.personId = personId;
        this.rotateProve = rotateProve;
    }

    public RotateDetail() {
        super();
    }

    public Integer getRecordsId() {
        return recordsId;
    }

    public void setRecordsId(Integer recordsId) {
        this.recordsId = recordsId;
    }

    public String getRotateTime() {
        return rotateTime;
    }

    public void setRotateTime(String rotateTime) {
        this.rotateTime = rotateTime == null ? null : rotateTime.trim();
    }

    public String getRotateBefore() {
        return rotateBefore;
    }

    public void setRotateBefore(String rotateBefore) {
        this.rotateBefore = rotateBefore == null ? null : rotateBefore.trim();
    }

    public String getRotateAfter() {
        return rotateAfter;
    }

    public void setRotateAfter(String rotateAfter) {
        this.rotateAfter = rotateAfter == null ? null : rotateAfter.trim();
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getRotateProve() {
        return rotateProve;
    }

    public void setRotateProve(String rotateProve) {
        this.rotateProve = rotateProve == null ? null : rotateProve.trim();
    }
}