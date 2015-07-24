package com.xuhao.messagemanager;

import javax.security.auth.PrivateCredentialPermission;

import android.R.string;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.*;
public class MessageActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.message_layout);
	System.out.println("memeda");
	
	String[] teachernames = new String[]
	{"杨欲利","董明","袁宝华"};
	String[] releasedate = new String[]
	{"7.23","7.24","7.24"};
	String[] content = new String[]
	{"今天放假","么么哒","啪啪啪"};
	//
	List<Map<String,Object>> listitem = new ArrayList<Map<String,Object>>();
	for(int i=0;i<teachernames.length;i++){
	    Map<String,Object> listMap = new HashMap<String, Object>();
	    listMap.put("teachername", teachernames[i]);
	    listMap.put("releasedate", releasedate[i]);
	    listMap.put("content", content[i]);
	    listitem.add(listMap);
	}
	SimpleAdapter simpleAdapter = new SimpleAdapter(this, listitem, R.layout.item, 
		new String[]{"teachername","releasedate","content"},
		new int[]{R.id.teachername,R.id.releasedate,R.id.content});
	ListView list = (ListView) findViewById(R.id.listView);
	list.setAdapter(simpleAdapter);
		System.out.println("方法执行结束");
    }
    
    
}
