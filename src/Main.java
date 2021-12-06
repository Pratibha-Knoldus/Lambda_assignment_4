
interface AllNumbersProduct{
    int Result(long x,long y);
}

public class Main {
    public static void main(String...args){
        AllNumbersProduct obj = (x, y) -> {
            int res = 1;
            while (x < y)
                res *= y--;
            return res;
        };
        System.out.println(obj.Result(1,4));
    }
}
