package ir.pdf5.Q3;

public class League {
    Stadium[] stadiums = new Stadium[10];
    int count=0;






    public Stadium getStadiumByName(String name ){
        for (int i = 0; i < 10; i++) {
            if (stadiums[i] !=null &&stadiums[i].getName().equals(name))
                return stadiums[i];

        }
        return  null;
    }


    public void addStadiums(Stadium stadium){
        stadiums[count++]= stadium;
    }
}
