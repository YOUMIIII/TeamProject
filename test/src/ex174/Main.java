package ex174;

import java.util.Scanner;

public class Main {
    private final int sub1;
    private final int sub2;
    private final int sub3;
    private final int sum;

    int test;
    String yeahhhhhhhhhhhhhhh;

    String mergeTest;

    public Main(int sub1, int sub2, int sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sum=sub1+sub2+sub3;
    }
    int test2, test3;

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Main[] mains=new Main[3];
        int sub1Sum = 0,sub2Sum=0,sub3Sum=0,sumSum=0;
        for(int i=0;i<mains.length;i++){
            int sub1=sc.nextInt();
            int sub2=sc.nextInt();
            int sub3=sc.nextInt();
            mains[i]=new Main(sub1,sub2,sub3);
            mains[i].getSubAndSum();
            sub1Sum+=mains[i].getSub1();
            sub2Sum+=mains[i].getSub2();
            sub3Sum+=mains[i].getSub3();
            sumSum+=mains[i].getSum();
        }
        System.out.println(sub1Sum+" "+sub2Sum+" "+sub3Sum+" "+sumSum);
    }

    public void getSubAndSum(){
        System.out.println(sub1+" "+sub2+" "+sub3+" "+sum);
    }

    public int getSub1() {
        return sub1;
    }

    public int getSub2() {
        return sub2;
    }

    public int getSub3() {
        return sub3;
    }

    public int getSum() {
        return sum;
    }
}
//안녕하세요?

//네 안녕하세요?