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

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public UserStatus getStatus() {
    return status;
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
      throw new InvalidUserException("Name is required");
    }
    if (email == null || email.isBlank()) {
      throw new InvalidUserException("Email is required");
    }
    if (status == null) {
      throw new InvalidUserException("Status is required");
    }
  }
}
