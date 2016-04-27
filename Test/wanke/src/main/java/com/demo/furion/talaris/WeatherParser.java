package com.demo.furion.talaris;

import android.util.Xml;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sony on 2016/4/24.
 */
public class WeatherParser {
    public static List<Channel> parserXml(InputStream in) throws Exception{
        List<Channel> weatherLists = null;
        Channel channel = null;
        XmlPullParser parser = Xml.newPullParser();
        parser.setInput(in,"utf-8");
        int type = parser.getEventType();
        while (type!= XmlPullParser.END_DOCUMENT){
            switch(type){
                case XmlPullParser.START_TAG:
                    if ("weather".equals(parser.getName())){
                        weatherLists = new ArrayList<Channel>();

                    }else  if ("channel".equals(parser.getName())){
                        channel = new Channel();
                        String id = parser.getAttributeValue(0);
                        channel.setId(id);
                    }else if("city".equals(parser.getName())){
                        String city = parser.nextText();
                        channel.setCity(city);
                    }else if("temp".equals(parser.getName())){
                        String temp = parser.nextText();
                        channel.setCity(temp);
                    }else if("wind".equals(parser.getName())){
                        String wind = parser.nextText();
                        channel.setCity(wind);
                    }else if("pm250".equals(parser.getName())){
                        String pm250 = parser.nextText();
                        channel.setCity(pm250);
                    }

                    break;
                case XmlPullParser.END_TAG:
                    if("channel".equals(parser.getName())){
                        weatherLists.add(channel);
                    }
                default:
                    break;
            }
            type = parser.next();
        }

        return weatherLists;
    }
}
