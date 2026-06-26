package org.example.task_1139738.collections;

import java.util.ArrayList;
import java.util.List;

public class Collection9 {

  public static void main(String[] args) {
    List<User> users = new ArrayList<>();
    users.add(new User("Anna", 25));
    users.add(new User("John", 17));
    users.add(new User("Kate", 31));
    users.add(new User("Mike", 16));
    users.add(new User("Bob", 22));
    users.add(new User("Emma", 18));
    users.add(new User("Tom", 45));
    users.add(new User("Sophia", 14));
    users.add(new User("David", 27));
    for (User user : users) {
      if (user.getAge() > 18) {
        System.out.println(user.getName() + " " + user.getAge());
      }
    }
  }
}

class User {

  String name;
  int age;

  public User(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}
