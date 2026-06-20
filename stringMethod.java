public class stringMethod {
    public static void main(String[] args) {
        String first = "Cod";
        String second = "ingal";
        String codingal = first + second;
        String codingalTrick = "Welcome" + "to" + codingal;
        String codingalCapital = codingal.toUpperCase();
        String codingalSmall = codingal.toLowerCase();

        int lengthOfCodingal = codingal.length();
        int lengthofCodingalTrick = codingalTrick.length();
        int sum = lengthOfCodingal + lengthofCodingalTrick;

        System.out.println(codingal);
        System.out.println(codingalTrick);
        System.out.println(codingalCapital);
        System.out.println(codingalSmall);
        System.out.println(sum);
    }
}