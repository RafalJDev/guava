package strings.task_4;

import com.google.common.base.Splitter;

public class SplitterExample {

  public static void main(String[] args) {

    Iterable<String> split = Splitter.on(',')
       .trimResults()
       .omitEmptyStrings()
       .split("foo,bar,,  qux");
    //foo
    //bar
    //qux

    Iterable<String> split1 = Splitter.on(",")
       .omitEmptyStrings()
       .trimResults()
       .split("a,b,c  ,,,   ,, d,  e ,  f");
    //a
    //b
    //c
    //d1
    //e
    //f

    Iterable<String> split2 = Splitter.on(",")
       .omitEmptyStrings()
       .trimResults()
       .limit(4)
       .split("a,b,c  ,,,  ,, d,  e ,  f");
    //a
    //b
    //c
    //d,  e ,  f

    onPattern();
  }

  public static void onPattern() {

    Iterable<String> split1 = Splitter.onPattern("\\D{2}")
       .split("12a34ab56bbb78");
    //12a34
    //56
    //b78

  }
}
