package org.example.task_1139738.booking_system;

import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    BookingService bookingService = new BookingService();

    User nastya = new User("Nastya", "legovich.nastya@gmail.com");
    Room room1 = new Room("Room 1");
    User vitya = new User("Vitya", "vikhuk@gmail.com");
    Room room2 = new Room("Room 2");
    User jane = new User("Jane", "janetest@gmail.com");
    Room room3 = new Room("Room 3");
    User kate = new User("", "test@gmail.com");
    Room room4 = new Room("Room 4");

    bookingService.createBooking(nastya, room1, BookingStatus.CREATED);
    bookingService.createBooking(vitya, room2, BookingStatus.CREATED);
    bookingService.createBooking(jane, room3, BookingStatus.CONFIRMED);
    bookingService.createBooking(kate, room4, BookingStatus.CANCELLED);
    System.out.println("bookings = " + bookingService.bookings);

    List<Booking> userBookings = bookingService.findByUser(nastya);
    System.out.println(userBookings);

    Map<BookingStatus, List<Booking>> statusBookings = bookingService.groupByStatus();
    System.out.println(statusBookings);
  }
}
