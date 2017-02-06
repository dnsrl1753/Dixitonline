package com.ivf.dixitonline;
import android.app.*;
import android.view.*;
import android.os.*;
import android.content.*;
import android.widget.*;

public class A_room extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.room);
	}
	
	public void B_roomsetting(View v)
	{
		Toast.makeText(getApplicationContext(),"roomsetting",200).show();
		Intent intent = new Intent(A_room.this, A_roomsetting.class);
		startActivity(intent);
	}
	
	public void B_start(View v)
	{
		Toast.makeText(getApplicationContext(),"PLAY",100).show();
		Intent intent = new Intent(A_room.this, A_play.class);
		startActivity(intent);
	}
}
