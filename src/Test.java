public class Test {
    public static void main(String[] args) {
        a lettera = new a("H");
        A letterA = new A("H");
        B letterB = new B("H");
        b letterb = new b("H");
        int index = 1;
        for (int i = index; i <= 6 ; i++) {
            System.out.print(lettera.drawH(i));
            System.out.print(letterA.drawH(i));
            System.out.print(letterB.drawH(i));
            System.out.print(letterb.drawH(i));
            System.out.println("");
        }

        //System.out.println(letterA.drawV());
    }
}
