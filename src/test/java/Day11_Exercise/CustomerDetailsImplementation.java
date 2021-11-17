package Day11_Exercise;
import Day11.HashMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;import java.util.Map;
public class CustomerDetailsImplementation {
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
        System.out.println(customerMapObj.get("Suresh").getState());
        System.out.println(customerMapObj.get("Suresh").getCarModel());
        System.out.println(customerMapObj.get("Suresh").getPhoneNumbers());
    }}
