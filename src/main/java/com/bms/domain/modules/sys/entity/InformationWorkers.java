package com.bms.domain.modules.sys.entity;

public class InformationWorkers {
    private Integer id;

    private Integer personId;

    private String summerJacketSize;

    private String summerPantsSize;

    private String summerShoeSize;

    private String winterShoeSize;

    private String winterJacketSize;

    private String winterPantsSize;

    private String memo;

    public InformationWorkers(Integer id, Integer personId, String summerJacketSize, String summerPantsSize, String summerShoeSize, String winterShoeSize, String winterJacketSize, String winterPantsSize, String memo) {
        this.id = id;
        this.personId = personId;
        this.summerJacketSize = summerJacketSize;
        this.summerPantsSize = summerPantsSize;
        this.summerShoeSize = summerShoeSize;
        this.winterShoeSize = winterShoeSize;
        this.winterJacketSize = winterJacketSize;
        this.winterPantsSize = winterPantsSize;
        this.memo = memo;
    }

    public InformationWorkers() {
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

    public String getSummerJacketSize() {
        return summerJacketSize;
    }

    public void setSummerJacketSize(String summerJacketSize) {
        this.summerJacketSize = summerJacketSize == null ? null : summerJacketSize.trim();
    }

    public String getSummerPantsSize() {
        return summerPantsSize;
    }

    public void setSummerPantsSize(String summerPantsSize) {
        this.summerPantsSize = summerPantsSize == null ? null : summerPantsSize.trim();
    }

    public String getSummerShoeSize() {
        return summerShoeSize;
    }

    public void setSummerShoeSize(String summerShoeSize) {
        this.summerShoeSize = summerShoeSize == null ? null : summerShoeSize.trim();
    }

    public String getWinterShoeSize() {
        return winterShoeSize;
    }

    public void setWinterShoeSize(String winterShoeSize) {
        this.winterShoeSize = winterShoeSize == null ? null : winterShoeSize.trim();
    }

    public String getWinterJacketSize() {
        return winterJacketSize;
    }

    public void setWinterJacketSize(String winterJacketSize) {
        this.winterJacketSize = winterJacketSize == null ? null : winterJacketSize.trim();
    }

    public String getWinterPantsSize() {
        return winterPantsSize;
    }

    public void setWinterPantsSize(String winterPantsSize) {
        this.winterPantsSize = winterPantsSize == null ? null : winterPantsSize.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}