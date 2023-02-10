public class Main {
    public static void main(String[] args) {
        Reverser reverser = new Reverser() {
            @Override
            public String do1(String str) {

                String[] array = str.split("");
                String result = "";

                for (int i = array.length - 1; i >= 0; i--) {
                    result = result + array[i];

                }if (str.equals(result)) {
                    System.out.println("Имеется палиндром.\n" + result);
                }else{
                    System.out.println("Палиндрома нет :(");
                }
                return result;
            }
        };
        System.out.println("Введите слово:");
        reverser.do1(new java.util.Scanner(System.in).nextLine());

    }
}