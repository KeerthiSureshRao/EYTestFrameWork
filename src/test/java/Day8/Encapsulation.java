package Day8;

public class Encapsulation {
    private int age = 23;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
       this.age=age;  //points to the current class
}
    private String validateAge(){
        if(age>18){
            return "Major";
        }
        else {
            return "Minor";
        }
    }
    public String getAgeStatus(){
        String status = validateAge_Newlogic();
        return status;
    }
    private String validateAge_Newlogic(){
        if(age>20) {
            return "Major"; }
        else{return "Minor";}
    }
}
