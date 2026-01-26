package com.bl.annotations.customannotation;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception {
        Method m = TaskManager.class.getDeclaredMethod("completeTask");
        TaskInfo t = m.getAnnotation(TaskInfo.class);
        System.out.println(t.priority() + " " + t.assignedTo());
    }
}