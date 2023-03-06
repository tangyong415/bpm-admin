package com.xiaowei.bpmn.bpmnadmin;

public class MultiThreadReadByLine {
    public static void main(String[] args){
        FileReader fileReader = new FileReader("/Users/a/Documents/test1.txt",100,3);
        fileReader.registerHanlder(new FileLineDataHandler());
        fileReader.startRead();
    }
}
