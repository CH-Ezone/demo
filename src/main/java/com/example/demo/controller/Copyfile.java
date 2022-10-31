package com.example.demo.controller;


import java.io.*;

public class Copyfile {
    static String filesName="D:/pic_name.txt";
    static String formPath="D:/test";
    static String toPath="D:/test2";
    public static void main(String[] args){
        try {
            FileReader reader = new FileReader(filesName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String fileName;
            File file = new File(toPath);
            if (!file.exists()) {
                file.mkdirs();
            }
            while ((fileName = bufferedReader.readLine()) != null) {
                copy(fileName);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    static void copy(String name){
        InputStream inputStream =null;
        OutputStream outputStream=null;
        try {
             inputStream = new FileInputStream(formPath+name);
             outputStream=new FileOutputStream(toPath+"/"+name);
            byte[] bytes=new byte[inputStream.available()];
            inputStream.read(bytes);
            outputStream.write(bytes);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                outputStream.flush();
                outputStream.close();
                inputStream.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
