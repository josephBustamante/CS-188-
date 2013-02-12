package edu.drake.assignmentb;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class ScreenThree extends Activity {
	TextView response;
	private static final String TAG = "ThirdScreen";
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_screen_three);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_screen_three, menu);
		return true;
	}

	public void onRadioButtonClicked (View view)
	{
		
		response = (TextView) findViewById(R.id.response);
		boolean checked = ((RadioButton) view).isChecked();
		
		switch(view.getId())
		{
		case R.id.cats:
			if (checked)
			{
				Log.v(TAG, "This is working");
				response.setText("Just cats?");
			}
		case R.id.memes:
			if (checked)
			{
				Log.v(TAG, "This is not working");
				response.setText("Just memes?");
			}
		case R.id.memesWithCats:
			if (checked)
			{
				Log.v(TAG, "This should be working");
				response.setText("I can haz cheezburger?");
			}
			break;
		}
		
	}
	
	
}
