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
		EditText ID = (EditText)findViewById(R.id.ID);
		EditText PW = (EditText)findViewById(R.id.password);
		String S_ID = ID.getText().toString();
		String S_PW = PW.getText().toString();
		
		if(S_ID.equals("admin") && S_PW.equals("0000"))
		{
			Toast.makeText(getApplicationContext(),""+S_ID+" "+S_PW,500).show();
			Intent intent = new Intent(A_login.this, A_lobby.class);
			startActivity(intent);
		}
		else Toast.makeText(getApplicationContext(),"please, re-check your ID and PW",500).show();		
	}
	public void B_signUp(View v)
	{
		Toast.makeText(getApplicationContext(),"not maked yet.",500).show();
	}
	public void B_signSearch(View v)
	{
		Toast.makeText(getApplicationContext(),"not maked yet.",500).show();
	}
}
