package com.example.test.adapters;

import java.util.ArrayList;

import com.example.test.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class OptionListAdapter extends BaseAdapter{

	private Context mContext;
	private LayoutInflater mLayoutInflater;
	private ArrayList<String> options;
	
	public OptionListAdapter(Context context) {
		mContext = context;
		mLayoutInflater = LayoutInflater.from(context);
		
		options = new ArrayList<String>();
		options.add(mContext.getString(R.string.mainMenu_option00));
		options.add(mContext.getString(R.string.mainMenu_option01));
	}
	
	@Override
	public int getCount() {
		return options.size();
	}

	@Override
	public Object getItem(int position) {
		if(position < options.size())
			return options.get(position);
		return null;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder = null;
		if(convertView == null)
		{
			holder = new ViewHolder();
			convertView = mLayoutInflater.inflate(R.layout.mainmenu_option, parent, false);
			holder.title = (TextView) convertView.findViewById(R.id.title);
			convertView.setTag(holder);
		}
		else
			holder = (ViewHolder) convertView.getTag();
		
		String title = (String) getItem(position);
		holder.title.setText(title);
		
		return convertView;
	}
	//--------------------------------------------------------------------------
	private static class ViewHolder {
		public TextView title;
	}

}
