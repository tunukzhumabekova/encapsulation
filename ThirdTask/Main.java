package ThirdTask;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Contact contact1 = new Contact("John", 1234567890L);
        Contact contact2 = new Contact("Alice", 9876543210L);
        Contact contact3 = new Contact("Bob", 5551234567L);
        Contact[] contacts1 = { contact1, contact2,contact3 };
        Contact[] contacts2 = { contact3 };
        Phone phone1 = new Phone("Samsung", "Galaxy S20", 799, "user1", contacts1);
        Phone phone2 = new Phone("Apple", "iPhone 12", 999, "user2", contacts2);


        System.out.println(phone1.getContactCount());
        Phone[] phones = { phone1, phone2 };

        for (int i = 0; i < phones.length; i++) {
            System.out.println(phones[i]);

        }

    }

}



