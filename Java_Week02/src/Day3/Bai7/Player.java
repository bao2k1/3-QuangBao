package Day3.Bai7;

// Lớp Player đại diện cho người chơi
class Player {
    private String name;
    private char mark;

    public Player(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public char getMark() {
        return mark;
    }
}
