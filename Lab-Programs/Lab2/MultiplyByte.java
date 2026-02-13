public class MultiplyByte {
    public static void main(String[] args){
        byte n = 1;

        for(int i = 1; i<=8; i++){
            n = (byte)(n*2);
            System.out.println(i + " times Multiplication value: "+n);
        }
    }
}