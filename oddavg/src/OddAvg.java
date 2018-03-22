import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddAvg {

  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5));
    System.out.println(oddAverage(list));
  }

  public static double oddAverage(List<Integer> listOfNumbers) {
    double oddSum = 0;
    double oddCount = 0;
    for (int i = 0; i < listOfNumbers.size(); i++) {
      if (listOfNumbers.get(i) % 2 != 0) {
        oddSum = oddSum + listOfNumbers.get(i);
        oddCount++;
      }
    }
    if (oddCount != 0) {
      return oddSum / oddCount;
    } else {
      return 0;
    }
  }
}
