package com.bl.functionalinterface.markerinterface.cloneobject;
public class CloneMain {
    public static void main(String[] args) throws Exception {

        Product p1 = new Product();
        Product p2 = (Product) p1.clone();

        System.out.println(p1.id);
        System.out.println(p2.id);
    }
}
