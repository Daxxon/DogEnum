import java.io.*;
import java.util.Scanner;

class DogTest {

  public static void main(String args[]) {
    Dog doggo = new Dog();
    doggo.chooseBreed();
    doggo.assignGender();
    doggo.namePupper();
    System.out.println("Breed of " + doggo.name + " is: " + doggo.breed);
    System.out.println("Gender of " + doggo.name + " is: " + doggo.gender);
  }
}

class Dog {
  Scanner keyboardInput = new Scanner(System.in);

  enum DogBreed { corgi, Corgi, shibu, Shibu, husky, Husky}
  DogBreed breed;

  enum DogGender {male, female}
  DogGender gender;

  String name;

  public void chooseBreed() {
    System.out.print("What kind of pupper do you want - a corgi, a shibu, or a husky? ");  
    this.breed = Dog.DogBreed.valueOf(keyboardInput.nextLine());
  }

  public void assignGender() {
    System.out.print("Do you want a male or a female? ");
    this.gender = Dog.DogGender.valueOf(keyboardInput.nextLine());
  }

  public void namePupper() {
    System.out.print("Name your new pupper: ");
    this.name = keyboardInput.nextLine();
  }
}
