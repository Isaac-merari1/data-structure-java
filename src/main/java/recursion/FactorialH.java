package recursion;

public class FactorialH {
    public int factorialH1(int n){
        return _fact(n, 1);
    }
    private int _fact(int n, int sum){
        if(n < 1){
            return 1;
        }
        return n * _fact(n-1, sum);
    }

    public int factorialH2(int n){
        return _fact(n);
    }
    private int _fact(int n){
        if(n < 1){
            return 1;
        }
        return n * _fact(n-1);
    }
}
