import java.util.ArrayList;
import java.util.Arrays;

public class golfingTest {
  public static void main (String[] args) {
    ArrayList adam = new ArrayList<Integer>(Arrays.asList(new Integer[]{1,2,3}));
    ArrayList bob = new ArrayList<Integer>(Arrays.asList(new Integer[]{2,2,2}));
    ArrayList craig = new ArrayList<Integer>(Arrays.asList(new Integer[]{1,2,2}));
    System.out.println("1. Expects craig");
    System.out.println(golfingBrothers(adam,bob,craig));

    adam = new ArrayList<Integer>(Arrays.asList(new Integer[]{1}));
    bob = new ArrayList<Integer>(Arrays.asList(new Integer[]{50,55,60}));
    craig = new ArrayList<Integer>(Arrays.asList(new Integer[]{52,54,58}));
    System.out.println("\n2. Expects craig");
    System.out.println(golfingBrothers(adam,bob,craig));

    adam = new ArrayList<Integer>(Arrays.asList(new Integer[]{45,46,52}));
    bob = new ArrayList<Integer>(Arrays.asList(new Integer[]{50,55,60}));
    craig = new ArrayList<Integer>(Arrays.asList(new Integer[]{52,54,58}));
    System.out.println("\n3. Expects adam");
    System.out.println(golfingBrothers(adam,bob,craig));

    adam = new ArrayList<Integer>(Arrays.asList(new Integer[]{60,60}));
    bob = new ArrayList<Integer>(Arrays.asList(new Integer[]{43,32,29}));
    craig = new ArrayList<Integer>(Arrays.asList(new Integer[]{52,54,58}));
    System.out.println("\n4. Expects bob");
    System.out.println(golfingBrothers(adam,bob,craig));
  }
  public static double averageList(ArrayList<Integer> adamList) {
    double adamAverage = 0;
    if (adamList.size() < 2) {adamAverage += Math.pow(2,31);}
    for (int i = 0; i < adamList.size(); i++) {
      adamAverage += adamList.get(i);
    }
    return adamAverage / adamList.size();
  }
  public static String golfingBrothers(ArrayList<Integer> adamList,
  ArrayList<Integer> bobList, ArrayList<Integer> craigList) {
    double adamAverage = averageList(adamList);

    double bobAverage = averageList(bobList);

    double craigAverage = averageList(craigList);

    if (adamAverage < bobAverage) {
      if (adamAverage < craigAverage) {
        return "adam";
      } else if (bobAverage < craigAverage) {
        return "bob";
      } else {return "craig";}
    } else if (bobAverage < craigAverage) {
      return "bob";
    } else {return "craig";}

    //end
  }
}
