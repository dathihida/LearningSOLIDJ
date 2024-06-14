package com.OpenClosePrinciple;

import com.SingleResponsibilityPrinciple.ManageBook;

public class TypeFileDOC implements TypeFileBook {

    @Override
    public void read_Book(String typeDOC) {
        // TODO Auto-generated method stub
        if (typeDOC == null) {
            System.out.println("All book");
        } else {
            System.out.println("Book file type doc");
        }
    }

    @Override
    public void note_Book(String idBook, Integer rowBook, Integer page, String note) {
        // TODO Auto-generated method stub
        System.out.println(note);
    }

}
