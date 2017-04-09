package com.st.pojo;

public class CommonCity {
    private Integer cityid;

    private String cname;

    private Integer cprovinceid;

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public Integer getCprovinceid() {
        return cprovinceid;
    }

    public void setCprovinceid(Integer cprovinceid) {
        this.cprovinceid = cprovinceid;
    }
}