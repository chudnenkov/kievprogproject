package com.example.roman.kievprog_1;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity{ //ActionBarActivity {

    static String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_main);
        Log.i("TAG",  "tes");

        LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

      //  View v = vi.inflate(R.layout.one_item, null);

        LinearLayout insertPoint = (LinearLayout) findViewById(R.id.container);

        for (int i = 0; i<20; i++ ) {
            View v = vi.inflate(R.layout.one_item, null);

            TextView textView = (TextView) v.findViewById(R.id.textView32);
            textView.setText("Item" + String.valueOf(i));
            TextView textView2 = (TextView) v.findViewById(R.id.textView33);
            textView2.setText("Description of Item" + String.valueOf(i));

            insertPoint.addView(v, i);

        }
    }


}
