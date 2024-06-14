package com.InterfaceSegregationPrinciple;

public class Staff implements UpdateBook, ReadBook {

    String idBook;
    String type;

    @Override
    public void updateBook(String idBook, String type) {
        // TODO Auto-generated method stub

    }

    @Override
    public void openBook() {
        // TODO Auto-generated method stub

    }

    @Override
    public void readBook() {
        // TODO Auto-generated method stub

    }

}
