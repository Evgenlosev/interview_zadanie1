package ru.geekbrains.zadanie1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder().setAddress("Ленина 1").setAge(29).setCountry("Россия").setFirstName("Иван")
                .setLastName("Иванов").setGender("м").setMiddleName("Иванович").setPhone("111-111").build();

        System.out.println(person);
    }


}
