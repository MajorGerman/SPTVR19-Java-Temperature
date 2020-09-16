package sptvr19.java.weather;
import java.util.Random;
import java.util.Scanner;

class App {
    
    public static void run() {
    System.out.println(" [ Weather for Year ]");
    System.out.println("  [ By Georg Laabe ]");
    
    int user_month = 0;
    int user_day = 0;
    
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    
    System.out.print("\nInput the day: ");
    user_day = scan.nextInt();
    
    System.out.print("Input the month(1-12): ");
    user_month = scan.nextInt();
    
    int array[][] = new int[12][];    
    int random = 0;
    
    int hottest_temp = 0;
    int hottest_day = 0;
    int hottest_month = 0;
    
    int coolest_temp = 0;
    int coolest_day = 0;
    int coolest_month = 0; 
    
    int i;
    int j;
    
    int minimum = 0;
    int maximum = 0;
   
    array[0] =  new int[31];
    array[1] =  new int[28];
    array[2] =  new int[31];
    array[3] =  new int[30];
    array[4] =  new int[31];
    array[5] =  new int[30];
    array[6] =  new int[31];
    array[7] =  new int[31];
    array[8] =  new int[30];
    array[9] =  new int[31];
    array[10] =  new int[30];
    array[11] =  new int[31];   
    
    int sum1 = 0;
    int sum2 = 0;
    int sum3 = 0;
    int sum4 = 0;
    int sum5 = 0;
    int sum6 = 0;
    int sum7 = 0;
    int sum8 = 0;
    int sum9 = 0;
    int sum10 = 0;
    int sum11 = 0;
    int sum12 = 0;

    for (i = 0; i < array.length; i++) {
        for (j = 0; j < array.length; j++) {
            switch(i) {
                case 0:
                  minimum = -20;
                  maximum = 2;
                  break;
                case 1:
                  minimum = -12;
                  maximum = 8;
                  break;
                case 2:
                  minimum = -2;
                  maximum = 14;
                  break;
                case 3:
                  minimum = 3;
                  maximum = 16;
                  break;
                case 4:
                  minimum = 7;
                  maximum = 18;
                  break;
                case 5:
                  minimum = 11;
                  maximum = 23;
                  break;
                case 6:
                  minimum = 12;
                  maximum = 28;
                  break;
                case 7:
                  minimum = 11;
                  maximum = 24;
                  break;
                case 8:
                  minimum = 7;
                  maximum = 18;
                  break;
                case 9:
                  minimum = 1;
                  maximum = 9;
                  break;
                case 10:
                  minimum = -6;
                  maximum = 6;
                  break;
                case 11:
                  minimum = -18;
                  maximum = 3;
                  break;
            }
            random = rand.nextInt(maximum - minimum + 1) + minimum;
            array[i][j] = random;
            
            switch(i) {
                case 0:
                  sum1 += array[i][j];
                  break;
                case 1:
                  sum2 += array[i][j];
                  break;
                case 2:
                  sum3 += array[i][j];
                  break;
                case 3:
                  sum4 += array[i][j];
                  break;
                case 4:
                  sum5 += array[i][j];
                  break;
                case 5:
                  sum6 += array[i][j];
                  break;
                case 6:
                  sum7 += array[i][j];
                  break;
                case 7:
                  sum8 += array[i][j];
                  break;
                case 8:
                  sum9 += array[i][j];
                  break;
                case 9:
                  sum10 += array[i][j];;
                  break;
                case 10:
                  sum11 += array[i][j];
                  break;
                case 11:
                  sum12 += array[i][j];
                  break;
            }            
            
            if (random > hottest_temp) {
                hottest_temp = random;
                hottest_day = j + 1;
                hottest_month = i + 1;
            } else if (random < coolest_temp) {
                coolest_temp = random;
                coolest_day = j + 1;
                coolest_month = i + 1;
            }
            
        }    
    } 
    System.out.println("-------------------------------------------------");
    System.out.println("Temperature for " + user_day + "." + user_month + ": " + array[user_month-1][user_day-1]);
    System.out.println("\nThe warmest day is " + hottest_day + "." + hottest_month + "(" + hottest_temp + ")");
    System.out.println("The coolest day is " + coolest_day + "." + coolest_month + "(" + coolest_temp + ")");
    
    System.out.println("\nThe average temperature in month 1 is " + sum1 / 31);
    System.out.println("The average temperature in month 2 is " + sum2 / 28);
    System.out.println("The average temperature in month 3 is " + sum3 / 31);
    System.out.println("The average temperature in month 4 is " + sum4 / 30);
    System.out.println("The average temperature in month 5 is " + sum5 / 31);
    System.out.println("The average temperature in month 6 is " + sum6 / 30);
    System.out.println("The average temperature in month 7 is " + sum7 / 31);
    System.out.println("The average temperature in month 8 is " + sum8 / 31);
    System.out.println("The average temperature in month 9 is " + sum9 / 30);
    System.out.println("The average temperature in month 10 is " + sum10 / 31);
    System.out.println("The average temperature in month 11 is " + sum11 / 30);
    System.out.println("The average temperature in month 12 is " + sum12 / 31);
}
}