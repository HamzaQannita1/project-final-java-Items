/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal._project;

import java.util.ArrayList;
import java.util.Scanner;
import static pkgfinal._project.Items.count;

/**
 *
 * @author البدر
 */
public class Book extends Items {

    private String AuthorName;
    private String Laguage;

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String AuthorName) {
        this.AuthorName = AuthorName;
    }

    public String getLaguage() {
        return Laguage;
    }

    public void setLaguage(String Laguage) {
        this.Laguage = Laguage;
    }

    public void addBook() {
        try {
            String bool= "y";
            ArrayList<Items> itemsarr = new ArrayList<>();
            Book book = new Book();
            //   Items items = new Items();
            Scanner s = new Scanner(System.in);
            System.out.println("item id :" + book.getItem_id());
            System.out.println("item name :");
            book.setItemsTypes("book");
            book.setItem_id(count+1);
            book.setItem_name(s.nextLine());
            System.out.println("enter price :");
            book.setPrice(s.nextInt());
            s.nextLine();
            System.out.println("enter quantitay :");
            book.setQuantity(s.nextInt());
            s.nextLine();
            System.out.println("please enter  AuthorName : ");
            book.setAuthorName(s.nextLine());
            System.out.println("please enter  Laguage : ");
            book.setLaguage(s.nextLine());
            System.out.println(itemsarr);
            itemsarr.add(book);
            System.out.println(itemsarr);
            
            
        } catch (Exception e) {
            System.err.println("Error AddBook !!!");
            System.out.println(e);
        }

    }

    @Override
    public String toString() {
        return super.toString() + "AuthorName :" + this.AuthorName + "Laguage :" + this.Laguage;
    }

}
