package Day11_Exercise;
import java.util.*;

public class CustomerDetailsImplementation_Scanner {
    public static void main(String[] args) {
        HyundaiCustomerInfo_Template custinfo_obj1 = new HyundaiCustomerInfo_Template();
        custinfo_obj1.setName("Keerthi");
        custinfo_obj1.setState("Kerala");
        custinfo_obj1.setCity("Kochi");
        custinfo_obj1.setCarModel("i20");
        ArrayList<String> phoneNumber = new ArrayList<>();
        phoneNumber.add("9000000000");
        phoneNumber.add("9000000001");
        custinfo_obj1.setPhoneNumbers(phoneNumber);

        HyundaiCustomerInfo_Template custinfo_obj2 = new HyundaiCustomerInfo_Template();
        custinfo_obj2.setName("Suresh");
        custinfo_obj2.setState("Karnataka");
        custinfo_obj2.setCity("Banglore");
        custinfo_obj2.setCarModel("i10");
        custinfo_obj2.setPhoneNumbers(new ArrayList<String>(Arrays.asList("9800000000","9700000000"))); //Equivalent to Lineno.14,15,16

        HyundaiCustomerInfo_Template custinfo_obj3 = new HyundaiCustomerInfo_Template();
        custinfo_obj3.setName("Deva");
        custinfo_obj3.setState("TN");
        custinfo_obj3.setCity("Madurai");
        custinfo_obj3.setCarModel("Creta");
        custinfo_obj3.setPhoneNumbers(new ArrayList<String>(Arrays.asList("9400000000","9100000000")));
//      Map Concept where Key are Names, Values are Objects
        Map<String, HyundaiCustomerInfo_Template> customerMapObj = new HashMap<String, HyundaiCustomerInfo_Template>();
        customerMapObj.put("Keerthi",custinfo_obj1);
        customerMapObj.put("Suresh",custinfo_obj2);
        customerMapObj.put("Deva",custinfo_obj3);
//  Retrieve Info :
        Scanner myobj = new Scanner(System.in); //Object created
        System.out.println("Please enter the Customer name : ");//User need to respond to this que in Run window & then only related ans,data is displayed
        String customerName = myobj.nextLine();
        System.out.println(customerMapObj.get(customerName).getState());
        System.out.println(customerMapObj.get(customerName).getCity());
        System.out.println(customerMapObj.get(customerName).getCarModel());
        System.out.println(customerMapObj.get(customerName).getPhoneNumbers()); }}
