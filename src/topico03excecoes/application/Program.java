package topico03excecoes.application;

import topico03excecoes.model.entities.Reservation;
import topico03excecoes.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Room number: ");
            int roomNumber = scanner.nextInt();
            System.out.print("Check-in date [dd/mm/yyyy]: ");
            Date checkInDate = simpleDateFormat.parse(scanner.next());
            System.out.print("Check-out date [dd/mm/yyyy]: ");
            Date checkOutDate = simpleDateFormat.parse(scanner.next());

            Reservation reservation = new Reservation(roomNumber, checkInDate, checkOutDate);
            System.out.println("Reservation: " + reservation);

            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date [dd/mm/yyyy]: ");
            Date newCheckInDate = simpleDateFormat.parse(scanner.next());
            System.out.print("Check-out date [dd/mm/yyyy]: ");
            Date newCheckOutDate = simpleDateFormat.parse(scanner.next());

            reservation.updateDates(newCheckInDate, newCheckOutDate);
            System.out.println("Reservation: " + reservation);
        } catch (ParseException e) {
            System.out.println("Invalid date format: " + e.getMessage());
        } catch (DomainException e) {
            System.out.println("Error on updating dates: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
