package com.bl.lambdaexpression.smarthomelighting;

@FunctionalInterface
public interface LightAction {
    void activate(int brightness, String color);
}