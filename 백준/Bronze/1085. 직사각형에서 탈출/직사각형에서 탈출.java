import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y= in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();

        System.out.println(Math.min(Math.min(x,y),Math.min((w-x),(h-y))));
    }
}