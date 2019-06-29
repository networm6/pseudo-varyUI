package xiaoheng.flayout;

import android.os.*;
import android.support.v7.app.*;
import android.util.*;
import android.view.ViewTreeObserver.*;
import android.widget.*;

public class Login extends AppCompatActivity
{
	private TextView txv1;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		/*
		txv1 = (TextView)findViewById(R.id.activityloginTextView1);
        txv1.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener()
		{
				@Override
				public void onGlobalLayout()
				{
					txv1.getViewTreeObserver().removeGlobalOnLayoutListener(this);
					Log.i("测试：", txv1.getMeasuredHeight() + "," + txv1.getMeasuredWidth());
				}
		});*/
		
	}

}
