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
public class Game extends Items {

    private String ReleaseDate;
    private String CompanyName;
    private double Rating;

    public String getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(String ReleaseDate) {
        this.ReleaseDate = ReleaseDate;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    public double getRating() {
        return Rating;
    }

    public void setRating(double Rating) {
        this.Rating = Rating;
    }

    public void addgame() {
        try {
            ArrayList<Items> itemsarr = new ArrayList<Items>();
            Game game = new Game();
            Scanner s = new Scanner(System.in);
            System.out.print("enter price : ");
            game.setPrice(s.nextInt());
            s.nextLine();
            System.out.print("enter quantitay : ");
            game.setQuantity(s.nextInt());
            s.nextLine();
            game.setItemsTypes("game");
            game.setItem_id(count + 2);
            System.out.print("item id " + game.getItem_id());
            System.out.print("item name :");
            game.setItem_name(s.nextLine());
            System.out.print("please enter campany name : ");
            game.setCompanyName(s.nextLine());
            System.out.print("please enter Rating  : ");
            game.setRating(s.nextInt());
            s.nextLine();
            System.out.print("please enter ReleaseDate : ");
            game.setReleaseDate(s.nextLine());
            s.nextLine();
            itemsarr.add(game);
            System.out.println(itemsarr);

        } catch (Exception e) {
            System.err.println("Error Addgame !!!");
            System.out.println(e);

        }

    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "CompanyName :" + this.CompanyName
                + "\n" + "ReleaseDate :" + this.ReleaseDate + "\n" + "Rating :" + this.Rating;
    }

}
