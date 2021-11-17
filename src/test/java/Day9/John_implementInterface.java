package Day9;

public class John_implementInterface implements ArithmaticInterface{
    @Override
    public int addition(int i, int j) {
        return i+j;
    }
    @Override
    public int subtract(int i, int j) {
        return i-j;
    }
    public int divide(int i, int j) {
        return i/j;
    }
}
