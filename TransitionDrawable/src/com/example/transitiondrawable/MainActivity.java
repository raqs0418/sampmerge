package com.example.transitiondrawable;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// create the transition layers
		Drawable[] layers = new Drawable[2];
		layers[0] =getResources().getDrawable( R.drawable.rush );
		layers[1] = getResources().getDrawable( R.drawable.rush1 );
		
		RelativeLayout layout = (RelativeLayout)findViewById(R.id.img);
		layout.setBackgroundResource(R.anim.translate);
		TransitionDrawable transitionDrawable = (TransitionDrawable)layout.getBackground();
		transitionDrawable.startTransition(1000);
		transitionDrawable.setVisible(false, true);
		
		CustomListView listView = (CustomListView) findViewById(R.id.listView);
		listView.showNoData();
		
		Log.v("test", "test");
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
