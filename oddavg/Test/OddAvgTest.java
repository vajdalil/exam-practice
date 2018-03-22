import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class OddAvgTest {
  List<Integer> lista;

  @Test
  public void oddAverage1() {
    lista = Arrays.asList(1, 3, 5, 7);
    assertEquals (4, (int) OddAvg.oddAverage(lista));
  }

  @Test
  public void oddAverage2() {
    lista = new ArrayList<>(Arrays.asList(2, 4, 2, 0));
    assertEquals(0, (int) OddAvg.oddAverage(lista));
  }

  @Test
  public void empty() {
    lista = new ArrayList<>(Arrays.asList());
    assertEquals(0, (int) OddAvg.oddAverage(lista));
  }

  @Test
  public void mixed() {
    lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    assertEquals(2, (int) OddAvg.oddAverage(lista));
  }

}
