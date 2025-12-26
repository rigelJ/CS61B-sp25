public class HelloNum {
    /**Return the larger of x and y*/
    public static void main(String[] args){
        int x = 0;
        while(x < 10){
            System.out.println(larger(x,7));
            x = x + 1;
        }
    }
    public static int larger(int x,int y){
        if(x < y){
            return x;
        } else {
            return y;
        }
    }
}
