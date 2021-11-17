package Day11_Exercise;
import java.util.List;
public class HyundaiCustomerInfo_Template {
    private String name;
    private String state;
    private String city;
    private String carModel;
    private List<String> phoneNumbers; //Using list/set since many values need to be stored, not using array bcz then need to declare size in prior.

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
