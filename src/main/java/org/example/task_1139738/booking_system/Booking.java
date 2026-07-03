package org.example.task_1139738.booking_system;

public class Booking {

  private User user;
  private Room room;
  private BookingStatus status;

  Booking(User user, Room room, BookingStatus status) {
    this.user = user;
    this.room = room;
    this.status = status;
  }

  @Override
  public String toString() {
    return "Booking{" +
        "user=" + user +
        ", room=" + room +
        ", status=" + status +
        '}';
  }
}
