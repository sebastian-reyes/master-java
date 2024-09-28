package com.sreyes;

import com.sreyes.model.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*

        Forma errónea de hacer el código

        List clientes = new ArrayList();
        clientes.add(new Cliente("Sebastian", "Reyes"));

        Cliente sebastian = (Cliente) clientes.get(0);
        String sebastian2 = (String) clientes.iterator().next();

        */

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Gabriea", "Odría"));
        Cliente gabriela = clientes.get(0);
        Cliente gabriela2 = clientes.iterator().next();

        Cliente[] clientesArreglo = {
                new Cliente("Luis", "Ramos"),
                new Cliente("Luis", "Navarro")
        };

        Integer[] enterosArreglo = {1, 2, 3, 4, 5};

        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Andres", "Pepe", "Renzo", "John"}, enterosArreglo);
        nombres.forEach(System.out::println);
    }

    public static <T> List<T> fromArrayToList(T[] clientes) {
        return Arrays.asList(clientes);
    }

    public static <T, G> List<T> fromArrayToList(T[] clientes, G[] g) {
        for (G elemento : g) {
            System.out.println(elemento);
        }
        return Arrays.asList(clientes);
    }
}