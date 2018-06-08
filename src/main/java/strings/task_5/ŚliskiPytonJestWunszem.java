package strings.task_5;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Jaszczynski.Rafal on 07.06.2018.
 */
public class ŚliskiPytonJestWunszem {

  public static void main(String[] args) {
    String join = ŚliskiPytonJestWunszem.on("; ")
       .skipNulls()
       .join("Śliski", null, "pyton", "jest", "wunszem");
    //-> Śliski; pyton; jest; wunszem

    String join1 = ŚliskiPytonJestWunszem.on(",").join(Arrays.asList(1, 5, 7));
    //-> 1,5,7

    StringBuilder stringBuilder = new StringBuilder(join).append(" ");
    StringBuilder stringBuilder1 = ŚliskiPytonJestWunszem.on(" :D ")
       .appendTo(stringBuilder, Arrays.asList(7, 7, 7).toArray());
    //Śliski; pyton; jest; wunszem 7 :D 7 :D 7
  }

  private static ŚliskiPytonJestWunszem on(String s) {
    return null;
  }

  private <T> String join(List<T> ts) {
    return null;
  }

  private String join(String... string) {
    return null;
  }

  private StringBuilder appendTo(StringBuilder stringBuilder, Object[] objects) {
    return null;
  }

  private ŚliskiPytonJestWunszem skipNulls() {
    return null;
  }
}
