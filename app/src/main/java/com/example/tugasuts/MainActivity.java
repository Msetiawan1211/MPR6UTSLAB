package com.example.tugasuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button tombol,klik;
    Intent pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tombol = (Button)findViewById(R.id.ke_layout_2);
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pindah = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(pindah);
                finish();
            }
          });
        klik = (Button)findViewById(R.id.ke_layout_3);
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pindah = new Intent(MainActivity.this,MainActivity4.class);
                startActivity(pindah);
                finish();
            }
        });
        }
    }
