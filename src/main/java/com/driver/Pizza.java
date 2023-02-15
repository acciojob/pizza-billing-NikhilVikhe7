package com.driver;

public class Pizza {

    private int price;
    private final Boolean isVeg;
    private String bill;

    private boolean isTakeAway;
    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isTakeAway = false;
        this.isExtraToppingsAdded = false;
        this.isExtraCheeseAdded = false;

        // your code goes here
        if(isVeg) this.price = 300;
        else this.price = 400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded){
            this.price += 80;
            this.isExtraCheeseAdded = true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.isExtraToppingsAdded){
            if (this.isVeg) this.price += 70;
            else this.price += 120;
            this.isExtraToppingsAdded = true;
        }
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
        if(isExtraCheeseAdded){
            this.bill += "Extra Cheese Added: 80"+ "\n";
        }
        if(isExtraToppingsAdded){
            this.bill += "Extra Toppings Added: "+ (this.isVeg ? 70 : 120) + "\n";
        }
        if(isTakeAway){
            this.bill += "Paperbag Added: 20\n";
        }

        this.bill += "Total Price: " + price + "\n";


        return this.bill;
    }
}
