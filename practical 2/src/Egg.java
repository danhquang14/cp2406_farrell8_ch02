import java.util.Scanner;

public class Egg {
    public static void main(String[] args)

    {
        int numberEgg;
        int individualEgg;
        int dozenEgg;
        double totalMoney;
        Scanner userinput= new Scanner(System.in);
        System.out.println("Enter the number of egss you wanna buy:");
        numberEgg=userinput.nextInt();
        dozenEgg=numberEgg/12;
        individualEgg=numberEgg-dozenEgg*12;
        totalMoney=dozenEgg*3.25+individualEgg*0.45;
        System.out.println("you ordered\t"+numberEgg+"Eggs"+".\tThat's"+dozenEgg+"\t dozen at $3.25 per dozen "+"\tand\t"+ individualEgg+"loose eggs at 45 cents each for a total of "+totalMoney+".");

    }
}
