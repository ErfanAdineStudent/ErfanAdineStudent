package HomeWork.pdf5.Q3;

public class Stadium {
    String name;
    int capacity;
    int count=0;
    Team[] team = new Team[2];


    public Team getTeamByName(String name ){
        for (int i = 0; i < 10; i++) {
            if (team[i] !=null &&team[i].getName().equals(name))
                return team[i];

        }
        return  null;
    }

    public Team[] ListTim(){
        return team;
    }







    public void addTeam(Team team){
       this.team[count++]=team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
