package com.bl.functionalinterface.markerinterface.cloneobject;
public class Product implements Cloneable {
    int id = 101;

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
