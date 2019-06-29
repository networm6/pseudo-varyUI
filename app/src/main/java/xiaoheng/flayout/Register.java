package xiaoheng.flayout;

import android.os.*;
import android.support.v7.app.*;
import android.text.*;
import android.widget.*;

public class Register extends AppCompatActivity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		
		TextView txv1=(TextView)findViewById(R.id.activityregisterTextView1);
		txv1.setText(Html.fromHtml("完成注册将视为你已充分阅读并接受<font color=\'#2196F3\'> 《Vary 服务使用协议》 </font>中的所有条款。"),null);
	}
	
}
