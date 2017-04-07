import java.util.Scanner;

public class DogTest {

  private static Scanner keyboardInput = new Scanner(System.in);

  public static void main(String args[]) {
    Dog doggo = new Dog();
    System.out.print("What kind of pupper do you want - a corgi, a shibu, or a husky? ");
    doggo.setBreed(DogBreed.valueOf(keyboardInput.nextLine()));
    System.out.print("Do you want a male or a female pupper? ");
    doggo.setGender(DogGender.valueOf(keyboardInput.nextLine()));
    System.out.print("Name your new pupper: ");
    doggo.setName(keyboardInput.nextLine());
    System.out.println("Breed of " + doggo.getName() + " is: " + doggo.getBreed());
    System.out.println("Gender of " + doggo.getName() + " is: " + doggo.getGender());
  }
}

