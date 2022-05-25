package com.company;

public class Main {

    public static void main(String[] args) {
        television television = new television("Телевизор LG 43UP77506LA 43",41990, 4);
        client1 client1 = new client1("Телевизор LG 43UP77506LA 43","Nicola","52462623",41990,3);
        client1.viev();

        telephone telephone = new telephone("SAMSUNG GALAXY A 8",28500,4);
        client2 client2 = new client2("SAMSUNG GALAXY A 8","Nikita","w3w5t243",28500,4);
        client2.viev();

        laptop laptop = new laptop("Lenovo gamezone21",74000,5);
        client3 client3 = new client3("Lenovo gamezone21","Roman","trgb35tfe62",74000,5);
        client3.viev();
    }

    interface product {
        void productName();

        void price();

        void raiting();
    }

    static class television implements product {

        String tv;
        int price, raiting;

        television(String tv, int price, int raiting) {
            this.tv = tv;
            this.price = price;
            this.raiting = raiting;
        }

        @Override
        public void productName() {
            System.out.println(tv);
        }

        @Override
        public void price() {
            System.out.println(price);
        }

        @Override
        public void raiting() {
            System.out.println(raiting);
        }
    }

    static class telephone implements product {

        String phone;
        int price, raiting;

        telephone(String phone, int price, int raiting) {
            this.phone = phone;
            this.price = price;
            this.raiting = raiting;
        }

        @Override
        public void productName() {
            System.out.println(phone);
        }

        @Override
        public void price() {
            System.out.println(price);
        }

        @Override
        public void raiting() {
            System.out.println(raiting);
        }
    }

    static class laptop implements product {

        String laptop;
        int price, raiting;

        laptop(String laptop, int price, int raiting) {
            this.laptop = laptop;
            this.price = price;
            this.raiting = raiting;
        }

        @Override
        public void productName() {
            System.out.println(laptop);
        }

        @Override
        public void price() {
            System.out.println(price);
        }

        @Override
        public void raiting() {
            System.out.println(raiting);
        }
    }

    interface consumer{
        void login();
        void password();
    }

    static class client1 implements consumer,product{

        String tv,login,password;
        int price,raiting;

        client1(String tv,String login, String password, int price, int raiting){

            this.login = login;
            this.tv = tv;
            this.password = password;
            this.price = price;
            this.raiting = raiting;

        }

        public void login() {
            System.out.println(login);
        }

        @Override
        public void password() {
            System.out.println(password);
        }


        @Override
        public void productName() {
            System.out.println(tv);
        }

        @Override
        public void price() {
            System.out.println(price);
        }

        @Override
        public void raiting() {
            System.out.println(raiting);
        }
        public void viev(){
            System.out.println("Пользователь: "+login + " покупает " + tv);
        }
    }
    static class client2 implements consumer,product{

        String phone,login,password;
        int price,raiting;

        client2(String phone,String login, String password, int price, int raiting){

            this.login = login;
            this.phone = phone;
            this.password = password;
            this.price = price;
            this.raiting = raiting;

        }

        public void login() {
            System.out.println(login);
        }

        @Override
        public void password() {
            System.out.println(password);
        }

        @Override
        public void productName() {
            System.out.println(phone);
        }

        @Override
        public void price() {
            System.out.println(price);
        }

        @Override
        public void raiting() {
            System.out.println(raiting);
        }
        public void viev(){
            System.out.println("Пользователь: "+login + " покупает " + phone);
        }
    }
    static class client3 implements consumer,product{

        String laptop,login,password;
        int price,raiting;

        client3(String laptop,String login, String password, int price, int raiting){

            this.login = login;
            this.laptop = laptop;
            this.password = password;
            this.price = price;
            this.raiting = raiting;

        }

        public void login() {
            System.out.println(login);
        }

        @Override
        public void password() {
            System.out.println(password);
        }

        @Override
        public void productName() {
            System.out.println(laptop);
        }

        @Override
        public void price() {
            System.out.println(price);
        }

        @Override
        public void raiting() {
            System.out.println(raiting);
        }

        public void viev(){
            System.out.println("Пользователь: "+login + " покупает " + laptop);
        }
    }

}
