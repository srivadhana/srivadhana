package com.functional_interface;


public interface Function<T,R> {
	R apply(T t);
	//T – Type of the input to the function.
	//R – Type of the result of the function.
}
