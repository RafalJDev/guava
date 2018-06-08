package strings.task_3;

import com.google.common.base.Strings;

import java.util.Objects;

/**
 * Created by Jaszczynski.Rafal on 16.05.2018.
 */
public class StringsExample {

  /*
    todo create static methods

    todo 1. isNullOrEmpty
      Takes string and checks if it's null or empty
      return result as boolean

    todo 2. repeat
      Takes string and count
      and return this  string repeated x times

      e.g. repeat("Jo je dupny ", 3)
      "Jo je dupny Jo je dupny Jo je dupny "

    todo 3. padEnd
    takes string, minLength and padChar
    and return string with appended padChar

    Simply add x times padChar to the end of given string
    x = string.length() - minLength

    Ask me and I will explain

    e.g.
    String string = "Kaj leziesz, tam je Sosnowiec";
    String padEnd = Strings.padEnd(string, string.length() + 10, '!');
    padEnd -> Kaj leziesz, tam je Sosnowiec!!!!!!!!!!

     */
  public static void main(String[] args) {

    Strings.isNullOrEmpty("");
    //true

    String s = Strings.emptyToNull("");
    //s -> null

    String s1 = Strings.nullToEmpty(null);
    //s1 -> ""
    String s2 = Strings.nullToEmpty("cos");
    //s2 -> "cos"

    String repeat = Strings.repeat("I'm awesome ", 5);
    //I'm awesome I'm awesome I'm awesome I'm awesome I'm awesome

    String to = Strings.commonPrefix("Katowice to Polska Barcelona", "Katowice to ");
    //to -> Katowice to

    String string = "Kaj leziesz, tam je Sosnowiec";
    String padEnd = Strings.padEnd(string, string.length() + 10, '!');
    //c -> Kaj leziesz, tam je Sosnowiec!!!!!!!!!!

    String padStart = Strings.padStart(padEnd, padEnd.length() + 10, '!');
    //padStart -> !!!!!!!!!!Kaj leziesz, tam je Sosnowiec!!!!!!!!!!

    String a = "a";
    String b = "b";
    boolean equals = Objects.equals(a, b);

  }

}
