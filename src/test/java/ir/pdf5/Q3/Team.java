package ir.pdf5.Q3;

public class Team {
    private String name;
    private String city;
    //    String captain;
    static int count = 0;
    private int numberOfPlayers;
    private Captain captain = new Captain();
    private Player[] players = new Player[10];



    public Player[] ListPlayer(){
        return players;
    }

    public Captain ListCapitain(){
        return captain;
    }


    public void addPlayer(Player pla) {

        this.players[count++] = pla;

    }
    public void addCaptain(Captain cap){
        this.captain= cap;
    }

    public Player getPlayerByName(String name) {
        for (int i = 0; i < 10; i++) {
            if (players[i] !=null &&players[i].getName().equals(name))
                return players[i];
        }
        return null;
    }

    /*
    public void setDepartmants(Departmant departmants) {
            this.departmants[count++] = departmants;
        }
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public void setCaptain(Captain captain) {
        this.captain = captain;
    }//captain


    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }
}
