package com.example.myorders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class viewRefund extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_refund);
    }

    public void updateRefund(View view) {

        Intent intent1 = new Intent( viewRefund.this , refundUpdate.class);

        startActivity(intent1);
    }

    public void deleteRefund(View view) {

        Intent intent2 = new Intent( viewRefund.this , MainActivity.class);
        Toast.makeText(this, "Successfull", Toast.LENGTH_SHORT).show();
        startActivity(intent2);
    }
}
