package maktab_mavernAndJdbcAndOopAndPolymorfism.officAndEmployee;


import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Db db = null;
        int time =1;

        while (true) {
            System.out.printf("you play this app for ---------------> %d time %n",time);
            System.out.println("0 = exit");
            System.out.println("1 = load employee");
            System.out.println("2 = insert employee");
            System.out.println("3 = load office");
            System.out.println("4 = insert office");
            int choice = scanner.nextInt();
            System.out.println(" your choice is  running pleas wait......");
            if (choice == 0) {
                System.out.println("exit from application ");
                break;
            }else if (choice == 1) {
                try {

                    db = new DbEmployee();
                    db.load();
                    System.out.println("finished your Optional option");
                }catch (SQLIntegrityConstraintViolationException exception){

                    exception.printStackTrace();
                }


            }else if (choice == 2){
                db = new DbEmployee();
                db.save();
                System.out.println("finished your Optional option");
            }else if (choice == 3) {
                db = new DbOffice();
                db.load();
                System.out.println("finished your Optional option");
            }
            else if (choice == 4){
                db = new DbOffice();
                db.save();

                System.out.println("finished your Optional option");
            }

        }
    }
}
