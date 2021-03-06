package com.corejava.java5.generics;

interface GenericInterface<T1, T2> {

	T2 doSomeOperation(T1 t);

	T1 doReverseOperation(T2 t);
}
