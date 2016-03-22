package com.demo.furion.talaris;

import android.content.Context;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sony on 2016/3/20.
 */
public class UserInfoUtils {
    public static boolean saveInfo(Context context,String username, String pwd) {
        try {
//            String path = context.getFilesDir().getPath();

            String result = username + "##" + pwd;
//            File file = new File(path,"userfile");
//            FileOutputStream fos = new FileOutputStream(file);
            FileOutputStream fos = context.openFileOutput("userfile",0);
            fos.write(result.getBytes());
            fos.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Map<String, String> readInfo(Context context) {
        try {
            Map<String, String> maps = new HashMap<String, String>();
//            String path = context.getFilesDir().getPath();

//            File file = new File(path,"userfile");
//            FileInputStream fis = new FileInputStream(file);
            FileInputStream fis = context.openFileInput("userfile");
            BufferedReader buf = new BufferedReader(new InputStreamReader(fis));
            String content = buf.readLine();
            String[] splits = content.split("##");
            String name = splits[0];
            String pwd = splits[1];
            maps.put("name", name);
            maps.put("pwd", pwd);
            fis.close();
            return maps;
        } catch (Exception e) {

        }

        return null;

    }
}
