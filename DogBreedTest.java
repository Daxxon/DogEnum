import java.io.*;
import java.util.Scanner;

class Dog {
  enum DogBreed{ corgi, Corgi, shibu, Shibu, husky, Husky}
  DogBreed breed;
  String name; 
}

class DogBreedTest {

  public static void main(String args[]){
    Scanner keyboardInput = new Scanner(System.in);
    Dog doggo = new Dog();
    System.out.print("Name your new pupper: ");
    doggo.name = keyboardInput.nextLine();
    System.out.print("What kind of pupper do you want - a corgi, a shibu, or a husky? ");  
    doggo.breed = Dog.DogBreed.valueOf(keyboardInput.nextLine());
    System.out.println("Breed of " + doggo.name + " is: " + doggo.breed);
  }
}
