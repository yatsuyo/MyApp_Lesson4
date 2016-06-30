package com.example.admin.myapp_lesson4;

import android.util.Log;
/**
 * Created by admin on 2016/07/01.
 */
public class Human extends Animal implements Movable{

    // クラス変数
    static String to_jp = "人";

    // コンストラクタ
    public Human(String name, int age, String hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    // クラス関数
    public static  void introduce(){
        Log.d("javatest", "これは人クラスです。");
    }

    // メンバ関数
    public void say(){
        Log.d("javatest", "「私の名前は" + this.name + "です。" + "年は" + this.age + "歳です。」");
    }

    @Override
    public void think(){
        Log.d("javatest", "私は" + this.hobby + "について考える。");
    }
}
