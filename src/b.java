public class b extends Letter {

    b(String direction) {
        super(direction);
    }

    @Override
    String drawPart1() {
        return " _";
    }

    @Override
    String drawPart2() {
        return "| |";
    }

    @Override
    String drawPart3() {
        return "| |_";
    }

    @Override
    String drawPart4() {
        return "|  _ \\";
    }

    @Override
    String drawPart5() {
        return "| |_| |";
    }

    @Override
    String drawPart6() {
        return "|____/";
    }
}
