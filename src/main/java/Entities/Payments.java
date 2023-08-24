package Entities;

public class Payments {
    private int paymentNumber;
    private double totalAmount;
    private boolean isPaid;
    private String paymentForm;

    public Payments() {
    }

    public Payments(int paymentNumber, double totalAmount, boolean isPaid, String paymentForm) {
        this.paymentNumber = paymentNumber;
        this.totalAmount = totalAmount;
        this.isPaid = isPaid;
        this.paymentForm = paymentForm;
    }

    public int getPaymentNumber() {
        return paymentNumber;
    }

    public void setPaymentNumber(int paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public String getPaymentForm() {
        return paymentForm;
    }

    public void setPaymentForm(String paymentForm) {
        this.paymentForm = paymentForm;
    }

    @Override
    public String toString() {
        return "Payments{" +
                "paymentNumber=" + paymentNumber +
                ", totalAmount=" + totalAmount +
                ", isPaid=" + isPaid +
                ", paymentForm='" + paymentForm + '\'' +
                '}';
    }
}
