package com.example.backendlessdev.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by backendlessdev on 7/13/15.
 */
public class LastActivity extends Activity {


    private TextView email2;
    private TextView password2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        email2 = (TextView) findViewById(R.id.email2);
        password2 = (TextView) findViewById(R.id.pass2);

        email2.setText(getIntent().getStringExtra("email"));
        password2.setText(getIntent().getStringExtra("password"));

    }

    public void goBack(View view) {
     Intent intent = new Intent(this, MainActivity.class);
     startActivity(intent);

    }
}
