package ir.pdf6.Q1;

public class StorCenter {
    Coustomer[] coustomers = new Coustomer[100];
    int count = 0;

    public void addCoustomers(Coustomer coustomer) {
        this.coustomers[count++] = coustomer;
    }

    public Coustomer getCoustomerByName(String firstname,String lastName){
        for (int i = 0; i < 100; i++) {
            if (coustomers[i].getFirstName().equalsIgnoreCase(firstname) && coustomers[i].getLastName().equalsIgnoreCase(lastName))
                return  coustomers[i];
        }
        return null;
    }



}
