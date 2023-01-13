package com.Atmproj;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mainclass {

    public static void main(String[] args) {
        Map<Integer, String> ministatement = new HashMap<>();


        int acc1No = 8976;
        int acc1pass = 1234;
        int acc1Balance = 50000;
        int acc2No = 9503;
        int acc2pass = 1234;
        int acc2Balance = 20000;
        Scanner sc = new Scanner(System.in);
        System.out.println("                                 Welcome to our ATM ");
        System.out.println(" ");
        System.out.println("   Enter your account number  ");
        int accNo = sc.nextInt();
        System.out.println("   Enter your pin  ");
        int accPass = sc.nextInt();
        System.out.println(" ");
        if ((acc1No == accNo) && (acc1pass == accPass)) {
            System.out.println("         Welcome SWARAJ PATIL ");
            System.out.println(" ");
            while (true) {
                System.out.println("                     What task would you like to perform ?");
                System.out.println(" ");
                System.out.println(" 1. Check balance  " +
                        " 2. Deposit money  " +
                        " 3. Withdraw money  " +
                        " 4. View mini statement  " +
                        " 5. Exit ");
                int choice = sc.nextInt();
                if (choice == 1) {
                    System.out.println("Your balance is " + acc1Balance + " /- Rs only ");
                    System.out.println(" ");
                } else if (choice == 2) {
                    System.out.println("Enter the amount you want to deposit");
                    int depositmoney = sc.nextInt();
                    ministatement.put(depositmoney, "Rs deposited successfully");

                    acc1Balance = acc1Balance + depositmoney;
                    System.out.println(depositmoney + "Deposited successfully");
                    System.out.println("your new balance is " + acc1Balance + "/- Rs");

                } else if (choice == 3) {
                    System.out.println("How much money you want to withdraw");
                    int withdrawMoney = sc.nextInt();
                    ministatement.put(withdrawMoney, "Rs withdrawn successfully");

                    if (withdrawMoney > acc1Balance) {
                        System.out.println("Insufficient balance");
                        System.exit(0);
                    }

                    acc1Balance = acc1Balance - withdrawMoney;
                    System.out.println("your new balance is " + acc1Balance + "/- Rs");


                } else if (choice == 4) {
                    for (Map.Entry<Integer, String> m : ministatement.entrySet())
                        System.out.println(m.getKey() + "" + m.getValue());
                } else if (choice == 5) {
                    System.out.println("Please collect your ATM card have a great day ");
                    System.exit(0);
                }

            }
        }


        if (acc2No == accNo && acc2pass == accPass) {
            System.out.println("   Welcome Manisha Patil ");
            while (true) {
                System.out.println("What task would you like to perform ?");
                System.out.println(" 1. Check balance  " +
                        " 2. Deposit money  " +
                        " 3. Withdraw money   " +
                        " 4. View mini statement" +
                        " 5. Exit ");
                int choice = sc.nextInt();

                if (choice == 1) {
                    System.out.println("Your balance is " + acc2Balance + "/-  Rs only");
                    System.out.println(" ");
                } else if (choice == 2) {
                    System.out.println("Enter the amount you want to deposit");
                    int depositMoney = sc.nextInt();
                    ministatement.put(depositMoney, "Rs deposited successfully");

                    acc2Balance = depositMoney + acc2Balance;
                    System.out.println("your new balance is " + acc2Balance + "/-  Rs only");

                } else if (choice == 3) {
                    System.out.println("How much money you want to withdraw ?");
                    int withdrawMoney = sc.nextInt();
                    ministatement.put(withdrawMoney, "Rs withdrawn successfully");

                    if (withdrawMoney > acc2Balance) {
                        System.out.println("Insufficient balance");
                        System.exit(0);
                    }

                    acc2Balance = acc2Balance - withdrawMoney;
                    System.out.println(withdrawMoney + "Rs withdrawed successfully");
                    System.out.println("Your new balance is " + acc2Balance + "/- Rs only");


                } else if (choice == 4) {

                    for (Map.Entry<Integer, String> m : ministatement.entrySet())
                        System.out.println(m.getKey() + "" + m.getValue());
                } else if (choice == 5) {
                    System.out.println("Please collect your ATM card have a great day ");
                    System.exit(0);


                }

            }
        } else {
            System.out.println(" Invalid account number or pin ");
            System.exit(0);
        }
    }
}
