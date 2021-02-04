public class Main {
    public  static  void  main ( String [ ]  args ) {
        int currentBalance = 100;
        int deposit = 2000;
        int totalbonus = 0;

                if (deposit > 1000)
        {
            totalbonus = deposit/100;
        }
        System.out.println("Ваш бонус составил:"+totalbonus+"р");
        System.out.println("Текущий баланс:"+(currentBalance + deposit + totalbonus)+"р");
}

}
