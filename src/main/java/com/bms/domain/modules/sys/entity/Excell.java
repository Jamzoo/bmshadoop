package com.bms.domain.modules.sys.entity;

public class Excell {
    private String COLUMN_NAME;
    private String COLUMN_TYPE;
    private String IS_NULLABLE;
    private String COLUMN_DEFAULT;
    private String COLUMN_KEY;
    private String COLUMN_COMMENT;

    private String table_name;

    public String getTable_name() {
        return table_name;
    }

    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }

    public String getCOLUMN_NAME() {
        return COLUMN_NAME;
    }

    public void setCOLUMN_NAME(String COLUMN_NAME) {
        this.COLUMN_NAME = COLUMN_NAME;
    }

    public String getCOLUMN_TYPE() {
        return COLUMN_TYPE;
    }

    public void setCOLUMN_TYPE(String COLUMN_TYPE) {
        this.COLUMN_TYPE = COLUMN_TYPE;
    }

    public String getIS_NULLABLE() {
        return IS_NULLABLE;
    }

    public void setIS_NULLABLE(String IS_NULLABLE) {
        this.IS_NULLABLE = IS_NULLABLE;
    }

    public String getCOLUMN_DEFAULT() {
        return COLUMN_DEFAULT;
    }

    public void setCOLUMN_DEFAULT(String COLUMN_DEFAULT) {
        this.COLUMN_DEFAULT = COLUMN_DEFAULT;
    }

    public String getCOLUMN_KEY() {
        return COLUMN_KEY;
    }

    public void setCOLUMN_KEY(String COLUMN_KEY) {
        this.COLUMN_KEY = COLUMN_KEY;
    }

    public String getCOLUMN_COMMENT() {
        return COLUMN_COMMENT;
    }

    public void setCOLUMN_COMMENT(String COLUMN_COMMENT) {
        this.COLUMN_COMMENT = COLUMN_COMMENT;
    }

    @Override
    public String toString() {
        return "Excell{" +
                "COLUMN_NAME='" + COLUMN_NAME + '\'' +
                ", COLUMN_TYPE='" + COLUMN_TYPE + '\'' +
                ", IS_NULLABLE='" + IS_NULLABLE + '\'' +
                ", COLUMN_DEFAULT='" + COLUMN_DEFAULT + '\'' +
                ", COLUMN_KEY='" + COLUMN_KEY + '\'' +
                ", COLUMN_COMMENT='" + COLUMN_COMMENT + '\'' +
                ", table_name='" + table_name + '\'' +
                '}';
    }
}
