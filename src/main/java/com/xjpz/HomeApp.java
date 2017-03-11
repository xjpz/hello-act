package com.xjpz;

import act.Act;
import org.osgl.mvc.annotation.GetAction;

/**
 * Hello world!
 */
public class HomeApp {

    @GetAction
    public void home() {
    }

    public static void main(String[] args) throws Exception {
        Act.start("hello-act", "com.xjpz");
    }
}
