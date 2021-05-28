public class CreditPaymentService {
    public double calculate(int creditSum, double monthAmount, int termDate) {
        double percentYear = 9.99;
        double percentMonth = ((percentYear * termDate) / monthAmount / 100);
        double monthPayment = (creditSum * (percentMonth + percentMonth / (Math.pow(1 + percentMonth, monthAmount) - 1)));
        return monthPayment;
    }
}
