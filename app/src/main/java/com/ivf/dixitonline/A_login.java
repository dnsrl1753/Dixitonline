package com.ivf.dixitonline;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.content.*;

public class A_login extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
	}
	public void B_login(View v)
	{
			Toast.makeText(getApplicationContext(),"lobby",200).show();
			Intent intent = new Intent(A_login.this, A_lobby.class);
			startActivity(intent);
	}
}
