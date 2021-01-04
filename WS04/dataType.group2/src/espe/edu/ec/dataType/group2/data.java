package espe.edu.ec.dataType.group2;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Group2
 */

public class data {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int age = 0;
        String name = "", subject = "", telephone = "";        
        float average = 0;
        char gender = ' ';
        
        
        File file = new File("Group2.txt");

        if (!file.exists()) {
            try {                
                file.createNewFile();
                FileWriter write = new FileWriter(file, true);
                PrintWriter line = new PrintWriter(write);

                System.out.print("Enter your name: ");
                name = input.nextLine();
                System.out.print("Enter your age: ");
                age = input.nextInt();
                input.nextLine();
                System.out.print("Enter your telephone: ");
                telephone = input.nextLine();
                System.out.print("Enter your subject: ");
                subject = input.nextLine();
                System.out.print("Enter your average: ");
                average = input.nextFloat(); 
                System.out.print("Enter your gender Male(M) or Female(F):  ");
                gender = input.next().charAt(0);
                
                line.println("Name: "+name);
                line.println("Age: "+age);
                line.println("Telephone: "+telephone);
                line.println("Subject: "+subject);                
                line.println("Average: "+average);
                line.println("Gender: "+gender);
                line.println(" ");
                line.close();
                write.close();
              

            }catch (IOException ex) {
                Logger.getLogger(data.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else {
            try {
                FileWriter write = new FileWriter(file, true);
                PrintWriter line = new PrintWriter(write);

                System.out.print("Enter your name: ");
                name = input.nextLine();
                System.out.print("Enter your age: ");
                age = input.nextInt();
                input.nextLine();
                System.out.print("Enter your telephone: ");
                telephone = input.nextLine();
                System.out.print("Enter your subject: ");
                subject = input.nextLine();
                System.out.print("Enter your average: ");
                average = input.nextFloat(); 
                System.out.print("Enter your gender Male(M) or Female(F):  ");
                gender = input.next().charAt(0);
                
                line.println("Name: "+name);
                line.println("Age: "+age);
                line.println("Telephone: "+telephone);
                line.println("Subject: "+subject);                
                line.println("Average: "+average);
                line.println("Gender: "+gender);
                line.println(" ");
                line.close();
                write.close();

            } catch (IOException ex) {
                Logger.getLogger(data.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Welcome "+name);  
            System.out.println("You have "+age+" years old");
            System.out.println("Registered in "+subject);
            System.out.println("Average in subject: "+average);
            System.out.println("Your phone number is "+telephone);
            System.out.println("Your gender is: "+gender);
    }
}
