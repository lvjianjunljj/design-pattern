package com.builder;

public class BuilderTest {
	public static void main(String[] args) {  
        Builder builder = new Builder();  
        builder.produceMailSender(5);  
        builder.produceSmsSender(5);  
        builder.print();
    }  
}
