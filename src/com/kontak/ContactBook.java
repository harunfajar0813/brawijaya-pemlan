package com.kontak;

public class ContactBook {
    private Person[] personLists;
    private Phone[] phoneLists;

    public ContactBook(Person[] personInside, Phone[] phoneInside){
        this.personLists = personInside;
        this.phoneLists = phoneInside;
    }

    public ContactBook(Person[] personInside){
        this.personLists = personInside;
    }

    public void show(){
        for (int h = 0; h < this.personLists.length; h++){
            this.personLists[h].displayPerson();
        }
    }
}
