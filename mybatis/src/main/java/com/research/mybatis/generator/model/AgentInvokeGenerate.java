package com.research.mybatis.generator.model;

public class AgentInvokeGenerate {
    private String ID;

    private String dbFlag;

    private String STATUS;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID == null ? null : ID.trim();
    }

    public String getDbFlag() {
        return dbFlag;
    }

    public void setDbFlag(String dbFlag) {
        this.dbFlag = dbFlag == null ? null : dbFlag.trim();
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS == null ? null : STATUS.trim();
    }
}