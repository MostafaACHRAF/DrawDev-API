class G extends Letter {

    G(String direction) {
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
        return "| | __" + endLine;
    }

    @Override
    String drawPart4() {
        return "| ||_ |" + endLine;
    }

    @Override
    String drawPart5() {
        return "| |_| |" + endLine;
    }

    @Override
    String drawPart6() {
        return "\\_____/" + endLine;
    }
}
