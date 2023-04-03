package com.corejava.java5.annotation;

import java.lang.annotation.Native;

/*
 * indicates the annotated field is a constant that may be referenced from the native code
 */

public class NativeTest {

    @Native public static final int MIN_VALUE = 0x80000000;
    // omitted
}
