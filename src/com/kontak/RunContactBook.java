package com.kontak;

public class RunContactBook {
    public static void main(String[] args) {
        Person person1 = new Person("ulum", "lesanpuro", "jogja", new Phone[]{new Phone("rumah", "123"), new Phone("kantor", "456"), new Phone("pribadi", "789")});
        Person person2 = new Person("harun", "kedungkandang", "malang", new Phone[]{new Phone("rumah", "123"), new Phone("kantor", "456"), new Phone("pribadi", "789")});
        ContactBook cb2 = new ContactBook(new Person[]{person1, person2});
        cb2.show();
    }
}
