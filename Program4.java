//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)

import java.util.Scanner; // import Scanner class

class Program4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // creates a new Scanner object
        
        System.out.println("Enter 4 variables: "); // user inputs 4 int variables
        int var1 = scanner.nextInt();
        int var2 = scanner.nextInt();
        int var3 = scanner.nextInt();
        int var4 = scanner.nextInt();
        
        int sum = var1 + var2 + var3 + var4;
        double average = (double)sum / 4.0;
        
        System.out.println("The sum of the 4 numbers is " + sum);
        System.out.println("The average of the 4 numbers is " + average);
        
    }
}

//Paste console output below:
/*
    Enter 4 variables: 
    475
    821
    369
    562
    The sum of the 4 numbers is 2227
    The average of the 4 numbers is 556.75

*/
