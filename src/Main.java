import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        int cellNo;

        System.out.print("1st player:");
        String player_1 = scanner.nextLine();

        System.out.print("2nd player:");
        String player_2 = scanner.nextLine();

        System.out.print(player_1 + ",which one do you want to play with(X or O)?");
        String ply_1 = scanner.nextLine();
        String ply_2 = (ply_1.equals("X")) ? "O" : "X";

        board.printBoard();

        //defining player who plays first
        String first_player;
        String second_player;
        if (ply_1.equals("X")) {
            first_player = player_1;
            second_player = player_2;
        } else {
            first_player = player_2;
            second_player = player_1;
        }
        System.out.println("\nLet's begin!!!");


        while (true) {
            System.out.print(first_player + ",enter the cell number: ");

            while (true){
                cellNo = scanner.nextInt();
                if (board.isFilled(cellNo)){
                    System.out.println("This cell is filled!!!");
                    System.out.print("Enter the cell number again:");
                }else{
                    break;
                }

            }
            board.insertBoard(cellNo, "X");
            board.printBoard();


            if (board.filledCells.size() == 9) {
                if (!Winner.isWinningCondition(board.gameBoard)) {
                    System.out.println("End of the game!\nDRAW!!!");
                } else {
                    System.out.println("End of the game!!\n"+first_player+",you are the WINNER!!");
                }
                break;
            } else {
                if (Winner.isWinningCondition(board.gameBoard)) {
                    System.out.println("End of the game!!\n"+first_player+",you are the WINNER!!");
                    break;
                }
            }

            System.out.print(second_player + ",enter the cell number: ");
            while (true){
                cellNo = scanner.nextInt();
                if (board.isFilled(cellNo)){
                    System.out.println("This cell is filled!!!");
                    System.out.print("Enter the cell number again:");
                }else{
                    break;
                }

            }
            board.insertBoard(cellNo, "O");
            board.printBoard();


            if (board.filledCells.size() == 9) {
                if (!Winner.isWinningCondition(board.gameBoard)) {
                    System.out.println("End of the game!\nDRAW!!!");
                } else {
                    System.out.println("End of the game!!\n"+second_player+",you are the WINNER!!");
                }
                break;
            } else {
                if (Winner.isWinningCondition(board.gameBoard)) {
                    System.out.println("End of the game!!\n"+second_player+",you are the WINNER!!");
                    break;
                }

            }


        }
    }
}