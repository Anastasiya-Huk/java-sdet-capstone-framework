package org.example.task_1139738.booking_system;

public class Main {

  public static void main(String[] args) {
    BookingService bookingService = new BookingService();

    User nastya = new User("Nastya", "legovich.nastya@gmail.com");
    Room room1 = new Room("Room 1");
    User vitya = new User("Vitya", "vikhuk@gmail.com");
    Room room2 = new Room("Room 2");

    bookingService.createBooking(nastya, room1, BookingStatus.CREATED);
    bookingService.createBooking(vitya, room2, BookingStatus.CREATED);

    System.out.println("bookings = " + bookingService.bookings);
  }
}
