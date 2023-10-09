package restaurant;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import restaurant.chargingStrategy.ChargingStrategy;
import restaurant.chargingStrategy.DiscountStrategy;
import restaurant.chargingStrategy.HolidayStrategy;
import restaurant.chargingStrategy.StandardStrategy;

public class Restaurant {
    private String name;
    private List<Meal> menu = new ArrayList<Meal>();
    private List<String> members = new ArrayList<String>();
    private ChargingStrategy chargingStrategy = new StandardStrategy();

    public Restaurant(String name) {
        this.name = name;
        JSONArray menuJSON = JSONHelper.readInData("src/restaurant/prices.json");

        for (Object Meal : menuJSON) {
            JSONObject jsonMeal = (JSONObject) Meal;
            menu.add(new Meal(jsonMeal.getString("meal"), jsonMeal.getInt("cost")));
        }
    }

    public double cost(List<Meal> order, String payee) {
        return this.chargingStrategy.cost(order, this.members.contains(payee));
    }

    public void setCharingStrategy(ChargingStrategy s) {
        this.chargingStrategy = s;
    }

    public void displayMenu() {
        double modifier = this.chargingStrategy.standardChargeModifier();

        for (Meal meal : menu) {
            System.out.println(meal.getName() + " - " + meal.getCost() * modifier);
        }
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant("XS");
        r.displayMenu(); // by default standard strategy
        r.setCharingStrategy(new DiscountStrategy());
        r.displayMenu(); // discount;
        r.setCharingStrategy(new HolidayStrategy());
        r.displayMenu(); // holiday

    }

}