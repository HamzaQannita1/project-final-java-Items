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
public class Shoes extends Items {

    private String Color;
    private double Size;
    private String style;

    public Shoes() {
    }
    

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public double getSize() {
        return Size;
    }

    public void setSize(double Size) {
          this.Size = Size;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void addShoes() {
        try {
            ArrayList<Items> itemsarr = new ArrayList<>();
        Shoes shoes = new Shoes();
        Scanner s = new Scanner(System.in);
        shoes.setItemsTypes("game");
        shoes.setItem_id(count++);
        System.out.println("item id " + shoes.getItem_id());
        System.out.println("item name :");
        shoes.setItem_name(s.nextLine());
        System.out.println("enter price");
        shoes.setPrice(s.nextInt());
        s.nextLine();
        System.out.println("enter quantitay");
        shoes.setQuantity(s.nextInt());
        s.nextLine();
        System.out.println("please enter Color : ");
        shoes.setColor(s.nextLine());
        System.out.println("please enter  Size : ");
        shoes.setSize(s.nextDouble());
        System.out.println("please enter  style :");
        s.nextLine();
        shoes.setStyle(s.nextLine());
        itemsarr.add(shoes);
        System.out.println(itemsarr);
        } catch (Exception e) {
            System.err.println("Error AddShoes !!!");
            System.out.println(e);
        }
         
    }

    @Override
    public String toString() {
        return super.toString()+ "Shoes{" + "Color=" + Color + ", Size=" + Size + ", style=" + style + '}';
    }

   
  
}
