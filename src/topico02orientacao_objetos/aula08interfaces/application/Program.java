package topico02orientacao_objetos.aula08interfaces.application;

import topico02orientacao_objetos.aula08interfaces.model.services.BrazilTaxService;
import topico02orientacao_objetos.aula08interfaces.model.entities.CarRental;
import topico02orientacao_objetos.aula08interfaces.model.services.RentalService;
import topico02orientacao_objetos.aula08interfaces.model.entities.Vehicle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter rent data:");

        System.out.print("Car model: ");
        String carModel = scanner.nextLine();
        Vehicle vehicle = new Vehicle(carModel);

        System.out.print("Start (dd/MM/yyyy HH:mm): ");
        LocalDateTime startDate = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);

        System.out.print("Finish (dd/MM/yyyy HH:mm): ");
        LocalDateTime finishDate = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);

        CarRental carRental = new CarRental(startDate, finishDate, vehicle);

        System.out.print("Price per hour: ");
        double pricePerHour = scanner.nextDouble();

        System.out.print("Price per day: ");
        double pricePerDay = scanner.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        rentalService.processInvoice(carRental);

        System.out.println("Invoice: ");
        System.out.printf("Basic payment: %.2f\n", carRental.getInvoice().getBasicPayment());
        System.out.printf("Tax: %.2f\n", carRental.getInvoice().getTaxAmount());
        System.out.printf("Total payment: %.2f\n", carRental.getInvoice().getTotalPayment());
    }
}
