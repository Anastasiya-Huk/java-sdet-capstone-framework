package org.example.task_1139738.additional_practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

  public Map<UserStatus, Integer> countUsersByStatus(List<User> users) {
    Map<UserStatus, Integer> result = new HashMap<>();
    for (User user : users) {
      UserStatus status = user.getStatus();
      if (!result.containsKey(status)) {
        result.put(status, 1);
      } else {
        int currentCount = result.get(status);
        result.put(status, currentCount + 1);
      }
    }
    return result;
  }

  public Map<UserStatus, List<User>> groupUsersByStatus(List<User> users) {
    Map<UserStatus, List<User>> resultGroupUsers = new HashMap<>();
    for (User user : users) {
      UserStatus status = user.getStatus();
      if (!resultGroupUsers.containsKey(status)) {
        resultGroupUsers.put(status, new ArrayList<>());
      }
      resultGroupUsers.get(status).add(user);
    }
    return resultGroupUsers;
  }
}
