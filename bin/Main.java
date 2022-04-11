public class Main {

    static void dectobin(int d){
        if (d == 0) {
            return;
        }
        //System.out.println(d%2);
        dectobin(d/2);
        System.out.println(d%2);
    }
    public static void main(String[] args) {
        dectobin(12);
    }
}