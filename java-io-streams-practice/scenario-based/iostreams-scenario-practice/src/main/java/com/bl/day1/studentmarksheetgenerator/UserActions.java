package com.bl.day1.studentmarksheetgenerator;

public class UserActions {

    @AuditTrail(event = "USER_LOGIN")
    public void login() {}

    @AuditTrail(event = "FILE_UPLOAD")
    public void uploadFile() {}

    public void viewProfile() {} // Not audited

    @AuditTrail(event = "FILE_DELETE")
    public void deleteFile() {}
}
