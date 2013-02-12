package edu.drake.assignmentb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	Button pressMe;
	Button screenTwo;
	Button screenThree;
	TextView screenOneText;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		pressMe = (Button) findViewById(R.id.pressMe);
		screenTwo = (Button) findViewById(R.id.screen2);
		screenThree = (Button) findViewById(R.id.screen3);
		screenOneText = (TextView) findViewById(R.id.text);
		
		pressMe.setOnClickListener(new OnClickListener() 
		{
			public void onClick(View v)
			{
				screenOneText.setText("What? you thought that this did something special?");
			}
		});
		
		screenTwo.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				//This is where screen two will load
				Intent intent = new Intent(v.getContext(), SecondScreen.class);
				startActivity(intent);
			}
		});
		
		screenThree.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				//This is where screen three will load
				Intent intent = new Intent(v.getContext(), ScreenThree.class);
				startActivity(intent);
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
