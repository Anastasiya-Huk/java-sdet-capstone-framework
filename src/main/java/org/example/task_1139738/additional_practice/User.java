package org.example.task_1139738.additional_practice;

public class User implements Validatable {

  private int id;
  private String name;
  private String email;
  private UserStatus status;

  public User(int id, String name, String email, UserStatus status) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.status = status;
  }

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", email='" + email + '\'' +
        ", status=" + status +
        '}';
  }

  @Override
  public void validate() {
    if (name == null || name.isBlank()) {
      System.out.println("Name is required");
    }
    if (email == null || email.isBlank()) {
      System.out.println("Email is required");
    }
    if (status == null) {
      System.out.println("Status is required");
    }
  }
}
