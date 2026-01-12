package com.bl.day1.tabhistorymanager;

public class App {
    public static void main(String[] args) {
        BrowserBuddy browser = new BrowserBuddy();

        browser.open("google.com");
        browser.open("github.com");
        browser.open("stackoverflow.com");

        browser.show();

        browser.back();
        browser.show();

        browser.forward();
        browser.show();

        browser.closeTab();

        browser.restoreTab();
        browser.show();
       
        
    }
    
}
