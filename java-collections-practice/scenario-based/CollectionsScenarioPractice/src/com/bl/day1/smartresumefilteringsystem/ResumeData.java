package com.bl.day1.smartresumefilteringsystem;
public class ResumeData {
    String email;
    String phone;
    int keywordCount;

    ResumeData(String email, String phone, int keywordCount) {
        this.email = email;
        this.phone = phone;
        this.keywordCount = keywordCount;
    }

    @Override
    public String toString() {
        return email + " | " + phone + " | Keywords: " + keywordCount;
    }
}
