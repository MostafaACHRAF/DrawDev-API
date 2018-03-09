class e extends Letter {

    e(String direction) {
        super(direction);
    }

    @Override
    String drawPart1() {
        return " ____ " + endLine;
    }

    @Override
    String drawPart2() {
        return "/  _ \\" + endLine;
    }

    @Override
    String drawPart3() {
        return "| (_) |"+endLine;
    }

    @Override
    String drawPart4() {
        return "|  __/" + endLine;
    }

    @Override
    String drawPart5() {
        return "\\ \\___" + endLine;
    }

    @Override
    String drawPart6() {
        return " \\____/" + endLine;
    }
}
