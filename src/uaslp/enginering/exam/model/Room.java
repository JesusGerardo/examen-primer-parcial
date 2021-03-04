package uaslp.enginering.exam.model;

public class Room {
    private int number;
    private String roomDescription;
    private RoomStatus Status;

    public Room(int number, String roomDescription, RoomStatus status) {
        this.number = number;
        this.roomDescription = roomDescription;
        Status = status;
    }

    public int getNumber() {
        return number;
    }

    public RoomStatus getStatus() {
        return Status;
    }
}
