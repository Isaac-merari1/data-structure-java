package recursion;

public class recursionExamples {
    public int bunnyEars(int bunnies){
        if(bunnies == 0){
            return 0;
        }
        return 2 + bunnyEars(bunnies -1);
    }

    public int bunnyEars2(int bunnies){
       return _bunnyEars(bunnies, 0);
    }

    private int _bunnyEars(int bunnies, int sum){
        if(bunnies ==0){
            return sum;
        }
        return _bunnyEars(bunnies -1, sum+2);
    }
}
