package org.example.task_1139738.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection10 {

  public static void main(String[] args) {

    List<Booking> bookings = new ArrayList<>();
    bookings.add(new Booking("Room 101", "CONFIRMED"));
    bookings.add(new Booking("Room 205", "CONFIRMED"));
    bookings.add(new Booking("Room 303", "CANCELLED"));

    Map<String, List<Booking>> groups = new HashMap<>();
    for (Booking booking : bookings) {
      String status = booking.getStatus();
      if (groups.containsKey(status)) {
        groups.get(status).add(booking);
      } else {
        List<Booking> bookingList = new ArrayList<>();
        bookingList.add(booking);
        groups.put(status, bookingList);
      }
    }

    System.out.println(groups);
  }
}

class Booking {

  private String room;
  private String status;

  public Booking(String room, String status) {
    this.room = room;
    this.status = status;
  }

  public String getRoom() {
    return room;
  }

  public String getStatus() {
    return status;
  }

  @Override
  public String toString() {
    return room;
  }
}
