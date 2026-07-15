package org.example.task_1139738.additional_practice;

public class User implements Validatable {

  private int id;
  private String name;
  private String email;

  public User(int id, String name, String email) {
    this.id = id;
    this.name = name;
    this.email = email;
  }

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", email='" + email + '\'' +
        '}';
  }

  @Override
  public void validate() {
    if (name == null || name.isEmpty()){
      System.out.println("Name is required");
    }
    if (email == null || email.isEmpty()){
      System.out.println("Email is required");
    }
  }

  public static void main(String[] args) {
    User petya = new User(1, "Petya", "petya@jhk.com");
    User katya = new User(2, "Katya", "katya@4jhk.com");
    User masha = new User(3, "Masha", "masha@4jkhk.com");
    User maks = new User(4, "", "maks@4jkghk.com");

    petya.validate();
    katya.validate();
    masha.validate();
    maks.validate();

    System.out.println(petya + "\n" + katya + "\n" + masha + "\n" + maks);
  }

}
