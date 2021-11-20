package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String args[]){

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV",500.00));
        list.add(new Product("Geladeira",800.00));
        list.add(new Product("MOUSE",30.00));

        double factor = 1.1;


        list.forEach( p->
                p.setPrice(p.getPrice()*factor));

        //utiliza um reference metod
        list.forEach(System.out::println);

    }
}
