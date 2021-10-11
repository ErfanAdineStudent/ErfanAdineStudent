package ir.pdf6.Q1;

public class Coustomer {
    private int id;
    private String firstName;
    private String lastName;
    private String UserName;
    private int[] phoneNumber ;
    private String Email;
    private String provinceName;
    private String CityName;
    private String StreetName;
    private String postcode;

    int countJ=0;
    int countB=0;
    int countR=0;
    int countREF=0;
    int countS=0;
    int countFor=0;

    //---------------------
    private Journal[] journals=new Journal[50];
    private Books[] books = new Books[50];

    private Radio[] radios= new Radio[50];
    private Refrigerator[] refrigerators = new Refrigerator[50];

    private Sneakers[] sneakers = new Sneakers[50];
    private FormalShoes[] formalShoes = new FormalShoes[50];

    //---------------------

    //==========================================
    public void addJornal(Journal journal){
        this.journals[countJ++]= journal;

    }

    public void addBook(Books book){
        this.books[countB++] = book;
    }

    public void addRadio(Radio radio){
        this.radios[countR++] = radio;
    }

    public void addRefrigerator(Refrigerator refrigerator){
        this.refrigerators[countREF++] = refrigerator;
    }

    public void addSneaker(Sneakers sneakers){
        this.sneakers[countS++] = sneakers;
    }

    public void addformalShoes(FormalShoes formalShoes){
        this.formalShoes[countFor++] = formalShoes;
    }

    //==========================================


    public int[] getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int[] phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    //----------------------------------------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public String getStreetName() {
        return StreetName;
    }

    public void setStreetName(String streetName) {
        StreetName = streetName;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }


//    public void setALLInformation(){
//
//
//        setCityName();
//
//    }


}
