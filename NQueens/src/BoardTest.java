import static org.junit.jupiter.api.Assertions.*;

class BoardTest
{

  @org.junit.jupiter.api.Test void isValidMove()
  {
    Board board = new Board(4);
    board.putPiece(2, 2);
    assertFalse(board.isValidMove(0, 0));
    assertTrue(board.isValidMove(1, 0));
    board.putPiece(1, 0);
    board.printBoard();
    assertTrue(board.isValidMove(0, 3));
    board.putPiece(0, 3);
    System.out.println();
    board.printBoard();
  }
}