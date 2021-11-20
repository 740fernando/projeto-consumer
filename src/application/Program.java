package application;

import entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String args[]){

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV",500.00));
        list.add(new Product("Geladeira",800.00));
        list.add(new Product("MOUSE",30.00));

        //atualiza os precos, percorre a lista, aplicando o consumer para cada elemento da lista
        list.forEach(new PriceUpdate());

        //utiliza um reference metod
        list.forEach(System.out::println);

    }
}
