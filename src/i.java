class i extends Letter {

    i(String direction) {
        super(direction);
    }

    @Override
    String drawPart1() {
        return " _" + endLine;
    }

    @Override
    String drawPart2() {
        return "(_)" + endLine;
    }

    @Override
    String drawPart3() {
        return " _" + endLine;
    }

    @Override
    String drawPart4() {
        return "| |" + endLine;
    }

    @Override
    String drawPart5() {
        return "| |" + endLine;
    }

    @Override
    String drawPart6() {
        return "|_|" + endLine;
    }
}
