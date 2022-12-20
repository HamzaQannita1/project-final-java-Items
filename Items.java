/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal._project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author البدر
 */
public class Items {

    static int count = 1;
    private int item_id;
    private String item_name;
    private double price;
    private int quantity;
    String itemsTypes;
    Scanner s = new Scanner(System.in);
    ArrayList<Customer> customerarr = new ArrayList<Customer>();
    Customer cu = new Customer();
    ArrayList<Items> itemsarr = new ArrayList<Items>();

    public Items() {
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Items.count = count;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getItemsTypes() {
        return itemsTypes;
    }

    public void setItemsTypes(String itemsTypes) {
        this.itemsTypes = itemsTypes;
    }

    public void additem() {
        String a = "y";
        try {
            do {
                ArrayList<Items> itemsarr = new ArrayList<Items>();
                Items items = new Items();
                Scanner s = new Scanner(System.in);
                Items.count++;
                System.out.println("item id : " + count + 1);
                items.setItem_id(count++);
                System.out.println("item name :");
                items.setItem_name(s.nextLine());
                System.out.println("enter price");
                items.setPrice(s.nextInt());
                s.nextLine();
                System.out.println("enter quantitay");
                items.setQuantity(s.nextInt());
                itemsarr.add(items);
                itemsarr.add(items);

            } while (a.equalsIgnoreCase("y"));

        } catch (Exception e) {
            System.err.println("error the add item ???");
        }

    }

    public void search_for_a_product() {
        String x = s.nextLine();
        for (int i = 0; i < itemsarr.size(); i++) {
            if (x.equalsIgnoreCase(itemsarr.get(i).item_name)) {
                System.out.println(x + " : " + "The product is available in a basket ..." + "\n" + this.toString());

            } else {
                System.out.println("no exzit");
            }
        }
        System.out.println(x + " : " + "The product is available in a basket ...");
    }

    @Override
    public String toString() {
        return "Items{" + "item_id=" + item_id + ", item_name=" + item_name + ", price=" + price + ", quantity=" + quantity + '}';
    }

}
