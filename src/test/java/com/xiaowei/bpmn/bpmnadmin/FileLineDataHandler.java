package com.xiaowei.bpmn.bpmnadmin;

import java.io.UnsupportedEncodingException;

public class FileLineDataHandler implements DataProcessHandler {
    private String encode = "GBK";
    @Override
    public void process(byte[] data) {
        try {
            System.out.println(Thread.currentThread().getName() + ":" + new String(data, encode).toString());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
