package com.singleton;

import java.util.Vector;

public class Singleton7 {
	private static Singleton7 instance = null;  
    private Vector properties = null;  
  
    public Vector getProperties() {  
        return properties;  
    }  
  
    private Singleton7() {  
    }  
  
    private static synchronized void syncInit() {  
        if (instance == null) {  
            instance = new Singleton7();  
        }  
    }  
  
    public static Singleton7 getInstance() {  
        if (instance == null) {  
            syncInit();  
        }  
        return instance;  
    }  
  
    public void updateProperties() {  
        Singleton7 shadow = new Singleton7();  
        properties = shadow.getProperties();  
    }  
}
