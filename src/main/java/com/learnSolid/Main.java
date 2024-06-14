package com.learnSolid;

import java.util.ArrayList;
import java.util.List;

import com.LiskovSubstitutionPrinciple.BookFileFree;
import com.LiskovSubstitutionPrinciple.BookFileOptions;
import com.LiskovSubstitutionPrinciple.BookFilePayFee;
import com.OpenClosePrinciple.TypeFileBook;
import com.OpenClosePrinciple.TypeFileDOC;
import com.OpenClosePrinciple.TypeFilePDF;
import com.SingleResponsibilityPrinciple.Database;
import com.SingleResponsibilityPrinciple.ManageBook;

public class Main {
    public static void main(String[] args) {
        // Single Responsibility Principle
        ManageBook manageBook = new ManageBook();
        String typeBook = manageBook.get_TitleBook("SOLID Book");
        System.out.println(typeBook);
        manageBook.share_Book();
        Database database = new Database();
        database.save_Database();

        // Open-Close Principle
        TypeFileBook bookFileDOC = new TypeFileDOC();
        TypeFileBook bookFilePDF = new TypeFilePDF();
        manageBook.readFileBook(bookFileDOC, "Dang hoc");
        manageBook.readFileBook(bookFileDOC, null);

        // Liskov Substitution Principle
        List<BookFileOptions> bfo = new ArrayList<>();
        System.out.println(bfo.add(new BookFileFree()));
        System.out.println(bfo.add(new BookFilePayFee()));

        // Interface Segregation Principle

    }
}