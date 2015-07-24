package com.xuhao.messagemanager;

import java.sql.Savepoint;
import java.util.Date;

import com.xuhao.javaBean.*;
import com.xuhao.messagemanager.R;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.provider.ContactsContract.CommonDataKinds.Relation;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobObject;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.datatype.BmobDate;
import cn.bmob.v3.datatype.BmobRelation;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.listener.UpdateListener;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
	Bmob.initialize(this, "6fd393e552ed1d8dc51dbccf1236cc32");
	
    }

    @SuppressWarnings("deprecation")
    public void addData(View source) {
	Messages message = new Messages();
	Teacher yangyuli = new Teacher(); yangyuli.setObjectId("91353110f9");
	message.setTeacher(yangyuli);
	message.setRelease_date(new BmobDate(new Date()));
	message.setExecute_Date(new BmobDate(new Date(115,6,24)));
	message.setContent("晚上啪啪啪");
	Group group = new Group();
	group.setObjectId("c22cf134a3");
	message.setGroup(group);
	message.save(this, new SaveListener() {

	    @Override
	    public void onSuccess() {
		System.out.println("save success");
	    }
	    
	    @Override
	    public void onFailure(int code, String msg) {
		System.out.println("save failure");
	    }
	});
    }
    public void toListActivity(View source){
	
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	getMenuInflater().inflate(R.menu.main, menu);
	return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
	int id = item.getItemId();
	if (id == R.id.action_settings) {
	    return true;
	}
	return super.onOptionsItemSelected(item);
    }

    class saveListener extends SaveListener{

	@Override
	public void onFailure(int arg0, String arg1) {
	    System.out.println("save failure, code:"+arg0);
	    System.out.println("message:"+arg1);
	}

	@Override
	public void onSuccess() {
	    System.out.println("save successfully");
	    
	}
	
    }
}
