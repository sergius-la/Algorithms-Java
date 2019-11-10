package variables;

public class SwapValue {

    /**
     * Swap by XOR operator
    * */
    public void swap(int a, int b) {
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
    }
}
