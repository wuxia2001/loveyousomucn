package com.wbw.loveyouso;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class MainActivity extends Activity {
	WebView wb;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		wb = (WebView) findViewById(R.id.wb);
		wb.getSettings().setJavaScriptEnabled(true);
		wb.loadUrl("file:///android_asset/Love.htm");
	}

	

}
