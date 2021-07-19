package lesson04_part02;

public class Main {

    public static void main(String[] args){
        System.out.println("Create the phonebook");
        PhoneBook phonebook = new PhoneBook();
        System.out.println("* * *");

        System.out.println("We fill the phonebook");
        phonebook.add("Smith", "89001234455");
        phonebook.add("Smith", "89001235566");
        phonebook.add("Jams", "89003210000");
        phonebook.add("Paper", "89006547777");
        phonebook.add("Smith", "89001236677");
        System.out.println("* * *");

        System.out.println("Got numbers");
        System.out.println("Smith");
        System.out.println(phonebook.get("Smith"));
        System.out.println("Jams");
        System.out.println(phonebook.get("Jams"));
        System.out.println("Paper");
        System.out.println(phonebook.get("Paper"));
        System.out.println("* * *");

        System.out.println("We can't find a number");
        System.out.println("Hops");
        System.out.println(phonebook.get("Hops"));
        System.out.println("* * *");

        System.out.println("Try to add a number");
        phonebook.add("Smith", "88004444444");
        System.out.println("Smith");
        System.out.println(phonebook.get("Smith"));
    }
}
