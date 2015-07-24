package com.xuhao.messagemanager;

import cn.bmob.v3.listener.InitListener;

import com.tencent.tauth.*;

import android.app.Activity;
import android.os.Bundle;

public class qq_Activity extends Activity{
    Tencent mTencent =null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	mTencent = Tencent.createInstance("1104779056", this.getApplicationContext());
	
	
    }
    
}
