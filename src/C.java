public class C extends Letter {

    C(String direction) {
        super(direction);
    }

    @Override
    String drawPart1() {
        return " _____" + endLine;
    }

    @Override
    String drawPart2() {
        return "/  ___|" + endLine;
    }

    @Override
    String drawPart3() {
        return "| |" + endLine+endLine;
    }

    @Override
    String drawPart4() {
        return "| |" + endLine+endLine;
    }

    @Override
    String drawPart5() {
        return "| |___" + endLine;
    }

    @Override
    String drawPart6() {
        return "\\_____|" + endLine;
    }

}
