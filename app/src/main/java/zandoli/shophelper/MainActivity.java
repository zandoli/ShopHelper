package zandoli.shophelper;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.text.DecimalFormat;

public class MainActivity extends Activity {

	private EditText editText1;
	private EditText editText2;
	private EditText editText3;
	private EditText editText4;
	private EditText editText5;
	private EditText editText6;
	private EditText editText7;
	private EditText editText8;
	private EditText editText9;
	private EditText editText10;
	private EditText editText11;
	private EditText editText12;
	private EditText editText13;
	private EditText editText14;
	private EditText editText15;
	private EditText editText16;
	private EditText editText17;
	private EditText editText18;
	private EditText editText19;
	private EditText editText20;
	private EditText editText21;
	private EditText editText22;
	private EditText editText23;
	private EditText editText24;
	private EditText editText25;
	private EditText editText26;
	private EditText editText27;
	private EditText editText28;
	private EditText editText29;
	private EditText editText30;
	private EditText editText1c;
	private EditText editText2c;
	private EditText editText3c;
	private EditText editText4c;
	private EditText editText5c;
	private EditText editText6c;
	private EditText editText7c;
	private EditText editText8c;
	private EditText editText9c;
	private EditText editText10c;
	private EditText editText11c;
	private EditText editText12c;
	private EditText editText13c;
	private EditText editText14c;
	private EditText editText15c;
	private EditText editText16c;
	private EditText editText17c;
	private EditText editText18c;
	private EditText editText19c;
	private EditText editText20c;
	private EditText editText21c;
	private EditText editText22c;
	private EditText editText23c;
	private EditText editText24c;
	private EditText editText25c;
	private EditText editText26c;
	private EditText editText27c;
	private EditText editText28c;
	private EditText editText29c;
	private EditText editText30c;
	//private Button btnCompute;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		addListenerOnButton();

		/* do this in onCreate */
		mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
		mSensorManager.registerListener(mSensorListener,
				mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
				SensorManager.SENSOR_DELAY_NORMAL);
		mAccel = 0.00f;
		mAccelCurrent = SensorManager.GRAVITY_EARTH;
		mAccelLast = SensorManager.GRAVITY_EARTH;

		editText1 = (EditText) findViewById(R.id.editText1);
		editText2 = (EditText) findViewById(R.id.editText2);
		editText3 = (EditText) findViewById(R.id.editText3);
		editText4 = (EditText) findViewById(R.id.editText4);
		editText5 = (EditText) findViewById(R.id.editText5);
		editText6 = (EditText) findViewById(R.id.editText6);
		editText7 = (EditText) findViewById(R.id.editText7);
		editText8 = (EditText) findViewById(R.id.editText8);
		editText9 = (EditText) findViewById(R.id.editText9);
		editText10 = (EditText) findViewById(R.id.editText10);
		editText11 = (EditText) findViewById(R.id.editText11);
		editText12 = (EditText) findViewById(R.id.editText12);
		editText13 = (EditText) findViewById(R.id.editText13);
		editText14 = (EditText) findViewById(R.id.editText14);
		editText15 = (EditText) findViewById(R.id.editText15);
		editText16 = (EditText) findViewById(R.id.editText16);
		editText17 = (EditText) findViewById(R.id.editText17);
		editText18 = (EditText) findViewById(R.id.editText18);
		editText19 = (EditText) findViewById(R.id.editText19);
		editText20 = (EditText) findViewById(R.id.editText20);
		editText21 = (EditText) findViewById(R.id.editText21);
		editText22 = (EditText) findViewById(R.id.editText22);
		editText23 = (EditText) findViewById(R.id.editText23);
		editText24 = (EditText) findViewById(R.id.editText24);
		editText25 = (EditText) findViewById(R.id.editText25);
		editText26 = (EditText) findViewById(R.id.editText26);
		editText27 = (EditText) findViewById(R.id.editText27);
		editText28 = (EditText) findViewById(R.id.editText28);
		editText29 = (EditText) findViewById(R.id.editText29);
		editText30 = (EditText) findViewById(R.id.editText30);
		editText1c = (EditText) findViewById(R.id.editText1c);
		editText2c = (EditText) findViewById(R.id.editText2c);
		editText3c = (EditText) findViewById(R.id.editText3c);
		editText4c = (EditText) findViewById(R.id.editText4c);
		editText5c = (EditText) findViewById(R.id.editText5c);
		editText6c = (EditText) findViewById(R.id.editText6c);
		editText7c = (EditText) findViewById(R.id.editText7c);
		editText8c = (EditText) findViewById(R.id.editText8c);
		editText9c = (EditText) findViewById(R.id.editText9c);
		editText10c = (EditText) findViewById(R.id.editText10c);
		editText11c = (EditText) findViewById(R.id.editText11c);
		editText12c = (EditText) findViewById(R.id.editText12c);
		editText13c = (EditText) findViewById(R.id.editText13c);
		editText14c = (EditText) findViewById(R.id.editText14c);
		editText15c = (EditText) findViewById(R.id.editText15c);
		editText16c = (EditText) findViewById(R.id.editText16c);
		editText17c = (EditText) findViewById(R.id.editText17c);
		editText18c = (EditText) findViewById(R.id.editText18c);
		editText19c = (EditText) findViewById(R.id.editText19c);
		editText20c = (EditText) findViewById(R.id.editText20c);
		editText21c = (EditText) findViewById(R.id.editText21c);
		editText22c = (EditText) findViewById(R.id.editText22c);
		editText23c = (EditText) findViewById(R.id.editText23c);
		editText24c = (EditText) findViewById(R.id.editText24c);
		editText25c = (EditText) findViewById(R.id.editText25c);
		editText26c = (EditText) findViewById(R.id.editText26c);
		editText27c = (EditText) findViewById(R.id.editText27c);
		editText28c = (EditText) findViewById(R.id.editText28c);
		editText29c = (EditText) findViewById(R.id.editText29c);
		editText30c = (EditText) findViewById(R.id.editText30c);

		SharedPreferences settings = getSharedPreferences("MyPrefs", 0);

		editText1.setText(settings.getString("nameValue1", ""));
		editText2.setText(settings.getString("nameValue2", ""));
		editText3.setText(settings.getString("nameValue3", ""));
		editText4.setText(settings.getString("nameValue4", ""));
		editText5.setText(settings.getString("nameValue5", ""));
		editText6.setText(settings.getString("nameValue6", ""));
		editText7.setText(settings.getString("nameValue7", ""));
		editText8.setText(settings.getString("nameValue8", ""));
		editText9.setText(settings.getString("nameValue9", ""));
		editText10.setText(settings.getString("nameValue10", ""));
		editText11.setText(settings.getString("nameValue11", ""));
		editText12.setText(settings.getString("nameValue12", ""));
		editText13.setText(settings.getString("nameValue13", ""));
		editText14.setText(settings.getString("nameValue14", ""));
		editText15.setText(settings.getString("nameValue15", ""));
		editText16.setText(settings.getString("nameValue16", ""));
		editText17.setText(settings.getString("nameValue17", ""));
		editText18.setText(settings.getString("nameValue18", ""));
		editText19.setText(settings.getString("nameValue19", ""));
		editText20.setText(settings.getString("nameValue20", ""));
		editText21.setText(settings.getString("nameValue21", ""));
		editText22.setText(settings.getString("nameValue22", ""));
		editText23.setText(settings.getString("nameValue23", ""));
		editText24.setText(settings.getString("nameValue24", ""));
		editText25.setText(settings.getString("nameValue25", ""));
		editText26.setText(settings.getString("nameValue26", ""));
		editText27.setText(settings.getString("nameValue27", ""));
		editText28.setText(settings.getString("nameValue28", ""));
		editText29.setText(settings.getString("nameValue29", ""));
		editText30.setText(settings.getString("nameValue30", ""));
		editText1c.setText(settings.getString("nameValue1c", ""));
		editText2c.setText(settings.getString("nameValue2c", ""));
		editText3c.setText(settings.getString("nameValue3c", ""));
		editText4c.setText(settings.getString("nameValue4c", ""));
		editText5c.setText(settings.getString("nameValue5c", ""));
		editText6c.setText(settings.getString("nameValue6c", ""));
		editText7c.setText(settings.getString("nameValue7c", ""));
		editText8c.setText(settings.getString("nameValue8c", ""));
		editText9c.setText(settings.getString("nameValue9c", ""));
		editText10c.setText(settings.getString("nameValue10c", ""));
		editText11c.setText(settings.getString("nameValue11c", ""));
		editText12c.setText(settings.getString("nameValue12c", ""));
		editText13c.setText(settings.getString("nameValue13c", ""));
		editText14c.setText(settings.getString("nameValue14c", ""));
		editText15c.setText(settings.getString("nameValue15c", ""));
		editText16c.setText(settings.getString("nameValue16c", ""));
		editText17c.setText(settings.getString("nameValue17c", ""));
		editText18c.setText(settings.getString("nameValue18c", ""));
		editText19c.setText(settings.getString("nameValue19c", ""));
		editText20c.setText(settings.getString("nameValue20c", ""));
		editText21c.setText(settings.getString("nameValue21c", ""));
		editText22c.setText(settings.getString("nameValue22c", ""));
		editText23c.setText(settings.getString("nameValue23c", ""));
		editText24c.setText(settings.getString("nameValue24c", ""));
		editText25c.setText(settings.getString("nameValue25c", ""));
		editText26c.setText(settings.getString("nameValue26c", ""));
		editText27c.setText(settings.getString("nameValue27c", ""));
		editText28c.setText(settings.getString("nameValue28c", ""));
		editText29c.setText(settings.getString("nameValue29c", ""));
		editText30c.setText(settings.getString("nameValue30c", ""));

	}

	@Override
	protected void onStop() {
		super.onStop();
		SharedPreferences settings = getSharedPreferences("MyPrefs", 0);

		SharedPreferences.Editor editor = settings.edit();
		editor.putString("nameValue1", editText1.getText().toString());
		editor.putString("nameValue2", editText2.getText().toString());
		editor.putString("nameValue3", editText3.getText().toString());
		editor.putString("nameValue4", editText4.getText().toString());
		editor.putString("nameValue5", editText5.getText().toString());
		editor.putString("nameValue6", editText6.getText().toString());
		editor.putString("nameValue7", editText7.getText().toString());
		editor.putString("nameValue8", editText8.getText().toString());
		editor.putString("nameValue9", editText9.getText().toString());
		editor.putString("nameValue10", editText10.getText().toString());
		editor.putString("nameValue11", editText11.getText().toString());
		editor.putString("nameValue12", editText12.getText().toString());
		editor.putString("nameValue13", editText13.getText().toString());
		editor.putString("nameValue14", editText14.getText().toString());
		editor.putString("nameValue15", editText15.getText().toString());
		editor.putString("nameValue16", editText16.getText().toString());
		editor.putString("nameValue17", editText17.getText().toString());
		editor.putString("nameValue18", editText18.getText().toString());
		editor.putString("nameValue19", editText19.getText().toString());
		editor.putString("nameValue20", editText10.getText().toString());
		editor.putString("nameValue21", editText21.getText().toString());
		editor.putString("nameValue22", editText22.getText().toString());
		editor.putString("nameValue23", editText23.getText().toString());
		editor.putString("nameValue24", editText24.getText().toString());
		editor.putString("nameValue25", editText25.getText().toString());
		editor.putString("nameValue26", editText26.getText().toString());
		editor.putString("nameValue27", editText27.getText().toString());
		editor.putString("nameValue28", editText28.getText().toString());
		editor.putString("nameValue29", editText29.getText().toString());
		editor.putString("nameValue30", editText30.getText().toString());
		editor.putString("nameValue1c", editText1c.getText().toString());
		editor.putString("nameValue2c", editText2c.getText().toString());
		editor.putString("nameValue3c", editText3c.getText().toString());
		editor.putString("nameValue4c", editText4c.getText().toString());
		editor.putString("nameValue5c", editText5c.getText().toString());
		editor.putString("nameValue6c", editText6c.getText().toString());
		editor.putString("nameValue7c", editText7c.getText().toString());
		editor.putString("nameValue8c", editText8c.getText().toString());
		editor.putString("nameValue9c", editText9c.getText().toString());
		editor.putString("nameValue10c", editText10c.getText().toString());
		editor.putString("nameValue11c", editText11c.getText().toString());
		editor.putString("nameValue12c", editText12c.getText().toString());
		editor.putString("nameValue13c", editText13c.getText().toString());
		editor.putString("nameValue14c", editText14c.getText().toString());
		editor.putString("nameValue15c", editText15c.getText().toString());
		editor.putString("nameValue16c", editText16c.getText().toString());
		editor.putString("nameValue17c", editText17c.getText().toString());
		editor.putString("nameValue18c", editText18c.getText().toString());
		editor.putString("nameValue19c", editText19c.getText().toString());
		editor.putString("nameValue20c", editText20c.getText().toString());
		editor.putString("nameValue21c", editText21c.getText().toString());
		editor.putString("nameValue22c", editText22c.getText().toString());
		editor.putString("nameValue23c", editText23c.getText().toString());
		editor.putString("nameValue24c", editText24c.getText().toString());
		editor.putString("nameValue25c", editText25c.getText().toString());
		editor.putString("nameValue26c", editText26c.getText().toString());
		editor.putString("nameValue27c", editText27c.getText().toString());
		editor.putString("nameValue28c", editText28c.getText().toString());
		editor.putString("nameValue29c", editText29c.getText().toString());
		editor.putString("nameValue30c", editText30c.getText().toString());
		editor.apply();

	}

	public void addListenerOnButton() {

        Button btnCompute = (Button) findViewById(R.id.button1);

		btnCompute.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {

				double c1 = editText1c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText1c.getText().toString());
				double c2 = editText2c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText2c.getText().toString());
				double c3 = editText3c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText3c.getText().toString());
				double c4 = editText4c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText4c.getText().toString());
				double c5 = editText5c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText5c.getText().toString());
				double c6 = editText6c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText6c.getText().toString());
				double c7 = editText7c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText7c.getText().toString());
				double c8 = editText8c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText8c.getText().toString());
				double c9 = editText9c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText9c.getText().toString());
				double c10 = editText10c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText10c.getText().toString());
				double c11 = editText11c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText11c.getText().toString());
				double c12 = editText12c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText12c.getText().toString());
				double c13 = editText13c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText13c.getText().toString());
				double c14 = editText14c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText14c.getText().toString());
				double c15 = editText15c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText15c.getText().toString());
				double c16 = editText16c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText16c.getText().toString());
				double c17 = editText17c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText17c.getText().toString());
				double c18 = editText18c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText18c.getText().toString());
				double c19 = editText19c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText19c.getText().toString());
				double c20 = editText20c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText20c.getText().toString());
				double c21 = editText21c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText21c.getText().toString());
				double c22 = editText22c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText22c.getText().toString());
				double c23 = editText23c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText23c.getText().toString());
				double c24 = editText24c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText24c.getText().toString());
				double c25 = editText25c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText25c.getText().toString());
				double c26 = editText26c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText26c.getText().toString());
				double c27 = editText27c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText27c.getText().toString());
				double c28 = editText28c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText28c.getText().toString());
				double c29 = editText29c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText29c.getText().toString());
				double c30 = editText30c.getText().toString().equals("") ? 0
						: Double.parseDouble(editText30c.getText().toString());

				double calcTotal = c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9
						+ c10 + c11 + c12 + c13 + c14 + c15 + c16 + c17 + c18
						+ c19 + c20 + c21 + c22 + c23 + c24 + c25 + c26 + c27
						+ c28 + c29 + c30;

                DecimalFormat num2Places = new DecimalFormat("##.00");
                String x = "$" + num2Places.format(calcTotal);


                /*double roundOff = Math.round(calcTotal * 100) / 100.00;

				// NumberFormat cF = NumberFormat.getCurrencyInstance();
				// System.out.print(cF.format(roundOff));

				DecimalFormat num2Places = new DecimalFormat("##.00");
				//String x = "$" + roundOff;

				String x = "$" + num2Places.format(roundoff);
				*/

				Toast.makeText(getApplicationContext(),
						"Go Back, Shake me! I'll clear all costs",
						Toast.LENGTH_LONG).show();

				Intent i = new Intent(v.getContext(), YourTotalIs.class);
				i.putExtra("otherLayout", String.valueOf(x));
				startActivity(i);

			}

		});
	}

	public void onReset1(View v) {

		editText1.setText(null);
		editText2.setText(null);
		editText3.setText(null);
		editText4.setText(null);
		editText5.setText(null);
		editText6.setText(null);
		editText7.setText(null);
		editText8.setText(null);
		editText9.setText(null);
		editText10.setText(null);
		editText11.setText(null);
		editText12.setText(null);
		editText13.setText(null);
		editText14.setText(null);
		editText15.setText(null);
		editText16.setText(null);
		editText17.setText(null);
		editText18.setText(null);
		editText19.setText(null);
		editText20.setText(null);
		editText21.setText(null);
		editText22.setText(null);
		editText23.setText(null);
		editText24.setText(null);
		editText25.setText(null);
		editText26.setText(null);
		editText27.setText(null);
		editText28.setText(null);
		editText29.setText(null);
		editText30.setText(null);

		editText1c.setText(null);
		editText2c.setText(null);
		editText3c.setText(null);
		editText4c.setText(null);
		editText5c.setText(null);
		editText6c.setText(null);
		editText7c.setText(null);
		editText8c.setText(null);
		editText9c.setText(null);
		editText10c.setText(null);
		editText11c.setText(null);
		editText12c.setText(null);
		editText13c.setText(null);
		editText14c.setText(null);
		editText15c.setText(null);
		editText16c.setText(null);
		editText17c.setText(null);
		editText18c.setText(null);
		editText19c.setText(null);
		editText20c.setText(null);
		editText21c.setText(null);
		editText22c.setText(null);
		editText23c.setText(null);
		editText24c.setText(null);
		editText25c.setText(null);
		editText26c.setText(null);
		editText27c.setText(null);
		editText28c.setText(null);
		editText29c.setText(null);
		editText30c.setText(null);

	}

	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	/* put this into your activity class */
	private SensorManager mSensorManager;
	private float mAccel; // acceleration apart from gravity
	private float mAccelCurrent; // current acceleration including gravity
	private float mAccelLast; // last acceleration including gravity

	private final SensorEventListener mSensorListener = new SensorEventListener() {

		public void onSensorChanged(SensorEvent se) {
			float x = se.values[0];
			float y = se.values[1];
			float z = se.values[2];
			mAccelLast = mAccelCurrent;
			mAccelCurrent = (float) Math.sqrt((double) (x * x + y * y + z * z));
			float delta = mAccelCurrent - mAccelLast;
			mAccel = mAccel * 0.9f + delta; // perform low-cut filter

			if (mAccel > 12) {
				Toast toast = Toast.makeText(getApplicationContext(),
						"Oh Yeah!!", Toast.LENGTH_SHORT);
				toast.show();

				toast.setGravity(Gravity.CENTER, 0, 0);

				editText1c.setText(null);
				editText2c.setText(null);
				editText3c.setText(null);
				editText4c.setText(null);
				editText5c.setText(null);
				editText6c.setText(null);
				editText7c.setText(null);
				editText8c.setText(null);
				editText9c.setText(null);
				editText10c.setText(null);
				editText11c.setText(null);
				editText12c.setText(null);
				editText13c.setText(null);
				editText14c.setText(null);
				editText15c.setText(null);
				editText16c.setText(null);
				editText17c.setText(null);
				editText18c.setText(null);
				editText19c.setText(null);
				editText20c.setText(null);
				editText21c.setText(null);
				editText22c.setText(null);
				editText23c.setText(null);
				editText24c.setText(null);
				editText25c.setText(null);
				editText26c.setText(null);
				editText27c.setText(null);
				editText28c.setText(null);
				editText29c.setText(null);
				editText30c.setText(null);
			}
		}

		public void onAccuracyChanged(Sensor sensor, int accuracy) {
		}
	};

	@Override
	protected void onResume() {
		super.onResume();
		mSensorManager.registerListener(mSensorListener,
				mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
				SensorManager.SENSOR_DELAY_NORMAL);

	}

	@Override
	protected void onPause() {
		mSensorManager.unregisterListener(mSensorListener);
		super.onPause();
	}

}
