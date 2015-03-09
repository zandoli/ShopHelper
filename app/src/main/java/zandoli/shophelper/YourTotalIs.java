package zandoli.shophelper;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class YourTotalIs extends Activity {

	EditText editTextTotal;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.total);

		editTextTotal = (EditText) findViewById(R.id.editTextTotal);
		editTextTotal.setText(getIntent().getStringExtra("otherLayout"));
	}

	public void onReset2(View v) {
		editTextTotal.setText(null);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.total, menu);
		return true;
	}

}
