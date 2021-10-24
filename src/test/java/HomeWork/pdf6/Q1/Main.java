package HomeWork.pdf6.Q1;

import java.util.Scanner;

public class Main {
    static StorCenter storCenter = new StorCenter();


    public static void main(String[] args) {

        String type = "";


        while (true) {
            System.out.println("exit = exit from program");
            System.out.println("1 = add a coustomer ");
            System.out.println("2 = add a doctor");
            System.out.println("3 = add a room");
            System.out.println("4 = list Doctors (by Department's name)");
            System.out.println();

            type = scannerString();
            if (type.equals("exit"))
                break;
            else if (type.equals("1")) {

                addCoustomer();
            } else if (type.equals("2")) {

//                addDoctor();
            } else if (type.equals("4")) {
//                System.out.println("pleas Enter name of department :");
//                String nameDepartment = scannerString();
//                for (Doctor temp : maktab.getDepByName(nameDepartment).getDoctorList()) {
//                    System.out.println("doc name :" + temp.getName());
//                }
            }
        }

    }


    public static void addCoustomer() {
        int[] phone = new int[11];
        Coustomer coustomer = new Coustomer();
        storCenter.addCoustomers(coustomer);

        System.out.println("-------------------- information of person ");
        System.out.println("please Enter Coustomer first name : ");
        String name = scannerString();
        System.out.println("please Enter Coustomer last name : ");
        String lastName = scannerString();
        System.out.println("please Enter Coustomer Username: ");

        System.out.println("-------------------information about tecnoloje");
        System.out.println("please Enter Coustomer phoneNumber (11 digit): ");
//        String phoneNumber = scannerString();
//        coustomer.setPhoneNumber(phoneNumber);
        for (int i = 0; i < 11; i++) {
            phone[i] = scannerInt();
        }
        coustomer.setPhoneNumber(phone);

        System.out.println("please Enter Coustomer Email : ");
        String email = scannerString();
        coustomer.setEmail(email);

        System.out.println("-------------------address ");
        System.out.println("please Enter Coustomer province OF Name : ");
        String provinceName = scannerString();
        System.out.println("please Enter Coustomer CityName : ");
        String cityName = scannerString();
        System.out.println("please Enter Coustomer StreetName : ");
        String streetName = scannerString();
        System.out.println("please Enter Coustomer post code : ");
        String postCode = scannerString();


    }

    public static String scannerString() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static int scannerInt() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static Long scannerLong() {
        Scanner input = new Scanner(System.in);
        return input.nextLong();
    }


}
