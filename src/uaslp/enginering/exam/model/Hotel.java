package uaslp.enginering.exam.model;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Reservation> reservations;
    private String name;
    private ArrayList<Room> rooms;

    public Hotel(String name) {
        reservations = new ArrayList<>();
        rooms = new ArrayList<>();
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void reserveRoom(int roomNumber, Guest guest, String arrivalDate, int nights) {
        Reservation reservation = new Reservation();

        reservation.setRoomNumber(roomNumber);
        reservation.setArrivalDate(arrivalDate);
        reservation.setGuest(guest);
        reservation.setNights(nights);

        reservations.add(reservation);
    }

    public ArrayList<Room> getRooms(){
        return rooms;
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }
}
