package corejava.practice;

public class Try {
    public void myTest(int[] array) {
        array[1]++;
  }

  public static void main(String args[]) {
      Try mt = new Try();
      int[] myArray = new int[1];
      mt.myTest(myArray);
      System.out.println(myArray[1]);
  }
}