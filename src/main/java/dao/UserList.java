package dao;

import java.util.Arrays;
import java.util.List;
import models.User;

public class UserList {

  private final static List<User> USERS = Arrays.asList(
      new User("Oleg", "Oleg", "000"),
      new User("Maks", "Maks", "123"),
      new User("admin", "admin", "admin")
  );

  public static List<User> getUsers() {
    return USERS;
  }
}
