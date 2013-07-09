package com.example.peppersp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class EmergencyNoSetting extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_emergency_no_setting);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_emergency_no_setting, menu);
		return true;
	}

}
