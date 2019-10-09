public class Numbers{
    public static int number = 10;
    public static void main(String[] args) {
        try {
            tryNum();
        }
        catch (ArithmeticException e){
            System.out.println("Catched it");
        }
    }

    public static void tryNum() throws ArithmeticException{
        int six = 10;
        int totaol = number/six;
        System.out.println(totaol);
        throw new ArithmeticException();
    }
}