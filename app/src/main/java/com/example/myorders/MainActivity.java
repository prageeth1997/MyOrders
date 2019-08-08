package com.example.myorders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void refundNavigrate(View view) {

        Intent intent2 = new Intent(MainActivity.this , refund.class);
        startActivity(intent2);
    }
    public void refundUpdateNavigrate(View view) {
        Intent intent2 = new Intent(MainActivity.this , viewRefund.class);
        startActivity(intent2);

    }
}
