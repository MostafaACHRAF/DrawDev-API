class D extends Letter {

    D(String direction) {
        super(direction);
    }

    @Override
    String drawPart1() {
        return " ____" + endLine;
    }

    @Override
    String drawPart2() {
        return "|  _ \\" + endLine;
    }

    @Override
    String drawPart3() {
        return "| | \\ \\" + endLine;
    }

    @Override
    String drawPart4() {
        return "| | | |" + endLine;
    }

    @Override
    String drawPart5() {
        return "| |_/ /" + endLine;
    }

    @Override
    String drawPart6() {
        return "|___ /" + endLine;
    }
}
