public class Winner {
    public static boolean isWinningCondition(String[][] myBoard) {
        //diaqonallar uzre
        if (myBoard[0][0].equals(myBoard[2][2]) && myBoard[4][4].equals(myBoard[2][2]) && !myBoard[2][2].trim().equals("")
                || myBoard[0][4].equals(myBoard[2][2]) && myBoard[4][0].equals(myBoard[2][2]) && !myBoard[2][2].trim().equals("")) {
                return true;
        }


        // horizontallar uzre
        for (int i = 0; i < 5; i += 2) {
            if (myBoard[i][0].equals(myBoard[i][2]) && myBoard[i][4].equals(myBoard[i][2]) &&  !myBoard[i][2].trim().equals("")){
                return true;
            }
        }

        // verticallar uzre
        for (int i = 0; i < 5; i += 2) {
            if (myBoard[0][i].equals(myBoard[2][i]) && myBoard[4][i].equals(myBoard[2][i]) &&  !myBoard[2][i].trim().equals("")){
                return true;
            }
        }
        return false;
    }
}
