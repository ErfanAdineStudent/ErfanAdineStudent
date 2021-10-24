package HomeWork.pdf5.Q3;

public class SoccerPlayer {String name ;
    int age;
    int abilityLevel;
    int count=0;
    String location;
    String[] injury= new String[5];
    //------------------------------behaviar
    public void addInjury(String injury){
        this.injury[count++]= injury;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAbilityLevel() {
        return abilityLevel;
    }

    public void setAbilityLevel(int abilityLevel) {
        this.abilityLevel = abilityLevel;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
