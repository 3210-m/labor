package com.oracle.labor.po;

import java.util.Date;

public class ZjDwzpdjb {
    private String zpbh;

    private Integer dwbh;

    private String dwlxr;

    private String lxrsfzhm;

    private String lxrsj;

    private String sfdj="否";

    private Integer djyxq = 1;

    private Date djsj = new Date();

    private String gdsj;

    public String getZpbh() {
        return zpbh;
    }

    public void setZpbh(String zpbh) {
        this.zpbh = zpbh == null ? null : zpbh.trim();
    }

    public Integer getDwbh() {
        return dwbh;
    }

    public void setDwbh(Integer dwbh) {
        this.dwbh = dwbh;
    }

    public String getDwlxr() {
        return dwlxr;
    }

    public void setDwlxr(String dwlxr) {
        this.dwlxr = dwlxr == null ? null : dwlxr.trim();
    }

    public String getLxrsfzhm() {
        return lxrsfzhm;
    }

    public void setLxrsfzhm(String lxrsfzhm) {
        this.lxrsfzhm = lxrsfzhm == null ? null : lxrsfzhm.trim();
    }

    public String getLxrsj() {
        return lxrsj;
    }

    public void setLxrsj(String lxrsj) {
        this.lxrsj = lxrsj == null ? null : lxrsj.trim();
    }

    public String getSfdj() {
        return sfdj;
    }

    public void setSfdj(String sfdj) {
        this.sfdj = sfdj == null ? null : sfdj.trim();
    }

    public Integer getDjyxq() {
        return djyxq;
    }

    public void setDjyxq(Integer djyxq) {
        this.djyxq = djyxq;
    }

    public Date getDjsj() {
        return djsj;
    }

    public void setDjsj(Date djsj) {
        this.djsj = djsj == null ? null : djsj;
    }

    public String getGdsj() {
        return gdsj;
    }

    public void setGdsj(String gdsj) {
        this.gdsj = gdsj == null ? null : gdsj.trim();
    }
}