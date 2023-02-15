package com.driver;

public class Pizza {

    private int price;
    private final Boolean isVeg;
    private String bill;

    private int extraCheese;
    private int extraToppings;

    private boolean isTakeAway;
    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.extraCheese = 0;
        this.extraToppings = 0;
        this.isTakeAway = false;

        // your code goes here
        if(isVeg) this.price = 300;
        else this.price = 400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.price += 80;
        this.extraCheese++;

    }

    public void addExtraToppings(){
        // your code goes here
        if(this.isVeg) this.price += 70;
        else this.price += 120;
        this.extraToppings++;
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price += 20;
            isTakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        this.bill = "Base Price Of The Pizza: " + (this.isVeg ? 300 : 400) + "\n";
        if(extraCheese > 0){
            this.bill += "Extra Cheese Added: " + (80*extraCheese) + "\n";
        }
        if(extraToppings > 0){
            int toppingPrice;
            if(isVeg) toppingPrice = 70;
            else toppingPrice = 120;
            this.bill += "Extra Toppings Added: " + (toppingPrice*extraToppings) + "\n";
        }
        if(isTakeAway){
            this.bill += "Paperbag Added: 20 \n";
        }

        this.bill += "Total Price: " + price + "\n";


        return this.bill;
    }
}
