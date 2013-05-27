package com.example.test.adapters;

import java.net.URI;
import java.util.ArrayList;

import com.example.test.R;
import com.example.test.data.Annonce;

import android.content.Context;
import android.net.Uri;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListTestAdapter extends BaseAdapter{
	private ArrayList<Annonce> annonces = new ArrayList<Annonce>();
	private Context mContext;
	private LayoutInflater mInflater;
	
	public ListTestAdapter(Context context) {
		
		mContext = context;
		mInflater = LayoutInflater.from(mContext);
	}
	
	public void setAnnonces(ArrayList<Annonce> array) 
	{
		annonces = array;
	}
	public ArrayList<Annonce> getAnnonces()
	{
		return annonces;
	}
	
	@Override
	public int getCount() {
		return annonces.size();
	}

	@Override
	public Object getItem(int position) {
		if (position < annonces.size())
			return annonces.get(position);
		return null;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}
	

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		ViewHolder holder = null;
		if(convertView == null) {
			convertView = mInflater.inflate(R.layout.list_item_row, parent, false);
			holder.thumbImage = (ImageView) convertView.findViewById(R.id.thumb_image);
			holder.title = (TextView) convertView.findViewById(R.id.title);
			holder.context = (TextView) convertView.findViewById(R.id.context);
			convertView.setTag(holder);
		}
		else
			holder = (ViewHolder) convertView.getTag();
		
		Annonce annonce = (Annonce)getItem(position);
		if (annonce != null)
		{
			//holder.thumbImage
			holder.title.setText(annonce.getTitle());
			holder.context.setText(annonce.getContext());
		}
		
		return convertView;
	}
	
	private static class ViewHolder {
		public ImageView thumbImage;
		public TextView title;
		public TextView context;
	}

}
