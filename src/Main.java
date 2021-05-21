public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditSum = 1_000_000;
        double percentYear = 9.99;
        int termDate;
        int monthAmount;
        int CreditPayment = (int) service.calculate(1_000_000, 12, 1);
        System.out.println("Ежемесячный платеж по кредиту на сумму 1000000 сроком на один год составляет: " + CreditPayment);

        int CreditPayment2 = (int) service.calculate(1_000_000, 24, 2);
        System.out.println("Ежемесячный платеж по кредиту на сумму 1000000 сроком на два года составляет: " + CreditPayment2);

        int CreditPayment3 = (int) service.calculate(1_000_000, 36, 3);
        System.out.println("Ежемесячный платеж по кредиту на сумму 1000000 сроком на три года составляет: " + CreditPayment3);
    }
}
