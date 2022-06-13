public class Main {
    public static void main(String[] args) {
        int value1 = 1000000011;
        int value2 = 111000;
        int totalValue = addValue(value1, value2);
        char ch1 = 13;
        int ch2 = 1;
        int ch3 = 10;
        int ch4 = 22;
        int sheep = 10;
        String word1 = "Rezultat raven:";
        String word2 = "ovec (shtuk)";

        System.out.println(totalValue);
        System.out.println(ch1 + ch2);
        System.out.println(ch1 + ch3);
        System.out.println(ch1 + ch4);
        System.out.println(ch1 - ch2);
        System.out.println(ch1 - ch3);
        System.out.println(ch1 - ch4);
        System.out.println(word1 + " " + sheep + " " + word2);
    }
    public static int addValue(int value1, int value2) {
        int result = 0;

        result = value1 + value2;

        return result;


    }
}
