package com.xuhao.javaBean;

import android.R.string;
import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobDate;
import cn.bmob.v3.datatype.BmobPointer;

public class Messages extends BmobObject{
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public BmobDate getRelease_date() {
        return release_date;
    }
    public void setRelease_date(BmobDate release_date) {
        this.release_date = release_date;
    }
    public BmobDate getExecute_Date() {
        return execute_Date;
    }
    public void setExecute_Date(BmobDate execute_Date) {
        this.execute_Date = execute_Date;
    }
    public Group getGroup() {
        return group;
    }
    public void setGroup(Group group) {
        this.group = group;
    }
    
    private BmobDate release_date ;
    private BmobDate  execute_Date;
    private Group group;
    private String content;

}
