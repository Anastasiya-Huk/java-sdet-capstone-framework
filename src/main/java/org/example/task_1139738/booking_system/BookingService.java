package org.example.task_1139738.booking_system;

import java.util.ArrayList;
import java.util.List;

public class BookingService {

  List<Booking> bookings = new ArrayList<>();

  public void createBooking(User user, Room room, BookingStatus status) {
    Booking newBooking = new Booking(user, room, status);
    bookings.add(newBooking);
  }
}
