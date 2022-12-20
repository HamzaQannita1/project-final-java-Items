package pkgfinal._project;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author البدر
 */
public class Customer {

    private int Customer_NO;
    private String Customer_Name;
    double Total;
    private Items item;
    ArrayList<Items> Shoopingcart = new ArrayList<Items>();
    ArrayList<Customer> customerarr = new ArrayList<Customer>();
    ArrayList<Items> itemsarr = new ArrayList<Items>();

    Scanner s = new Scanner(System.in);

    public Customer() {

    }

    public ArrayList<Items> getShoopingcart() {
        return Shoopingcart;
    }

    public void setShoopingcart(ArrayList<Items> Shoopingcart) {
        this.Shoopingcart = Shoopingcart;
    }

    public int getCustomer_NO() {
        return Customer_NO;
    }

    public void setCustomer_NO(int Customer_NO) {
        this.Customer_NO = Customer_NO;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public void setCustomer_Name(String Customer_Name) {
        this.Customer_Name = Customer_Name;
    }

    public Items getItem() {
        return item;
    }

    public void setItem(Items item) {
        this.item = item;
    }

    public void addCustomer() {
        try {
            Customer n = new Customer();
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter Name  :");

            n.setCustomer_Name(input.nextLine());
            customerarr.add(n);
            System.out.println(customerarr);

        } catch (Exception e) {
            System.out.println("Error AddCustomer !!!");
        }

    }

    public void Add_a_cart_to_customer() {
        try {
            ArrayList<Items> Shopping = new ArrayList<>();
            Customer specified_customer = new Customer();
            specified_customer = customerarr.get(specified_customer.getCustomer_NO());
            System.out.println("The customer :" + specified_customer);
            System.out.println(itemsarr);
            System.out.println("please enter which _item_ !!");
            int custmoerItem = s.nextInt() - 1;
            s.nextLine();
            System.out.println("please enter which  _Quantity_ !! ");
            int quantityCustomer = s.nextInt();
            s.nextLine();
            if (quantityCustomer > itemsarr.get(custmoerItem).getQuantity()) {
                System.out.println("The quantity entered is greater than the quantity supplied. ");
                System.out.println(customerarr);
            } else {
                itemsarr.get(custmoerItem).setQuantity((int) (itemsarr.get(custmoerItem).getQuantity() - quantityCustomer));
                Shopping.add(itemsarr.get(custmoerItem));
                specified_customer.Total = itemsarr.get(custmoerItem).getPrice() * quantityCustomer;

                specified_customer.setShoopingcart(Shoopingcart);
                System.out.println(specified_customer.Shoopingcart);
                System.out.println(customerarr);
            }
        } catch (Exception e) {
            System.out.println("Error Add a  cart to customer ???");
            System.out.println(e);
        }
    }

    public void View() {
        String print = "Item no       Item name       Available Quantity       Unit pric       Item Type";
        double Total_Price = 0;
        for (int i = 0; i < customerarr.size(); i++) {
            double Quan = itemsarr.get(i).getQuantity();
            double Total = Quan * itemsarr.get(i).getPrice();
            Total_Price += Total;
            print += "\n" + itemsarr.get(i).getItem_id() + "       " + itemsarr.get(i).getItem_name() + "       " + Quan + "       " + itemsarr.get(i).getPrice();
            System.out.println(this.toString());
            System.out.println("                                                                                                                                          TOtal Price :  " + Total_Price);
        }
        System.out.println(print);

        System.out.println(customerarr);
        System.out.println("    ");
        System.out.println("                                                                                                                                          TOtal Price :  " + Total_Price);
    }

    public void removeExtraItems() {
        try {
            int num1 = s.nextInt() - 1;
            for (int i = 0; i < itemsarr.size(); i++) {
                itemsarr.remove(num1);
            }
        } catch (Exception e) {
            System.err.println("error the removeExtraItems  ???");
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return "Customer{" + "Customer_NO=" + Customer_NO + ", Customer_Name=" + Customer_Name + '}';
    }
}
