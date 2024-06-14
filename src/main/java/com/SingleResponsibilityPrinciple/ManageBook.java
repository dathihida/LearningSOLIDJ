package com.SingleResponsibilityPrinciple;

import com.OpenClosePrinciple.TypeFileBook;

public class ManageBook {
    public String get_TitleBook(String type) {
        return type;
    }

    public void share_Book() {
        System.out.println("Share Book");
    }

    public String read_Book(String name, String typeFile) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name);
        stringBuilder.append(" ");
        stringBuilder.append(typeFile);
        return stringBuilder.toString();
    }

    // public void save_Database() {
    // System.out.println("Save Database");
    // }

    public void readFileBook(TypeFileBook file, String note) {
        file.read_Book(note);
    }
}
