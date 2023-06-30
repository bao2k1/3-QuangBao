package Day3.Bai7;

// Lớp Board đại diện cho bảng cờ
class Board {
    private char[][] grid;
    private int size;

    public Board(int size) {
        this.size = size;
        grid = new char[size][size];
        initialize();
    }

    public void initialize() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (grid[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean placeMark(int row, int col, char mark) {
        if (row >= 0 && row < size && col >= 0 && col < size && grid[row][col] == '-') {
            grid[row][col] = mark;
            return true;
        } else {
            return false;
        }
    }
    public int getSize() {
        return size;
    }
    public boolean checkWin(char mark) {
        // Kiểm tra hàng và cột
        for (int i = 0; i < size; i++) {
            boolean rowWin = true;
            boolean colWin = true;
            for (int j = 0; j < size; j++) {
                if (grid[i][j] != mark) {
                    rowWin = false;
                }
                if (grid[j][i] != mark) {
                    colWin = false;
                }
            }
            if (rowWin || colWin) {
                return true;
            }
        }

        // Kiểm tra đường chéo chính và đường chéo phụ
        boolean mainDiagonalWin = true;
        boolean antiDiagonalWin = true;
        for (int i = 0; i < size; i++) {
            if (grid[i][i] != mark) {
                mainDiagonalWin = false;
            }
            if (grid[i][size - 1 - i] != mark) {
                antiDiagonalWin = false;
            }
        }
        if (mainDiagonalWin || antiDiagonalWin) {
            return true;
        }

        return false;
    }
}