package com.example.myorders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class refundUpdate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refund_update);
    }
    public void updateRefund(View view) {

        Intent intent2 = new Intent( refundUpdate.this , MainActivity.class);
        Toast.makeText(this, "Successfully Updated", Toast.LENGTH_SHORT).show();
        startActivity(intent2);
    }
}
