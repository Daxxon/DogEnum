/**
 * Created by daniel on 4/6/17.
 */
public  class Dog {

  private  DogBreed breed;
  private  DogGender gender;
  private  String name;

  public void setBreed(DogBreed breed) {
    this.breed = breed;
  }

  public void setGender(DogGender gender) {
    this.gender = gender;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DogBreed getBreed() {
    return breed;
  }

  public DogGender getGender() {
    return gender;
  }

  public String getName() {
    return name;
  }
}

