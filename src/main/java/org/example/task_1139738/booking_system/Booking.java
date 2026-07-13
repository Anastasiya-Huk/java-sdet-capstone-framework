package org.example.task_1139738.booking_system;

public class Booking implements Validatable {

  private User user;
  private Room room;
  private BookingStatus status;

  Booking(User user, Room room, BookingStatus status) {
    this.user = user;
    this.room = room;
    this.status = status;
  }

  public User getUser() {
    return user;
  }

  public BookingStatus getStatus() {
    return status;
  }

  @Override
  public String toString() {
    return "Booking{" +
        "user=" + user +
        ", room=" + room +
        ", status=" + status +
        '}';
  }

  @Override
  public void validate() throws InvalidBookingException {
    if (user.getName() == null) {
      throw new InvalidBookingException("Name is required");
    }
    if (user.getName().isEmpty()){
      throw new InvalidBookingException("Name cannot be empty");
    }
    if (user.getEmail() == null) {
      throw new InvalidBookingException("Email is required");
    }
    if (user.getEmail().isEmpty()) {
      throw new InvalidBookingException("Email cannot be empty");
    }
    if (user == null) {
      throw new InvalidBookingException("User is required");
    }
    if (room.getRoomNumber() == null) {
      throw new InvalidBookingException("Room number is required");
    }
    if (room.getRoomNumber().isEmpty()) {
      throw new InvalidBookingException("Room number cannot be empty");
    }
    if (room == null) {
      throw new InvalidBookingException("Room is required");
    }
    if (status == null) {
      throw new InvalidBookingException("Status is required");
    }
  }
}
