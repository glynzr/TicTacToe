import java.util.HashSet;

public class Board {
    String[][] gameBoard = {
            {"  \t", "|\t", "  \t", "|\t", "  \t"},
            {"--\t", "+\t", "--\t", "+\t", "--\t"},
            {"  \t", "|\t", "  \t", "|\t", "  \t"},
            {"--\t", "+\t", "--\t", "+\t", "--\t"},
            {"  \t", "|\t","  \t", "|\t", "  \t"},
    };

    HashSet <Integer> filledCells = new HashSet<Integer>();
    public void printBoard(){
        for (byte i = 0; i < (byte) 5; i++){
            for (String element : gameBoard[i]){
                System.out.print(element);
            }
            System.out.print("\n");
        }
    }

    public void insertBoard(int n,String icon){
        filledCells.add(n);
        switch (n){
            case 1:
                gameBoard[0][0]=icon+"\t";
                break;

            case 2:
                gameBoard[0][2]=icon+"\t";
                break;

            case 3:
                gameBoard[0][4]=icon+"\t";
                break;

            case 4:
                gameBoard[2][0]=icon+"\t";
                break;

            case 5:
                gameBoard[2][2]=icon+"\t";
                break;

            case 6:
                gameBoard[2][4]=icon+"\t";
                break;

            case 7:
                gameBoard[4][0]=icon+"\t";
                break;

            case 8:
                gameBoard[4][2]=icon+"\t";
                break;

            case 9:
                gameBoard[4][4]=icon+"\t";
                break;

            default:
                break;
        }
    }

    public boolean isFilled(int N){
        return filledCells.contains(N);
    }



    // small                        // big
//        x | o | x // (0,0); (0,1); (0,2);     // (0,0); (0,2); (0,4);
//       ---+---+---
//        o | x | o // (1,0); (1,1); (1,2);     // (2,0); (2,2); (2,4);
//       ---+---+---
//        x | o | o // (2,0); (2,1); (0,2);     // (4,0); (4,2); (4,4);

}