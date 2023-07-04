package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean containsCheese;
    private Boolean containsTopping;
    private Boolean bagAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here

        if(isVeg){
            this.price=300;

        }
        else{
            this.price=400;
        }
        this.containsCheese=false;
        this.containsTopping=false;
        this.bagAdded=false;
        this.bill="";
        setBill("Base Price Of The Pizza: "+this.price+"\n");

    }

    public Boolean getIsVeg() {
        return isVeg;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBill(String bill) {

        this.bill=bill;
    }


    public void setIsVeg(Boolean isVeg) {
        this.isVeg = isVeg;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!containsCheese){
            this.price+=80;
            bill+="Extra Cheese Added: 80"+"\n";

        }
        this.containsCheese=true;
    }

    public void addExtraToppings(){
        // your code goes here

        if(!containsTopping){

            if(isVeg){
                this.price+=70;

                bill+="Extra Toppings Added: 70"+"\n";
            }
            else{
                this.price+=120;
                bill+="Extra Toppings Added: 120"+"\n";
            }

            this.containsTopping=true;
        }

    }

    public void addTakeaway(){
        // your code goes here

        if(!bagAdded){
            this.price+=20;
            bill+="Paperbag Added: 20"+"\n";


        }
        this.bagAdded=true;

    }

    public String getBill(){
        // your code goes here

        return this.bill+"Total Price: "+this.price+"\n";
    }


}