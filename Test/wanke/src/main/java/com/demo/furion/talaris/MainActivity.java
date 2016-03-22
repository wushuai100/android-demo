package com.demo.furion.talaris;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Map;

public class MainActivity extends AppCompatActivity {
    //    private static final String tag = "Mainactivity";
    private EditText et_name;
    private EditText et_userpassword;
    private CheckBox et_check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Log.v(tag, "我是V级别");
//        Log.i(tag, "我是i级别");
//        Log.d(tag,"我是d级别");
//        Log.w(tag,"我是w级别");
//        Log.e(tag,"我是e级别");
//        System.out.println("hahaha ");
        et_name = (EditText) findViewById(R.id.et_username);
        et_userpassword = (EditText) findViewById(R.id.et_userpassword);
        et_check = (CheckBox) findViewById(R.id.eb_ischeck);
        Map<String, String> maps = UserInfoUtils.readInfo(MainActivity.this);
        if (maps != null) {
            String name = maps.get("name");
            String pwd = maps.get("pwd");
            et_name.setText(name);
            et_userpassword.setText(pwd);
        }
    }

    public void login(View v) {
        String name = et_name.getText().toString().trim();
        String pwd = et_userpassword.getText().toString().trim();
        if (TextUtils.isEmpty(name) || TextUtils.isEmpty(pwd)) {
            Toast.makeText(MainActivity.this, "不能为空", Toast.LENGTH_SHORT).show();
        } else {
            System.out.println("dfdsfdsfdsfsdfdsfds");
        }
        if (et_check.isChecked()) {
            boolean result = UserInfoUtils.saveInfo(MainActivity.this,name, pwd);
            if (result) {
                Toast.makeText(MainActivity.this, "保存成功", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "保存失败", Toast.LENGTH_SHORT).show();

            }

        } else {
            Toast.makeText(MainActivity.this, "勾选钩钩吧，亲", Toast.LENGTH_SHORT).show();
        }


    }
}
