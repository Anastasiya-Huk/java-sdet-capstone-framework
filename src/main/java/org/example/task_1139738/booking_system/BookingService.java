package org.example.task_1139738.booking_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingService {

  List<Booking> bookings = new ArrayList<>();

  public void createBooking(User user, Room room, BookingStatus status) {
    Booking newBooking = new Booking(user, room, status);
    try {
      newBooking.validate();
      bookings.add(newBooking);
    } catch (InvalidBookingException e) {
      System.out.println(e.getMessage());
    }
  }

  public List<Booking> findByUser(User user) {
    List<Booking> result = new ArrayList<>();
    for (Booking booking : bookings) {
      String email = booking.getUser().getEmail();
      String currentUserEmail = user.getEmail();
      if (email.equals(currentUserEmail)) {
        result.add(booking);
      }
    }
    return result;
  }

  public Map<BookingStatus, List<Booking>> groupByStatus() {
    Map<BookingStatus, List<Booking>> resultGroup = new HashMap<>();
    for (Booking booking : bookings) {
      BookingStatus status = booking.getStatus();
      if (!resultGroup.containsKey(status)) {
        resultGroup.put(status, new ArrayList<>());
      }
      resultGroup.get(status).add(booking);
    }
    return resultGroup;
  }
}
