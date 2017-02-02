package com.ivf.dixitonline;
import android.app.*;
import android.view.*;
import android.os.*;
import android.content.*;
import android.widget.*;

public class A_lobby extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lobby);
	}
	public void B_room(View v)
	{
		Toast.makeText(getApplicationContext(),"room",300).show();
		Intent intent = new Intent(A_lobby.this, A_room.class);
		startActivity(intent);
	}

//	@Override
//	public boolean dispatchKeyEvent(KeyEvent event)
//	{
//		// TODO: Implement this method
//		return true; //super.dispatchKeyEvent(event);
//	}

	
}
