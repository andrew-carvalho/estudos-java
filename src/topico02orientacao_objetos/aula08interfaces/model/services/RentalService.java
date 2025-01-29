package topico02orientacao_objetos.aula08interfaces.model.services;

import topico02orientacao_objetos.aula08interfaces.model.entities.CarRental;
import topico02orientacao_objetos.aula08interfaces.model.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private double pricePerHour;
    private double pricePerDay;
    private TaxService taxService;

    public RentalService(double pricePerHour, double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;
        double roundedHours = Math.ceil(hours);

        double amount = 0;
        if (hours > 12) {
            amount = pricePerDay * Math.ceil((roundedHours / 24));
        } else {
            amount = pricePerHour * roundedHours;
        }

        double taxAmount = taxService.tax(amount);

        carRental.setInvoice(new Invoice(amount, taxAmount));
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public TaxService getTaxService() {
        return taxService;
    }

    public void setTaxService(TaxService taxService) {
        this.taxService = taxService;
    }
}
