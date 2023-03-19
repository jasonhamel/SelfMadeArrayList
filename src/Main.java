public class Main {
    public static void main(String[] args) {
        NewArray nr = new NewArray();
        nr.add("Jason");
        nr.add("Joel");
        nr.add("Scott");
        nr.add("Oats");
        nr.add("Kareen");

        for (int i = 0; i <nr.length(); i++) {
            System.out.println(nr.get(i));
        }
        System.out.println(nr.length());
    }
}