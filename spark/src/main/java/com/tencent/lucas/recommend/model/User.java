package com.tencent.lucas.recommend.model;

/**
 * Created by larry on 6/15/2017.
 */
public class User {
    private String uin;
    private Integer gender;
    private Integer age;
    private Integer edu;

    public String getUin() {
        return uin;
    }

    public void setUin(String uin) {
        this.uin = uin;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getEdu() {
        return edu;
    }

    public void setEdu(Integer edu) {
        this.edu = edu;
    }
}
