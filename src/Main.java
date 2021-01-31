public class Main {
    public  static  void  main ( String [ ]  args ) {
        int currentBalance = 100;
        int deposit = 2000;
        int totalbonus = deposit/100;
        int newBalance = currentBalance + deposit + totalbonus;
        if (deposit < 1001)
        {
            totalbonus = 0;
        }
        System.out.println("Ваш бонус составил:"+totalbonus+"р");
        System.out.println("Текущий баланс:"+newBalance+"р");
}

}
