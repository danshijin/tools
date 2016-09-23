package com.smm.tools.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

/**
 * 远程接口请求辅助类
 * Created by zhenghao on 2015/9/15.
 */
public class URLRequest {


    /**
     * 发送get请求
     * @param url  请求地址
     * @param parameters  请求参数
     * @return 返回请求结果
     * @throws Exception
     */
    public static String get(String url,Map<String,String> parameters) throws Exception{

        StringBuilder remote_url=new StringBuilder();

        remote_url.append(url).append("?1=1");

        //处理请求参数
        for(Map.Entry<String,String> entry: parameters.entrySet()){

            remote_url.append("&").append(entry.getKey()).append("=").append(URLEncoder.encode(entry.getValue(),"UTF-8"));

        }

        //发送请求
        URL remote=new URL(remote_url.toString());

        HttpURLConnection connection= (HttpURLConnection) remote.openConnection();

        //设置超时时间
        connection.setConnectTimeout(5 * 1000);

        //设置请求方式
        connection.setRequestMethod("GET");

        //接收返回值
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;

        String result = "";

        while ((line = in.readLine()) != null) {
            result += line;
        }

        return result;

    }


    /**
     * 发送post请求
     * @param url           接口地址
     * @param parameters    请求参数
     * @return              返回处理结果
     * @throws Exception
     */
    public static String post(String url,Map<String,String> parameters) throws Exception{


        URL remote = new URL(url);

        HttpURLConnection connection = (HttpURLConnection) remote.openConnection();

        // 提交模式
        connection.setRequestMethod("POST");
        //设置超时时间
        connection.setConnectTimeout(5 * 1000);

        // 是否输入参数
        connection.setDoOutput(true);

        //处理请求参数
        StringBuilder params=new StringBuilder();

        params.append("1=1");

        for(Map.Entry<String,String> entry: parameters.entrySet()){

            params.append("&").append(entry.getKey()).append("=").append(URLEncoder.encode(entry.getValue(),"UTF-8"));

        }

        byte[] bypes = params.toString().getBytes();

        // 输入参数
        connection.getOutputStream().write(bypes);

        //读取返回值
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;

        String result = "";

        while ((line = in.readLine()) != null) {
            result += line;
        }

        return result;

    }
}
