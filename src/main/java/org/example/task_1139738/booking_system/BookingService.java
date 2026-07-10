package org.example.task_1139738.booking_system;

import java.util.ArrayList;
import java.util.List;

public class BookingService {

  List<Booking> bookings = new ArrayList<>();

  public void createBooking(User user, Room room, BookingStatus status) {
    Booking newBooking = new Booking(user, room, status);
    bookings.add(newBooking);
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
}
