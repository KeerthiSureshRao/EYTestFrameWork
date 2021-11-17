package Day12_Exercise;
import java.util.List;
import java.util.Scanner;

public class HyundaiCustomerInfo_Template_withScannersss {
    private String name;
    private String state;
    private String city;
    private String carModel;
    private List<String> phoneNumbers; //Using list/set since many values need to be stored, not using array bcz then need to declare size in prior.
    //  Constructor 1:
    public HyundaiCustomerInfo_Template_withScannersss(String name, String state, String city, String carModel, List phoneNumbers){
//   Retrieve Info :
        Scanner myobj = new Scanner(System.in); //Object created
        System.out.println("Please enter the Customer name : ");//User need to respond to this que in Run window & then only related ans,data is displayed
        String customerName = myobj.nextLine();

        this.name=customerName;
        this.state=state;
        this.city=city;
        this.carModel=carModel;
        this.phoneNumbers=phoneNumbers;}
    //getter & setter which are accessible outside since public [Encapsulation concept]
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getCarModel() {
        return carModel;
    }
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }
    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }}
