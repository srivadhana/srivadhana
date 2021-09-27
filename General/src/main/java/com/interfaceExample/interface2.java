package com.interfaceExample;
public interface interface2  extends interface1{
	default void foo() {
		System.out.println("Inside Interface2");
	}
}
