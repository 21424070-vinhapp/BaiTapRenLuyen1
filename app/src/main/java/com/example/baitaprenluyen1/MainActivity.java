package com.example.baitaprenluyen1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button mBtnCapNhat, mBtnLamLai;
    EditText mEdtCMND, mEdtDienThoai, mEdtDiaChi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();

        mBtnLamLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEdtDienThoai.setText("");
                mEdtDiaChi.setText("");
                mEdtCMND.requestFocus();
            }
        });


        mBtnCapNhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Dữ liệu đã được cập nhật", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void addControls() {
        mEdtCMND=findViewById(R.id.edtCMND);
        mEdtDiaChi=findViewById(R.id.edtDiaChi);
        mEdtDienThoai=findViewById(R.id.edtDienThoai);
        mBtnCapNhat=findViewById(R.id.btnCapNhat);
        mBtnLamLai=findViewById(R.id.btnLamLai);
    }



}