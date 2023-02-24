package _tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        ComputerAI test = new ComputerAI();
        test.availableMoves.put("Winning", new ArrayList<int[]>());
        test.availableMoves.get("Winning").add(0, new int[] {1,2,3,4,5});

        int[] arrTest = test.availableMoves.get("Winning").get(0);
        for(int currValue: arrTest){
            System.out.println(currValue);
        }

        System.out.println(Arrays.toString(test.availableMoves.get("Winning").get(0)));

        int[][] tmp = {{1,2,3}, {1,3,4,5,2,1}};

        List<String> listTMP = new ArrayList<>(List.of("Hello" ,"This", "Is", "A", "Test"));
        listTMP.add("Hello");

        System.out.println(listTMP);

        
        System.out.println(Arrays.deepToString(tmp));
    }
    
}
