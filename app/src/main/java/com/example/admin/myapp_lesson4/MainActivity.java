package com.example.admin.myapp_lesson4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //名前をポチ、年齢3才で、Dogのインスタンスを作成する。
        Dog dog = new Dog("ポチ", 3);

        dog.move();

    }

}
