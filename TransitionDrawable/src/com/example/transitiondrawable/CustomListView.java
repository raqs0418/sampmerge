package com.example.transitiondrawable;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

public class CustomListView extends ListView {

	private Context _context;
	
	public CustomListView(Context context, AttributeSet attrs) {
		super(context, attrs);
		this._context = context;
		
		Log.v("test", "test only");
		
	}

	public void showNoData(){
		LayoutInflater inflater = (LayoutInflater)_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View menuLayout = inflater.inflate(R.layout.emptyview_layout, null, true);
		addFooterView(menuLayout);
	}

}
