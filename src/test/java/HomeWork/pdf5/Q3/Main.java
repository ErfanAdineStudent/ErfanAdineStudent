package HomeWork.pdf5.Q3;

import java.util.Scanner;

public class Main {
    static League league = new League();
    static String type = " ";

    public static void main(String[] args) {
        Captain captain = new Captain();



        while (true) {

            //----------------------------------
            System.out.println("e= exit");
            System.out.println("1= addStadium");
            System.out.println("2= addTeam");
            System.out.println("3= addPlayer");
            System.out.println("4= addInjury");
            System.out.println("5= addCapitan");
            System.out.println("6= print all information");


            //-----------------------------------
            type = scannerString();
            if (type.equals("exit"))
                break;
            else if (type.equals("1"))
                addStadium();
            else if (type.equals("2"))
                addTeam();
            else if (type.equals("3"))
                addPlayer();
            else if (type.equals("4"))
                addinjery();
            else if (type.equals("5"))
                addCapitan();
            else if (type.equals("6"))
                printStadium();
//            else if (type.equals("4")) {
//                System.out.println("pleas Enter name of department :");
//                String nameDepartment = scannerString();
//                for (Doctor temp : maktab.getDepByName(nameDepartment).getDoctorList()) {
//                    System.out.println("doc name :" + temp.getName());
//                }
        }

    }


    public static void addStadium() {
        Stadium stadium = new Stadium();
        System.out.println("pleas enter name of stadium :");
        String name = scannerString();
        System.out.println("pleas enter capacity of stadium :");
        int capacity = scannerInt();

        stadium.setName(name);
        stadium.setCapacity(capacity);

        league.addStadiums(stadium);
        System.out.println("------------------------------------------------------finished :"+type);
        type = "";
    }


    public static void addTeam() {
        Team team = new Team();
        System.out.println("pleas enter name of Team :");
        String name = scannerString();
        System.out.println("pleas enter city of Team :");
        String city = scannerString();
        System.out.println("pleas enter number of players :");
        int numberOfPlayer = scannerInt();
//        System.out.println("pleas enter number Of Players of Team :");
//        String city = scannerString();
        team.setName(name);
        team.setCity(city);
        team.setNumberOfPlayers(numberOfPlayer);


        System.out.println("pleas Enter Stadium of team :");
        String nameStadium = scannerString();
        league.getStadiumByName(nameStadium).addTeam(team);
        System.out.println("------------------------------------------------------finished :"+type);
        type = " ";
    }

    public static void addPlayer(){
        Player player = new Player();

        System.out.println("please Enter Player name : ");
        String name = scannerString();
        System.out.println("please Enter Player age : ");
        int age = scannerInt();
        System.out.println("please Enter player Location : ");
        String Location = scannerString();
        //--------------------------------
        System.out.println("pleas Enter stadium and team of player :");
        String nameStadium = scannerString();
        String nameTeam = scannerString();
        league.getStadiumByName(nameStadium).getTeamByName(nameTeam).addPlayer(player);

        //--------------------------------
        for (int i = 0; i < 5; i++) {
            System.out.println("please Enter player injury "+i+": ");
            String injury= scannerString();
//            league.getStadiumByName(nameStadium).getTeamByName(nameTeam).getPlayerByName(player.getName()).addInjury(injury);
//            league.getStadiumByName(nameStadium).getTeamByName(nameTeam).getPlayerByName(this.player.getName()).addInjury(injury);
            league.getStadiumByName(nameStadium).getTeamByName(nameTeam).getPlayerByName(name).addInjury(injury);
        }

        System.out.println("------------------------------------------------------finished :"+type);
        type = " ";


    }

    public static void addinjery(){
        System.out.println("please Enter Player name : ");
        String name = scannerString();
        System.out.println("pleas Enter stadium and team of player :");
        String nameStadium = scannerString();
        System.out.println("---------------------");
        String nameTeam = scannerString();

        for (int i = 0; i < 5; i++) {
            System.out.println("please Enter player injury "+i+": ");
            String injury= scannerString();
//            league.getStadiumByName(nameStadium).getTeamByName(nameTeam).getPlayerByName(player.getName()).addInjury(injury);
//            league.getStadiumByName(nameStadium).getTeamByName(nameTeam).getPlayerByName(this.player.getName()).addInjury(injury);
            league.getStadiumByName(nameStadium).getTeamByName(nameTeam).getPlayerByName(name).addInjury(injury);
        }



    }

    public static void addCapitan(){
        Player player = new Player();
        Captain captain= new Captain();

        System.out.println("please Enter Capitan name : ");
        String name = scannerString();
        System.out.println("please Enter Capitan age : ");
        int age = scannerInt();
//        System.out.println("please Enter Capitan Location : ");
//        String Location = scannerString();
//        for (int i = 0; i < 5; i++) {
//            System.out.println("please Enter player injury "+i+": ");
//
//        }


        System.out.println("pleas Enter stadium and team of Capitan :");
        String nameStadium = scannerString();
        String nameTeam = scannerString();
        league.getStadiumByName(nameStadium).getTeamByName(nameTeam).addPlayer(player);
        league.getStadiumByName(nameStadium).getTeamByName(nameTeam).addCaptain(captain);
        System.out.println("------------------------------------------------------finished :"+type);
        type = " ";
    }

    public static void printStadium(){
        int count=0;
        System.out.println("pleas Enter name of Stadium and Team :");
        String nameStadium = scannerString();
        String nameTeam = scannerString();
        for (Team temp : league.getStadiumByName(nameStadium).ListTim()) {
            System.out.println("-------------------------------------------------");
            System.out.println("-------------------------------------------------");
            System.out.println("-------------------------------------------------");
            System.out.println("Team name :" + temp.getName());
            for (Player player: league.getStadiumByName(nameStadium).getTeamByName(nameTeam).ListPlayer()) {
                    System.out.println("player "+(count++)+" : "+player);
                System.out.println("-------------------------------------------------");
            }
            System.out.println( "capitain :"+league.getStadiumByName(nameStadium).getTeamByName(nameTeam).ListCapitain());
            count=0;
        }
        System.out.println("------------------------------------------------------finished :"+type);
        type = "";
    }


    //-----------------------------------------------------scanner
    public static String scannerString() {
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    public static int scannerInt() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

}
