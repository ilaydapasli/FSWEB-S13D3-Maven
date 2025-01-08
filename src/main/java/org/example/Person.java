package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    int height;
    int weight;
    String favoriteColor;

    public Person(String firstName,String lastName,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    public Person(String firstName,String lastName,int age,int height,int weight,String favoriteColor){
        this(firstName,lastName,age);
        this.height=height;
        this.weight=weight;
        this.favoriteColor=favoriteColor;

    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public Boolean isTeen(){
       if(age>=13&&age<=19){
           return true;
       }return false;
    }

}
