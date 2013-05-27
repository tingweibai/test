package com.example.test;


import com.example.test.adapters.OptionListAdapter;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends Activity {

	private ListView optionListView;
	private OptionListAdapter optionListAdapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		optionListAdapter = new OptionListAdapter(this);
		
		optionListView = (ListView)findViewById(R.id.optionListView);
		optionListView.setAdapter(optionListAdapter);
		optionListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
				
				Intent instent = null;
				
				switch(position) {
					case 0:
						instent = new Intent(MainActivity.this, ListTestActivity.class);
						startActivity(instent);
						overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

						break;
				}
				
			}
		
		});
		
		ActionBar actionbar = getActionBar();
		actionbar.hide();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
	//	menu.add("Options");
	//	menu.add("Quitter");

		return true;
	}
	@Override 
	public boolean onOptionsItemSelected(MenuItem item) {	
		return super.onOptionsItemSelected(item);
	}

}
