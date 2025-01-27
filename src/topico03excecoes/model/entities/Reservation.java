package topico03excecoes.model.entities;

import topico03excecoes.model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private int roomNumber;
    private Date checkInDate;
    private Date checkOutDate;

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(int roomNumber, Date checkInDate, Date checkOutDate) throws DomainException {
        updateDates(checkInDate, checkOutDate);
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public long duration() {
        long dateDiff = this.checkOutDate.getTime() - this.checkInDate.getTime();
        return TimeUnit.DAYS.convert(dateDiff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkInDate, Date checkOutDate) throws DomainException {
        Date currentDay = new Date();

        if (checkInDate.before(currentDay) || checkOutDate.before(currentDay)) {
            throw new DomainException("New reservation dates must be after today's date.");
        }

        if (!checkOutDate.after(checkInDate)) {
            throw new DomainException("Check-out date must be after check-in date.");
        }

        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    @Override
    public String toString() {
        return String.format("Room %d, check in: %s, check out: %s, %d nights",
                this.roomNumber,
                simpleDateFormat.format(this.checkInDate),
                simpleDateFormat.format(this.checkOutDate),
                duration());
    }
}
