package Day12_Exercise;

import java.util.*;

public class CustomerDetailsImplementation_withScannersss {
    public static void main(String[] args) {
        List<String> phoneNumber = new ArrayList<>();
        phoneNumber.add("9000000000");
        phoneNumber.add("9000000001");
        HyundaiCustomerInfo_Template_withScannersss custInfo_obj1 = new HyundaiCustomerInfo_Template_withScannersss("Keerthi", "Kerala", "Kochi", "i20", phoneNumber);
        HyundaiCustomerInfo_Template_withScannersss custInfo_obj2 = new HyundaiCustomerInfo_Template_withScannersss("Suresh", "Karnataka", "Banglore", "i10", new ArrayList<String>(Arrays.asList("9800000000","9700000000")));
        HyundaiCustomerInfo_Template_withScannersss custInfo_obj3 = new HyundaiCustomerInfo_Template_withScannersss("Deva", "TN", "Madurai", "Creta", new ArrayList<String>(Arrays.asList("9400000000","9100000000")));
        custInfo_obj3.setCity("Tuticorin"); //To update the city name
//      Map Concept where Key are Names, Values are Objects
        Map<String, HyundaiCustomerInfo_Template_withScannersss> customerMapObj = new HashMap<String, HyundaiCustomerInfo_Template_withScannersss>();
        customerMapObj.put("Krishna",custInfo_obj1);
        customerMapObj.put("Siva",custInfo_obj2);
        customerMapObj.put("Diva",custInfo_obj3);
//  Retrieve Info :
        Scanner myobj = new Scanner(System.in); //Object created
        System.out.println("Please enter the Customer name : ");//User need to respond to this que in Run window & then only related ans,data is displayed
        String customerName = myobj.nextLine();
        System.out.println(customerMapObj.get(customerName).getState());
        System.out.println(customerMapObj.get(customerName).getCity());
        System.out.println(customerMapObj.get(customerName).getCarModel());
        System.out.println(customerMapObj.get(customerName).getPhoneNumbers()); }}


