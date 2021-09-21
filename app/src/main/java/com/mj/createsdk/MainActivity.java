package com.mj.createsdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mj.mylibrary.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toaster.simpleToast(this,"THis is my library");
    }
}