package com.example.myorders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class refund extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refund);
    }
    public void partialRefund(View view) {

        TextView txt1 = findViewById(R.id.editText3);
        TextView txt2 = findViewById(R.id.textView17);
        RadioButton rdbtn1 = findViewById(R.id.radioButton1);
        txt1.setVisibility(View.VISIBLE);
        txt2.setVisibility(View.VISIBLE);
        rdbtn1.setChecked(false);

    }
    public void fullRefund(View view) {

        TextView txt1 = findViewById(R.id.editText3);
        TextView txt2 = findViewById(R.id.textView17);
        RadioButton rdbtn2 = findViewById(R.id.radioButton2);
        txt1.setVisibility(View.INVISIBLE);
        txt2.setVisibility(View.INVISIBLE);
        rdbtn2.setChecked(false);

    }

    public void Refund(View view) {

        Intent intent2 = new Intent( refund.this , MainActivity.class);
        Toast.makeText(this, "Request Sent Successfully", Toast.LENGTH_SHORT).show();
        startActivity(intent2);
    }



}

