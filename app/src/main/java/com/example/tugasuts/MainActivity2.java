package com.example.tugasuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity2 extends AppCompatActivity {
    private Button btnSubmit;
    private EditText etNama, etNIM, etNilai;
    String hasilConvert;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        etNama = findViewById(R.id.et_nama);
        etNIM = findViewById(R.id.et_nim);
        etNilai = findViewById(R.id.et_nilai);

        btnSubmit = findViewById(R.id.btn_submit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sNilai = etNilai.getText().toString().trim();
                    String sNama = etNama.getText().toString().trim();
                    String sNim = etNIM.getText().toString().trim();

                    if (sNama.trim().equals("")) {
                        etNama.setError("Nama Tidak Boleh Kosong");
                    } else if (sNim.trim().equals("")) {
                        etNIM.setError("NIM Tidak Boleh Kosong");
                    } else if (sNilai.trim().equals("")) {
                        etNilai.setError("Nilai Tidak Boleh Kosong");
                    } else {
                        double nilai = Double.parseDouble(sNilai);

                        if (nilai >= 80 && nilai <= 100) {
                            hasilConvert = String.valueOf('A');


                        }  else if (nilai >= 70 && nilai < 80) {
                            hasilConvert = "B";

                        }  else if (nilai >= 60 && nilai < 70) {
                            hasilConvert = "C";

                        }  else if (nilai >= 40 && nilai < 60) {
                            hasilConvert = "D";

                        } else {
                            etNilai.setError("Masukkan nilai yang benar!");
                        }

                        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);

                        intent.putExtra("nama", sNama);
                        intent.putExtra("nim", sNim);
                        intent.putExtra("nilaii", hasilConvert);

                        startActivity(intent);
                    }
                } catch (Exception nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
