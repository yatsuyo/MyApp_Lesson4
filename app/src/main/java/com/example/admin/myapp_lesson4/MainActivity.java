package com.example.admin.myapp_lesson4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int num = 60;

        if(num >= 90){
            Log.d("javatest", "優");
        }else if (num > 75){
            Log.d("javatest", "良");
        }else if (num >= 60){
            Log.d("javatest", "可");
        }else{
            Log.d("javatest", "不可");
        }

    }

}
