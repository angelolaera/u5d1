package angelo.laera.u5d1.entities;

import java.util.List;

public class Menu {
    private List<Pizza> Pizze;
    private List<Topping> Toppings;
    private List<Bevanda> Bevande;

    public Menu(List<Pizza> pizze, List<Topping> toppings, List<Bevanda> bevande) {
        Pizze = pizze;
        Toppings = toppings;
        Bevande = bevande;
    }

    public List<Pizza> getPizze() {
        return Pizze;
    }

    public void setPizze(List<Pizza> pizze) {
        Pizze = pizze;
    }

    public List<Topping> getToppings() {
        return Toppings;
    }

    public void setToppings(List<Topping> toppings) {
        Toppings = toppings;
    }

    public List<Bevanda> getBevande() {
        return Bevande;
    }

    public void setBevande(List<Bevanda> bevande) {
        Bevande = bevande;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "Pizze=" + Pizze +
                ", Toppings=" + Toppings +
                ", Bevande=" + Bevande +
                '}';
    }

    public void stampaMenu() {
        System.out.println("Pizzas");
        for (Pizza pizza : Pizze) {
            System.out.println(pizza + "\t" + pizza.getCalorie() + "\t" + pizza.getPrezzo());
        }
        System.out.println("\nToppings");
        for (Topping topping : Toppings) {
            System.out.println(topping + "\t" + topping.getCalorie() + "\t" + topping.getPrezzo());
        }
        System.out.println("\nDrinks");
        for (Bevanda bevanda : Bevande) {
            System.out.println(bevanda + "\t" + bevanda.getCalorie() + "\t" + bevanda.getPrezzo());
        }
    }
}
