package com.example.test.data;

import android.os.Parcel;
import android.os.Parcelable;

public class Annonce implements Parcelable{
	private String imgURL;
	private String title;
	private String context;
	
	public Annonce() {}
	public Annonce(Parcel in) {
		imgURL = in.readString();
		title = in.readString();
		context = in.readString();
	}
	
	public String getImgURL()
	{
		if (imgURL == null) return "";
		return imgURL;
	}
	public void setImgURL(String value)
	{
		this.imgURL = value;
	}
	public String getTitle()
	{
		if (title == null) return "";
		return title;
	}
	public void setTitle(String value)
	{
		this.title = value;
	}
	public String getContext()
	{
		if (context == null) return "";
		return context;
	}
	public void setContext(String value)
	{
		this.context = value;
	}
	
	/*
	 * Parcelable 
	 * @implementation Parcelable
	 */
	@Override
	public int describeContents() {
		
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(imgURL);
		dest.writeString(title);
		dest.writeString(context);
	}
	
	public static final Parcelable.Creator<Annonce> CREATOR = new Parcelable.Creator<Annonce>() {

		@Override
		public Annonce createFromParcel(Parcel source) {
			return new Annonce(source);
		}

		@Override
		public Annonce[] newArray(int size) {
			// TODO Auto-generated method stub
			return new Annonce[size];
		}
	};
}
