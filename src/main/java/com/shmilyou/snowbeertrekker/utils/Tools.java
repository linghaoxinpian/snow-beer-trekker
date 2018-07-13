package com.shmilyou.snowbeertrekker.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Tools {
    public static String printStackTraceToString(Throwable throwable){
        StringWriter stringWriter=new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringWriter,true));
        return stringWriter.getBuffer().toString();
    }
}
