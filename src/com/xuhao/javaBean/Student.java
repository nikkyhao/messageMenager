package com.xuhao.javaBean;
import android.R.string;
import cn.bmob.*;
import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobRelation;
public class Student extends BmobObject{
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public BmobRelation getGroup() {
        return group;
    }
    public void setGroup(BmobRelation group) {
        this.group = group;
    }
    private String name;
    private String school;
    private String major;
    private BmobRelation group;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
