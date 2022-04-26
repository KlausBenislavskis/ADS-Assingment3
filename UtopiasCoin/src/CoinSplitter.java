import java.util.HashMap;

public class CoinSplitter
{
  static int[] values = {1, 7, 10, 12};
  public HashMap<Integer, Integer> history = new HashMap<>();

  public int splitCoinDyn(int coin)
  {
    if (history.containsKey(coin))
      return history.get(coin);
    int min = coin;
    for (int value : values)
    {
      if (coin - value >= 0)
      {
        int current = coin - value == 0 ? 1 : 1 + splitCoinDyn(coin - value);
        if (current <= min)
          min = current;
      }
    }
    history.put(coin, min);
    return min;
  }

  public int splitCoinForceRec(int coin)
  {
    int min = coin;
    for (int value : values)
    {
      if (coin - value >= 0)
      {
        int current =
            coin - value == 0 ? 1 : 1 + splitCoinForceRec(coin - value);
        if (current <= min)
          min = current;
      }
    }
    return min;
  }
}