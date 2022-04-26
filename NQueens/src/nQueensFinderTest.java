import static org.junit.jupiter.api.Assertions.*;

class nQueensFinderTest
{
  @org.junit.jupiter.api.Test void nQueensFindMax()
  {
    nQueensFinder nqf = new nQueensFinder(4);
    assertEquals(4, nqf.getCurrentMax());

    System.out.println("-------------------------------");
    nQueensFinder nqf2 = new nQueensFinder(3);
    assertEquals(2, nqf2.getCurrentMax());

    System.out.println("-------------------------------");
    nQueensFinder nqf3 = new nQueensFinder(5);
    assertEquals(5, nqf3.getCurrentMax());




  }
}