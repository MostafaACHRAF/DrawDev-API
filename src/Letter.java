abstract class Letter {

    String endLine;

    Letter(String direction) {
        if (direction.equals("V")) {
            this.endLine = "\n";
        } else {
            this.endLine = "\t";
        }
    }

    String drawH(int partIndex) {
        switch (partIndex) {
            case 1:
                return drawPart1();
            case 2:
                return drawPart2();
            case 3:
                return drawPart3();
            case 4:
                return drawPart4();
            case 5:
                return drawPart5();
            case 6:
                return drawPart6();
        }
        return "Noting to draw !";
    }

    String drawV() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(drawPart1());
        stringBuilder.append(drawPart2());
        stringBuilder.append(drawPart3());
        stringBuilder.append(drawPart4());
        stringBuilder.append(drawPart5());
        return String.valueOf(stringBuilder);
    }

    abstract String drawPart1();

    abstract String drawPart2();

    abstract String drawPart3();

    abstract String drawPart4();

    abstract String drawPart5();

    abstract String drawPart6();
}
