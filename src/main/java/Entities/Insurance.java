package Entities;

import java.time.LocalDate;

public class Insurance {

    private Vehicle vehicle;
    private Client client;
    private long insuranceNumber;
    private LocalDate startDate;
    private LocalDate endDate;
    private int paymentsNumber;
    private String paymentMethod;
    private double totalCoverage;
    private String granizo;
    private String maxGranizo;
    private String coverageType;

    public Insurance() {
    }

    public Insurance(Vehicle vehicle, Client client, long insuranceNumber, LocalDate startDate, LocalDate endDate, int paymentsNumber, String paymentMethod, double totalCoverage, String granizo, String maxGranizo, String coverageType) {
        this.vehicle = vehicle;
        this.client = client;
        this.insuranceNumber = insuranceNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.paymentsNumber = paymentsNumber;
        this.paymentMethod = paymentMethod;
        this.totalCoverage = totalCoverage;
        this.granizo = granizo;
        this.maxGranizo = maxGranizo;
        this.coverageType = coverageType;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "vehicle=" + vehicle +
                ", client=" + client +
                ", insuranceNumber=" + insuranceNumber +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", paymentsNumber=" + paymentsNumber +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", totalCoverage=" + totalCoverage +
                ", granizo='" + granizo + '\'' +
                ", maxGranizo='" + maxGranizo + '\'' +
                ", coverageType='" + coverageType + '\'' +
                '}';
    }
}
