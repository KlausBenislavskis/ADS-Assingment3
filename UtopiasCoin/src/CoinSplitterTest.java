import static org.junit.jupiter.api.Assertions.*;

class CoinSplitterTest
{

  @org.junit.jupiter.api.Test void findMaxValueDynTest()
  {
    CoinSplitter myRodSplitter = new CoinSplitter();
    assertEquals(3, myRodSplitter.splitCoinDyn(15));
    assertEquals(3, myRodSplitter.splitCoinDyn(30));
    assertEquals(4, myRodSplitter.splitCoinDyn(43));
    assertEquals(451, myRodSplitter.splitCoinDyn(5407));

  }
  @org.junit.jupiter.api.Test void findMaxValueRecTest()
  {
    CoinSplitter myRodSplitter = new CoinSplitter();
    assertEquals(3, myRodSplitter.splitCoinForceRec(15));
    assertEquals(3, myRodSplitter.splitCoinForceRec(30));
    assertEquals(4, myRodSplitter.splitCoinForceRec(43));
    assertEquals(451, myRodSplitter.splitCoinForceRec(5407));


  }
}