package com.OpenClosePrinciple;

import com.SingleResponsibilityPrinciple.ManageBook;

public class TypeFilePDF implements TypeFileBook {

    @Override
    public void read_Book(String typePDF) {
        // TODO Auto-generated method stub
        if (typePDF == null) {
            System.out.println("All book");
        } else {
            System.out.println("Book file type pdf");
        }
    }

    @Override
    public void note_Book(String idBook, Integer rowBook, Integer page, String note) {
        // TODO Auto-generated method stub

    }

}
