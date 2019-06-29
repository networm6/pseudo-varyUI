package xiaoheng.flayout;

import android.os.*;
import android.support.v7.app.*;
import android.support.v7.widget.*;
import android.view.*;
import android.content.*;

public class MainActivity extends AppCompatActivity 
{
	private Intent intent1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		Toolbar toolbar = (Toolbar) findViewById(R.id.mainToolbar1);
        setSupportActionBar(toolbar);

    }

	public void add(View v)
	{
		intent1 = new Intent(MainActivity.this, Add.class);
		startActivity(intent1);
	}

	public void register(View v)
	{
		intent1 = new Intent(MainActivity.this, Register.class);
		startActivity(intent1);
	}

	public void about(View v)
	{
		intent1 = new Intent(MainActivity.this, About.class);
		startActivity(intent1);
	}

	public void my(View v)
	{
		intent1 = new Intent(MainActivity.this, My.class);
		startActivity(intent1);
	}

	public void welcome(View v)
	{
		intent1 = new Intent(MainActivity.this, Welcome.class);
		startActivity(intent1);
	}

	public void login(View v)
	{
		intent1 = new Intent(MainActivity.this, Login.class);
		startActivity(intent1);
	}

}
