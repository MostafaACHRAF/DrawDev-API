class h extends Letter {

    h(String direction) {
        super(direction);
    }

    @Override
    String drawPart1() {
        return " _ " + endLine + endLine;
    }

    @Override
    String drawPart2() {
        return "| |" + endLine + endLine;
    }

    @Override
    String drawPart3() {
        return "| |__" + endLine;
    }

    @Override
    String drawPart4() {
        return "|  _ \\" + endLine;
    }

    @Override
    String drawPart5() {
        return "| | | |" + endLine;
    }

    @Override
    String drawPart6() {
        return "|_| |_|" + endLine;
    }
}
