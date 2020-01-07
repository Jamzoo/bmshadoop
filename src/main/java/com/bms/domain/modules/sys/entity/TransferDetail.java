package com.bms.domain.modules.sys.entity;

public class TransferDetail {
    private Integer recordsId;

    private String transferTime;

    private String transferBefore;

    private String transferAfter;

    private Integer personId;

    private String transferProve;

    public TransferDetail(Integer recordsId, String transferTime, String transferBefore, String transferAfter, Integer personId, String transferProve) {
        this.recordsId = recordsId;
        this.transferTime = transferTime;
        this.transferBefore = transferBefore;
        this.transferAfter = transferAfter;
        this.personId = personId;
        this.transferProve = transferProve;
    }

    public TransferDetail() {
        super();
    }

    public Integer getRecordsId() {
        return recordsId;
    }

    public void setRecordsId(Integer recordsId) {
        this.recordsId = recordsId;
    }

    public String getTransferTime() {
        return transferTime;
    }

    public void setTransferTime(String transferTime) {
        this.transferTime = transferTime == null ? null : transferTime.trim();
    }

    public String getTransferBefore() {
        return transferBefore;
    }

    public void setTransferBefore(String transferBefore) {
        this.transferBefore = transferBefore == null ? null : transferBefore.trim();
    }

    public String getTransferAfter() {
        return transferAfter;
    }

    public void setTransferAfter(String transferAfter) {
        this.transferAfter = transferAfter == null ? null : transferAfter.trim();
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getTransferProve() {
        return transferProve;
    }

    public void setTransferProve(String transferProve) {
        this.transferProve = transferProve == null ? null : transferProve.trim();
    }
}