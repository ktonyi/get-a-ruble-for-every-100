public class Main {
    public  static  void  main ( String [ ]  args ) {
        int currentBalance = 100;
        int deposit = 1001;
        int totalbonus = deposit/100;
        int newBalance = currentBalance + deposit + totalbonus;
        if (deposit<1001)
        {
            System.out.println("Итоговый Бонус");
            System.out.println("0");
            System.out.println("Текущий Баланс");
            System.out.println(deposit+currentBalance);

        } else {System.out.println("Итоговый бонус");
            System.out.println(totalbonus);
            System.out.println("Текущий Баланс");
            System.out.println(newBalance);
    }
}
}
