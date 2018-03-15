class J extends Letter {

    J(String direction) {
        super(direction);
    }

    @Override
    String drawPart1() {
        return "     _" + endLine;
    }

    @Override
    String drawPart2() {
        return "    | |" + endLine;
    }

    @Override
    String drawPart3() {
        return "    | |" + endLine;
    }

    @Override
    String drawPart4() {
        return "    | |" + endLine;
    }

    @Override
    String drawPart5() {
        return " ___| |" + endLine;
    }

    @Override
    String drawPart6() {
        return "(_____/" + endLine;
    }
}
