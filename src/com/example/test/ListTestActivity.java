package com.example.test;

import com.example.test.R;
import com.example.test.adapters.ListTestAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

public class ListTestActivity extends Activity	{
	private static final String ACTION_ADD = "Ajouter une annonce";
	
	private ListView mListView;
	private ListTestAdapter mListAdapter;
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.list_activity);
		
		mListAdapter = new ListTestAdapter(this);
		
		mListView = (ListView) findViewById(R.id.listView);
		mListView.setAdapter(mListAdapter);
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	//	super.onCreateOptionsMenu(menu);
		
	//	getMenuInflater().inflate(R.menu.main, menu);
		menu.add(ACTION_ADD);//.setIcon(R.drawable.add_button_md);
		
		return true;
	}
}
