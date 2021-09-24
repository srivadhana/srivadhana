package com.logics;

public class ReverseStringUsingStringBuffer {
	public static void main(String[] args) {
		 
        String blogName = "java2blog";
        StringBuffer sb = new StringBuffer(blogName);
        System.out.println("Reverse of java2blog is:" + sb.reverse());
 
    }
}
