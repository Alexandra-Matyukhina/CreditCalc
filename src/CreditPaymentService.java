public class CreditPaymentService {
    public double calculate(int creditSum, int monthAmount, int termDate) {
        double percentYear = 9.99;
        double percentMonth = ((percentYear * termDate) / monthAmount / 100);
        int monthPayment = (int) (creditSum * (percentMonth + percentMonth / (Math.pow(1 + percentMonth, monthAmount) - 1)));
        return monthPayment;
    }
}
