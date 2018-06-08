package task_1_preconditions;

import com.google.common.collect.Lists;

import java.util.Iterator;

import static com.google.common.base.Preconditions.*;

/**
 * Created by Jaszczynski.Rafal on 17.05.2018.
 */
public class PreconditionsExample {

  /*
    todo Create static methods:

    todo 1. checkArgument
      that will throw IllegalArgumentException if parameter is false

    todo 2. checkNotNull
      that will throw NullPointerException if parameter is null

    todo 3. checkElementIndex
      that will throw IndexOutOfBoundsException if provided index,
      is out of provided arrays length(exclusive)

    todo 4. checkPositionIndexes,
      that will throw IndexOutOfBoundsException, if provided start and end index,
      is out of provided arrays length(exclusive)
    */

  public static void main(String[] args) {
    boolean equals = "a".equals("b");

    checkArgument(equals);
    //IllegalArgumentException

    //just for clean code, the same as checkArgument, but for checking state of some object
    Iterator<Object> iterator = Lists.newArrayList().iterator();
    checkState(iterator.hasNext());
    //IllegalStateException

    checkNotNull(null);
    //NullPointerException

    //exclusive
    int[] ints = {1, 2, 3, 4};
    int i = checkElementIndex(4, ints.length);
    //IndexOutOfBoundsException

    //inclusive
    int i1 = checkPositionIndex(4, ints.length);
    //2

    //exclusive
    checkPositionIndexes(0, 4, ints.length);
    //IndexOutOfBoundsException
  }
}
