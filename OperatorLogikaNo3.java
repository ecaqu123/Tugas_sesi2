package projectelsa;

public class OperatorLogikaNo3 {
    public static void main(String[] args) {
        boolean data_1 = true;
        boolean data_2 = false;
        boolean result;
        
        result = data_1 && data_2;
        System.out.println(data_1 + "&&" + data_2 + "=" + result);
        
        result = data_1 || data_2;
        System.out.println(data_1 + "&&" + data_2 + "=" + result);
        
        result = !data_1;
        System.out.println(data_1 + "!" + "=" + result);
        
        result = data_2;
        System.out.println(data_2 + "!"+"="+result);
        
    }
}