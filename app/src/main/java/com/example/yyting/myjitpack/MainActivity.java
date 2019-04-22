package com.example.yyting.myjitpack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.yyting.myjitpacklibrary.JitpackUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("hgk", "========="+JitpackUtil.getJitpackWorld()) ;
    }
}
