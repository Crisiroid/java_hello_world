public class main {
    public static void main(String[] args){
        //importing input class
        input Input = new input();
        //using import method
        input.input();

        //operators
        operator Operator = new operator();
        Operator.operator();
        int h = 2;
        long w = 12312421315214l;
        float f = 1.23124213f;
        String x = "water";
        String y = "kool-aid";
        String temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("y: " + y);
        System.out.println("x: " + x);
    }
}
