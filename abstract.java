package com.dataflair.abstractclass;
//abstract parent class
abstract class Animal
{
      //abstract method
      public abstract void sound();
}
//Dog class extends Animal class
class Cat extends Animal
{
      public void sound(){
            System.out.println("Meow");
      }
}
public class AbstractClassExample
{
      public static void main(String args[]){
            Animal obj = new Cat();
            obj.sound();
      }
}