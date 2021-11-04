package com.example.tugasuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity3 extends AppCompatActivity {
    private Button btn_home;
    private TextView tvNama, tvNim, tvNilai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        btn_home= findViewById(R.id.btn_home);
        setContentView(R.layout.activity_main3);

        tvNama = findViewById(R.id.tv_nama);
        tvNim = findViewById(R.id.tv_nim);
        tvNilai = findViewById(R.id.tv_nilai);

        Intent intent = getIntent();

        String terimaNama = intent.getStringExtra("nama");
        String terimaNim = intent.getStringExtra("nim");
        String terimaNilai = intent.getStringExtra("nilaii");


        tvNama.setText(terimaNama);
        tvNim.setText(terimaNim);
        tvNilai.setText(terimaNilai);

    }
    public void Home(View view) {
        Intent intent = new Intent(MainActivity3.this, MainActivity.class);
        startActivity(intent);
    }
}