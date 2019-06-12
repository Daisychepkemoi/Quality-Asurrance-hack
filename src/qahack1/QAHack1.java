/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qahack1;

import java.util.*;

/**
 *
 * @author DCHEPKEMOI
 */
public class QAHack1 {

    public static double balance;
    public static double deposit;
    public static double withdraw;
    public static String menu;
    public static int i;

    public static void main(String[] args) {
        balance = 150000.00;
        deposit = 0.00;
        withdraw = 0.00;
        menu();

    }

    public static void menu() {
        //Menu Options
        System.out.println("Please select an option from the menu");
        System.out.println("1. balance");
        System.out.println("2. deposit");
        System.out.println("3. withdraw");
        System.out.println("4. quit");
        selectMenuOption();

    }

    public static void selectMenuOption() {
        //redirect to selected menu option
        Scanner object = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter menu option");

        String option = object.nextLine();  // Read user input
        if (option.equalsIgnoreCase("balance")) {
            balance();
        } else if (option.equalsIgnoreCase("deposit")) {
            deposit();
        } else if (option.equalsIgnoreCase("withdraw")) {
            withdraw();
        } else if (option.equalsIgnoreCase("menu")) {
            menu();
        } else if (option.equalsIgnoreCase("quit")) {
            quit();
        } else if (option.equalsIgnoreCase("")) {
            menu();
        } else {
            System.out.println("Please enter an option from the menu ");
            selectMenuOption();
        }

    }

    public static void balance() {

        System.out.println("BALANCE : \n" + balance);
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Type “menu” and press enter to go back to main menu");

        menu = myObj.nextLine();
        if (menu.equalsIgnoreCase("menu")) {
            menu();
        } else {
            System.out.println("Please type menu to go back to the main menu");
            balance();

        }
    }

    public static void deposit() {

        System.out.println("Current Balance:" + balance);
        Scanner myDeposit = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter amount and press enter (or type menu and press enter to go back to main menu)");
        menu = myDeposit.nextLine();

        if (menu.equalsIgnoreCase("menu")) {
            menu();
        } else if (Double.parseDouble(menu) < 40000) {
            if (i > 3) {
            System.out.println("You have exceeded the totalamount you are allowed to Deposit today");
            menu();
        }
            else{
            for (int i = 0; i < 4; i++) {
                deposit = deposit + Double.parseDouble(menu);
                balance = balance + Double.parseDouble(menu);
                if (deposit > 150000) {

                    System.out.println("You have exceeded the maximum deposit allowed for the day. PLease try again tomorrow");
                    deposit();
                }
                System.out.println("Current Balance:" + balance);
                System.out.println("Current deposit:" + deposit);
                 // Create a Scanner object
                System.out.println("Enter amount and press enter (or type menu and press enter to go back to main menu)");
                menu = myDeposit.nextLine();
                
                
            }
            }

        } else if (Double.parseDouble(menu) > 40000) {
            System.out.println("Please enter an amount less than or equal to 40000 ksh");
            deposit();
        }
        

    }

    public static void withdraw() {
        System.out.println("Current Balance:" + balance);
        System.out.println("Current Balance Withdrawn Today:" + withdraw);
        Scanner mywithdrawals = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter amount and press enter (or type menu and press enter to go back to main menu)");
        menu = mywithdrawals.nextLine();

        if (menu.equalsIgnoreCase("menu")) {
            menu();
        }
        else if (Double.parseDouble(menu) > balance){
        
        System.out.println("Please enter an amount less or equal to the balance");
        withdraw();
        }
        else if (Double.parseDouble(menu) <= 20000) {
            for (int i = 0; i < 3; i++) {
                withdraw = withdraw + Double.parseDouble(menu);
                balance = balance - Double.parseDouble(menu);
                if (withdraw > 50000) {

                    System.out.println("You have exceeded the maximum amount to withdraw in a transaction.Please enter an amount again! ");
                    menu();
                }
                else{
                withdraw();
                }
               
            }
   
        } else if (Double.parseDouble(menu) > 20000) {
            System.out.println("Please enter an amount less than or equal to 20000 ksh");
            withdraw();
        }
          System.out.println("You have exceeded the number of withdrawals you are allowed to withdraw today");
            menu();
    }

    public static void quit() {

        Scanner myQuit = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Are you sure you want to quit? Type yes to quit and No to continue.");
        menu = myQuit.nextLine();

        if (menu.equalsIgnoreCase("Yes")) {
            System.out.println("You have successfully quit the program! To use it again,please run.Thank you!");
        }
        else if (menu.equalsIgnoreCase("No")) {
            menu();
        }
        else{
        System.out.println("Please enter a Yes Or a nO");
        quit();
        }
//  else{
//   menu();
        //  }
    }

// you can add other public classes to this editor in any order
}
  // TODO code application logic here

