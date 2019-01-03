package com.shxt.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        Properties pro = new Properties();
        InputStream is = PropertiesTest.class.getClassLoader().getResourceAsStream("config.properties");
        try {
            pro.load(is);
            System.out.println(pro.getProperty("helena"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
