package com.example.wikitude;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button wikitude,ayuda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wikitude = (Button)findViewById(R.id.button);
        ayuda = (Button)findViewById(R.id.button2);

        wikitude.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), wikitude.class);
                startActivityForResult(intent, 0);
            }
        });
        ayuda.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), ayuda.class);
                startActivityForResult(intent, 0);
            }
        });
    }

}