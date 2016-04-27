package com.demo.furion.talaris;

import android.content.SharedPreferences;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.xmlpull.v1.XmlSerializer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Formattable;
import java.util.Formatter;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
//    private static final String tag = "Mainactivity";
//    private EditText et_name;
//    private EditText et_userpassword;
//    private CheckBox et_check;
//    List<Sms> smslist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            TextView tv_weather = (TextView)findViewById(R.id.tv_weather);
            InputStream inputStream = getResources().getAssets().open("weather.xml");
            List<Channel> weatherlists = WeatherParser.parserXml(inputStream);
            StringBuffer sb = new StringBuffer();
            for (Channel channel : weatherlists){
                sb.append(channel.toString());

            }
            tv_weather.setText(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }


//        for (int i = 0; i < 10; i++) {
//            Sms sms = new Sms();
//            sms.setAddress("1wushuaiwanke502");
//            sms.setBody("i love you");
//            sms.setDate("2015");
//            smslist.add(sms);
//        }
    }
}

//    public void click(View v) {
//        try {
//            XmlSerializer serializer = Xml.newSerializer();
//            File file = new File(Environment.getExternalStorageDirectory().getPath(), "smsbackup2.xml");
//            FileOutputStream fos = new FileOutputStream(file);
//            serializer.setOutput(fos, "utf-8");
//            serializer.startDocument("utf-8", true);
//            serializer.startTag(null, "smss");
//            for (Sms sms : smslist) {
//                serializer.startTag(null, "sms");
//                serializer.startTag(null, "address");
//                serializer.text(sms.getAddress());
//                serializer.endTag(null, "address");
//
//                serializer.startTag(null, "body");
//                serializer.text(sms.getBody());
//                serializer.endTag(null, "body");
//
//                serializer.startTag(null, "date");
//                serializer.text(sms.getDate());
//                serializer.endTag(null, "date");
//                serializer.endTag(null, "sms");
//            }
//            serializer.endTag(null, "smss");
//
//            serializer.endDocument();
//            fos.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }
//
//    }
//        StringBuffer sb = new StringBuffer();
//        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
//        sb.append("<smss>");
//        for (Sms sms : smslist) {
//            sb.append("<sms>");
//            sb.append("<address>");
//            sb.append(sms.getAddress());
//            sb.append("</address>");
//            sb.append("<body>");
//            sb.append(sms.getBody());
//            sb.append("</body>");
//            sb.append("<date>");
//            sb.append(sms.getDate());
//            sb.append("</date>");
//            sb.append("</sms>");
//        }
//        sb.append("</smss>");
//        try{
//        File file = new File(Environment.getExternalStorageDirectory().getPath(),"smsback.xml");
//        FileOutputStream fos = new FileOutputStream(file);
//        fos.write(sb.toString().getBytes());
//        fos.close();
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
//
//
//    }

//        SharedPreferences sp = getSharedPreferences("config", 0);


//        et_name = (EditText) findViewById(R.id.et_username);
//
//        et_userpassword = (EditText) findViewById(R.id.et_userpassword);
//
//        et_check = (CheckBox) findViewById(R.id.eb_ischeck);
//        String name = sp.getString("name", "");
//        String pwd = sp.getString("pwd", "");
//        Boolean is_checked = sp.getBoolean("is_checked",false);
//        et_name.setText(name);
//        et_userpassword.setText(pwd);
//        et_check.setChecked(is_checked);


//    public void login(View v) {
//        String name = et_name.getText().toString().trim();
//        String pwd = et_userpassword.getText().toString().trim();
//        if (TextUtils.isEmpty(name) || TextUtils.isEmpty(pwd)) {
//            Toast.makeText(MainActivity.this, "不能为空", Toast.LENGTH_SHORT).show();
//        } else {
//            System.out.println("dfdsfdsfdsfsdfdsfds");
//        }
//        if (et_check.isChecked()) {
//            //使用shareparence
//            /*
//            * */
//            SharedPreferences sp = getSharedPreferences("config", 0);
//            SharedPreferences.Editor edit = sp.edit();
//            edit.putBoolean("checkbox",true);
//            edit.putString("name", name);
//            edit.putString("pwd", pwd);
//            edit.commit();
//
//
//        } else {
//            Toast.makeText(MainActivity.this, "勾选钩钩吧，亲", Toast.LENGTH_SHORT).show();
//        }
//
//
//    }
//}
