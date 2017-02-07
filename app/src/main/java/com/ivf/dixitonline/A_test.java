package com.ivf.dixitonline;
import android.app.*;
import android.os.*;
import android.view.*;
import android.content.*;
import android.graphics.*;

public class A_test extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.test);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
							WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(new MyView(this));
	}
	class MyView extends View
	{
		int w, h;
		public MyView(Context context)
		{
			super(context);
			Display disp = ((WindowManager) context.getSystemService
								(Context.WINDOW_SERVICE)).getDefaultDisplay();
			w = disp.getWidth();
			h = disp.getHeight();
		}
		public void onDraw(Canvas canvas)
		{
			Paint paint = new Paint();
			paint.setColor(Color.BLUE);
			paint.setTextSize(20);
			
			canvas.drawText("display : "+w+"w x "+h+"h",100,200,paint);
		}
	}
}
