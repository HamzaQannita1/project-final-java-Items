package pkgfinal._project;

import java.util.Scanner;
/**
 *
 * @author البدر
 */
public class Final_Project {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Items items = new Items();
        String typa = s.nextLine();
        Game game = new Game();
        Book book = new Book();
        Shoes shoes = new Shoes();
        Customer customer = new Customer();
        System.out.println("=================Store System Menu==================");
        System.out.println("1. Add a new Item to the Store .");
        System.out.println("2. Add a new Customer to the Store .");
        System.out.println("3. Add an item to Customer shopping cart .");
        System.out.println("4. View the items in the Customer shopping cart .");
        System.out.println("5. Empty Customer shopping cart .");
        System.out.println("6. Search for a product name inside the store .");
        System.out.println("7. Exit the program .");
        System.out.println("====================================================");
        try {
            do {
                System.out.println("Add Item operation :");
                int num = s.nextInt();
                s.nextLine();
                if (num == 1) {
                    System.out.println("Please enter the type of item (B) Book , (G) Game , (S) Shoes ??");
                    String itemsTypes = s.nextLine();
                    if (itemsTypes.equalsIgnoreCase("g")) {
                        game.addgame();
                    } else if (itemsTypes.equalsIgnoreCase("b")) {
                        book.addBook();
                    } else if (itemsTypes.equalsIgnoreCase("s")) {
                        shoes.addShoes();
                    } else {
                        System.out.println("Error Input ?????");
                        System.exit(num);
                    }
                    System.out.println("Do you want to add another customer (y / n)?");
                    s.nextLine();
                    if (typa.equalsIgnoreCase("y")) {
                        System.out.println("Add Item operation :");
                        customer.addCustomer();
                        System.out.println("Item added Successfully ^_^  ");
                        System.out.println("=======================================");
                    } else {
                        System.out.println(" ");
                    }
                    System.out.println("Item added Successfully ^_^ ");
                    System.out.println("=======================================");

                }
                if (num == 2) {
                    System.out.println("Add Customer operation :");
                    customer.addCustomer();
                    System.out.println("Customer was added with empty shopping cart Successfully ^_^ ");
                    System.out.println("=======================================");
                    System.out.println("Do you want to add another customer (y / n)?");
                    s.nextLine();
                    if (typa.equalsIgnoreCase("y")) {
                        System.out.println("Add Customer operation :");
                        customer.addCustomer();
                        System.out.println("Customer was added with empty shopping cart Successfully ^_^ ");
                        System.out.println("=======================================");
                    } else {
                        System.out.println(" ");
                    }

                } else if (num == 3) {
                    System.out.println("Add an item to Customer shopping cart .");
                    customer.Add_a_cart_to_customer();

                    System.out.println("=======================================");
                    System.out.println("Do you want to add another customer (y / n)?");
                    s.nextLine();
                    if (typa.equalsIgnoreCase("y")) {
                        System.out.println("Add an item to Customer shopping cart :");
                        customer.addCustomer();
                        System.out.println("=======================================");
                    } else {
                        System.out.println(" ");
                    }
                } else if (num == 4) {
                    System.out.println("View the items in the Customer shopping cart .");

                    System.out.println("Enter the Customer number : ");
                    s.nextLine();
                    customer.View();
                    System.out.println("=======================================");

                } else if (num == 5) {
                    System.out.println("5. Empty Customer shopping cart .");
                    customer.removeExtraItems(); 
                            
                    System.out.println("=======================================");

                } else if (num == 6) {

                    System.out.println("Search for a product name inside the store .");
                    items.search_for_a_product();

                    System.out.println("=======================================");
                } else if (num == 7) {
                    System.out.println("Exit the program .");
                    System.out.println("====================================================");
                    System.exit(7);

                }
            } while (true);

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
