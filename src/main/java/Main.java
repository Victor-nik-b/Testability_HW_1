public class Main {
    public static void main(String[] args) {
        // приложение, рассчитывающее количество начисленных миль за купленный билет.
        // Стоимость билета вы выбираете сами — заполняете переменную, в которой она будет храниться.
        // 20 рублей, потраченные на билет, начисляется 1 миля

        System.out.println("Calculating Rewards>");
        int ticketPrice;
        ticketPrice = 17863;
        BonusMilesService service = new BonusMilesService();
        int bonusCount = service.BonusCalc(ticketPrice);
        System.out.println("Ticket Price: " + ticketPrice + " Rub");
        System.out.println("Bonuses: " + bonusCount + " miles");

    }
}
