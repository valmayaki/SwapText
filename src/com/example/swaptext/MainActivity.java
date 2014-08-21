package com.example.swaptext;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	Button a;
	Button b;
	EditText x;
	EditText y;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		a=(Button)this.findViewById(R.id.button1);
		b=(Button)this.findViewById(R.id.button2);
		x=(EditText)this.findViewById(R.id.editText1);
		y=(EditText)this.findViewById(R.id.editText2);
		a.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String g=y.getText().toString();
				String h=x.getText().toString();
				// TODO Auto-generated method stub
				if(g.equals("")){
					try{
						y.setText(h);
						Toast.makeText(getApplicationContext(), "text 1 has been swaped to text 2", Toast.LENGTH_LONG).show();
					}catch(Exception er){
						Toast.makeText(getApplicationContext(), "this is the error :"+er, Toast.LENGTH_LONG).show();
					}
				}
				else if(h.equals("")){
					try{
						x.setText(g);
						Toast.makeText(getApplicationContext(), "text 2 has been swaped to text 1", Toast.LENGTH_LONG).show();
					}catch(Exception er){
						Toast.makeText(getApplicationContext(), "this is the error :"+er, Toast.LENGTH_LONG).show();
					}
				}
				else{
					Toast.makeText(getApplicationContext(), "no text to swap", Toast.LENGTH_LONG).show();
				}
				
			}
		});
		b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				try{
					x.setText(null);
					y.setText(null);
				}catch(Exception e){
					Toast.makeText(getApplicationContext(), "This is the error :"+e, Toast.LENGTH_LONG).show();
				}
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
