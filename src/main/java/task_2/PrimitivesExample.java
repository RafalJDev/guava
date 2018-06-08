package task_2;

import com.google.common.primitives.*;

public class PrimitivesExample {

    /*
    todo Create statics methods

    todo 1. max,
      with given array of ints, return max value

    todo 2. min,
      with given array of ints, return min value

    todo 3. concat,
      with given n arrays, concatenate arrays all arrays to one array
      and return this new array

    todo 4. reverse
      with given array reverse all its elements
      and return that array
    */

  public static void ints() {

    int max = Ints.max(10, 6, 7, 4, 56, 5, 8);
    //-> 56

    int min = Ints.min(10, 6, 7, 4, 56, 5, 8);
    //-> 4

    int[] arrayOne = {1, 2, 3, 4};
    int[] arrayTwo = {5, 6, 7};

    //no in jdk
    int[] concat = Ints.concat(arrayOne, arrayTwo);
    //1234567

    //how to print array ? with stream ?

    Ints.reverse(concat);
    //7654321

    boolean contains = Ints.contains(concat, 8);
    //false

    int compare = Ints.compare(4, 7);
    //-1 like comparator

    String hanys = Ints.join("hanys", concat);
    //7hanys6hanys5hanys4hanys3hanys2hanys1

    int i = Ints.constrainToRange(3, 5, 10);
    //5

    int i2 = Ints.constrainToRange(3, 3, 10);
    //3

    int index = Ints.indexOf(concat, 6);
    //1
  }

  public void otherPrimitives() {
    Bytes.asList(new byte[2]);
    SignedBytes.max(new byte[2]);
    UnsignedBytes.max(new byte[2]);

    Shorts.asList(new short[2]);

    Ints.asList(1);
    UnsignedInteger.valueOf(1L);
    UnsignedInts.max(new int[2]);

    Longs.asList(1);
    UnsignedLong.valueOf(1L);
    UnsignedLongs.max(new long[2]);

    Doubles.asList(1);

    Chars.asList(new char[2]);

    Booleans.asList(new boolean[2]);
  }

}
