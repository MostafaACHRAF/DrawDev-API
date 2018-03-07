class D extends Letter {

    D(String direction) {
        super(direction);
    }

    @Override
    String drawPart1() {
        return " _____" + endLine;
    }

    @Override
    String drawPart2() {
        return "|  __ \\" + endLine;
    }

    @Override
    String drawPart3() {
        return "| |  \\ \\" + endLine;
    }

    @Override
    String drawPart4() {
        return "| |   | |" + endLine;
    }

    @Override
    String drawPart5() {
        return "| |__/ /" + endLine;
    }

    @Override
    String drawPart6() {
        return "|____ /" + endLine;
    }
}
