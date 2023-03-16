package recursion;

public class BunnyEars2 {
    public int bunnyEar(int bunnies){
        if(bunnies ==0){
            return 0;
        }
        return bunnies % 2 == 0 ? bunnyEar(bunnies -1) +3 : bunnyEar(bunnies -1) +2;
    }

    public int bunnyEar2(int bunnies){
        return _bunnyEars(bunnies, 0);
    }
    private int _bunnyEars(int bunnies, int sum){
        if(bunnies ==0){
            return sum;
        }
        if(bunnies % 2 ==0){
            sum += 3;
        } else{
            sum +=2;
        }
        return _bunnyEars(bunnies -1, sum);
    }
}
