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
