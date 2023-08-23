package org.example;


public class Main {
    public static void main(String[] args) {

        try{
            throw new CusExeption("Ошибка");
        } catch (CusExeption e) {
            System.out.println(e.getMessage());
        }
    }
}