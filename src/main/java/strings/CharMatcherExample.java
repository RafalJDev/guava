package strings;

import com.google.common.base.CharMatcher;

public class CharMatcherExample {

  public static void main(String[] args) {

    int i = CharMatcher.anyOf("abc")
       .countIn("sjfhjs abc weifj abc");
    //6

    String s = CharMatcher.isNot('a')
       .removeFrom("a bcwef a bcwgr");
    //aa
  }
}
