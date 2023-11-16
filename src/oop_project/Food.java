
package oop_project;


public class Food {
    String food_name;
    double food_price;
    
    Food(String food_name,double food_price){
        this.food_name = food_name;
        this.food_price = food_price;
    }
    void showFoodName(){
        System.out.println("food_name");
    }
    void showFoodPrice(){
        System.out.println("food_price");
        
    }
    
}

