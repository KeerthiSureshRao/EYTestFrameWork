package Day9;

public class ImplementArithmatic implements ArithmaticInterface{

    @Override
    public int addition(int i, int j) {
        return i+j;
    }

    @Override
    public int subtract(int i, int j) {
        return i-j;
    }
    public int multiply(int i, int j){
        return i*j;
    }
}
