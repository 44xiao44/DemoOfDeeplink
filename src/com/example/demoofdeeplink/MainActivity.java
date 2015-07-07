package com.example.demoofdeeplink;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView deeplink_value;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		deeplink_value = (TextView) findViewById(R.id.deeplink_value);

		// get deeplink value
		Intent intent = getIntent();
		String scheme = intent.getScheme();

		if (null != intent.getDataString()) {

			Uri uri = intent.getData();
			System.out.println("scheme:" + scheme);
			String splitStr = "\r\n";
			if (uri != null) {
				String host = uri.getHost();
				String dataString = intent.getDataString();
				String id = uri.getQueryParameter("d");
				String path = uri.getPath();
				String path1 = uri.getEncodedPath();
				String queryString = uri.getQuery();
				
				StringBuilder sb = new StringBuilder();
				sb.append("scheme:").append(scheme).append(splitStr)
				.append("host:").append(host).append(splitStr)
				.append("dataString:").append(dataString).append(splitStr)
				.append("id:").append(id).append(splitStr)
				.append("path:").append(path).append(splitStr)
				.append("path1:").append(path1).append(splitStr)
				.append("queryString:").append(queryString).append(splitStr);
				deeplink_value.setText(sb.toString());
			}
			
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
