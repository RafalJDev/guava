package strings.task_5;

import com.google.common.base.Joiner;

import java.util.Arrays;

public class JoinerExample {

  public static void main(String[] args) {
    String join = Joiner.on("; ")
       .skipNulls()
       .join("Śliski", null, "pyton", "jest", "wunszem");
    //-> Śliski; pyton; jest; wunszem

    String join1 = Joiner.on(",").join(Arrays.asList(1, 5, 7));
    //-> 1,5,7

    StringBuilder stringBuilder = new StringBuilder(join).append(" ");
    StringBuilder stringBuilder1 = Joiner.on(" :D ")
       .appendTo(stringBuilder, Arrays.asList(7, 7, 7).toArray());
    //Śliski; pyton; jest; wunszem 7 :D 7 :D 7
  }

}
