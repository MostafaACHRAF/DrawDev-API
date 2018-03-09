class g extends Letter {

    g(String direction) {
        super(direction);
    }

    @Override
    String drawPart1() {
        return " _____" + endLine;
    }

    @Override
    String drawPart2() {
        return "/  _  \\" + endLine;
    }

    @Override
    String drawPart3() {
        return "| (_) |" + endLine;
    }

    @Override
    String drawPart4() {
        return "\\___  |" + endLine;
    }

    @Override
    String drawPart5() {
        return " ___) |" + endLine;
    }

    @Override
    String drawPart6() {
        return "(_____/" + endLine;
    }
}
