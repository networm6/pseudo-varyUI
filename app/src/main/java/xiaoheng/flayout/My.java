package xiaoheng.flayout;

import android.graphics.drawable.*;
import android.os.*;
import android.support.v4.content.*;
import android.support.v7.app.*;
import android.support.v7.appcompat.*;
import android.widget.*;

public class My extends AppCompatActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my);
		
		
		TextView txv=(TextView)findViewById(R.id.activitymyTextView1);
		// txv.bringToFront();
		
		LinearLayout ll1=(LinearLayout)findViewById(R.id.activitymyLinearLayout2);
		ll1.bringToFront();
		
	}
}
