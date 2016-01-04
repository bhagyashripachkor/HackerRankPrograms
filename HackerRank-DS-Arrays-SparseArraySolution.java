import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
  static ArrayList<String> arr = new ArrayList<String>();
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = Integer.parseInt(in.nextLine());
    int x = 0;
    while(x != n){
      String input = in.nextLine();
      insert(input);
      x++;
    }
    int queries = Integer.parseInt(in.nextLine());
    int y = 0;
    while(y != queries){
      String query = in.nextLine();
      occur(query);
      y++;
    }
    in.close();
  }

  private static void occur(String query) {
    // TODO Auto-generated method stub
    int count = 0;
    for(int i = 0; i < arr.size(); i++){
      if(arr.get(i).contentEquals(query))
        count++;
      
    }
    System.out.println(count);
    
  }

  private static void insert(String input) {
    // TODO Auto-generated method stub
    arr.add(input);
  }
}
