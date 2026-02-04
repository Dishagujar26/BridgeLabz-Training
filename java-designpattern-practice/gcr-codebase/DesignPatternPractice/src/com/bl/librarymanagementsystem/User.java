package com.bl.librarymanagementsystem;
interface User extends Observer {
    void showRole();
    int getBorrowLimit();
}