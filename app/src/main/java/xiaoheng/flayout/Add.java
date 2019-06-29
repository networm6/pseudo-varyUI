package xiaoheng.flayout;

import android.os.*;
import android.support.v7.app.*;
import android.view.*;

public class Add extends AppCompatActivity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		setContentView(R.layout.activity_add);
	}

}
