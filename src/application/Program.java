package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String args[]){

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV",500.00));
        list.add(new Product("Geladeira",800.00));
        list.add(new Product("MOUSE",30.00));


        //Referencia ao metodo nao estatico
        list.forEach(Product::nonStaticPriceUpdate);

        //utiliza um reference metod
        list.forEach(System.out::println);

    }
}
