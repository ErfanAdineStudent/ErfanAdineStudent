package HomeWork.pdf6.Q1;

public class Productses {
    int countbook;
    int countjournal;
    int countRefri;
    int countRadio;
    int countsneakers;
    int countformalshoeas;

    int id;
    String name;
    BookALL[] bookALL = new BookALL[100];
    Journal[] journals = new Journal[100];

    Refrigerator[] refrigerators = new Refrigerator[100];
    Radio[] radios = new Radio[100];

    Sneakers[] sneakers = new Sneakers[100];
    FormalShoes[] formalShoes = new FormalShoes[100];

    public void addformalshoes(FormalShoes formalShoes) {
        this.formalShoes[countformalshoeas++] = formalShoes;
    }
    public void addsneakers(Sneakers sneakers) {
        this.sneakers[countsneakers++] = sneakers;
    }

    public void addbook(BookALL bookALL) {
        this.bookALL[countbook++] = bookALL;
    }
    public void addjournal(Journal journal) {
        this.journals[countjournal++] = journal;
    }
    public void addrefrigerator(Refrigerator refrigerator) {
        this.refrigerators[countRefri++] = refrigerator;
    }
    public void addradio(Radio radio) {
        this.radios[countRadio++] = radio;
    }


//    public BookALL[] getListbook() {
//
//        return bookALL;
//
//    }
//    public Journal[] getDoctorList() {
//
//        return journals;
//
//    }
//    public Refrigerator[] getDoctorList() {
//
//        return refrigerators;
//
//    }











    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
