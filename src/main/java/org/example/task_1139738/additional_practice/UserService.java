package org.example.task_1139738.additional_practice;

import java.util.ArrayList;
import java.util.List;

public class UserService {

  public User findUserByEmail(List<User> users, String email) {
    for (User user : users) {
      if (email.equals(user.getEmail())) {
        return user;
      }
    }
    return null;
  }

  public int countUserByStatus(List<User> users, UserStatus status) {
    int count = 0;
    for (User user : users) {
      if (user.getStatus() == status) {
        count++;
      }
    }
    return count;
  }
}
