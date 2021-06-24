package com.zerokaraapp.sampleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button2 = findViewById(R.id.btActivity2);
        BtClickListener2 listener = new BtClickListener2();
        button2.setOnClickListener(listener);
    }

    private class BtClickListener2 implements View.OnClickListener{
        @Override
        public void onClick(View view){
            finish();
        }

    }
}