package com.example.admin.myapp_lesson4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 整数型の変数をnumという名前で作成して、10を代入する
        int num = 10;
        Log.d("javatest", String.valueOf(num));

        // numに50を代入する
        num = 50;
        Log.d("javatest", String.valueOf(num));
    }
}
