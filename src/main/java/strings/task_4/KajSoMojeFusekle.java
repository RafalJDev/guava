package strings.task_4;

/**
 * Created by Jaszczynski.Rafal on 07.06.2018.
 */
public class KajSoMojeFusekle {

  /*
    todo add logic so split will print as provided below in comment
  */

  public static void main(String[] args) {

    Iterable<String> split = KajSoMojeFusekle.on(",")
       .omitEmptyStrings()
       .trimResults()
       .split("Kaj, so ,,   moje ,,  , fusekle");
    //Kaj
    //so
    //moje
    //fusekle

    Iterable<String> split2 = KajSoMojeFusekle.on(",")
       .omitEmptyStrings()
       .trimResults()
       .limit(2)
       .split("Kaj, so ,,   moje ,,  , fusekle");
    //Kaj
    //so
  }

  private static KajSoMojeFusekle on(String s) {
    return null;
  }

  private KajSoMojeFusekle trimResults() {
    return null;
  }

  private KajSoMojeFusekle omitEmptyStrings() {
    return null;
  }

  private KajSoMojeFusekle limit(int i) {
    return null;
  }

  private Iterable<String> split(String s) {
    return null;
  }

}
