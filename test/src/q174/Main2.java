//3명 학생의 3과목 점수를 입력받아 각 과목별 학생별 총점을 출력하는 구조화된 프로그램을 작성하시오.

package q174;

import java.util.Scanner;
public class Main2 {
    int sco1, sco2, sco3, sum;
    Main2(int sco1, int sco2, int sco3){
        this.sco1 = sco1;
        this.sco2 = sco2;
        this.sco3 = sco3;
        this.sum = sco1 + sco2 + sco3;
    }
//    int getSco1(){
//        return sco1;
//    }
//    int getSco2(){
//        return sco2;
//    }
//    int getSco3(){
//        return sco3;
//    }
//    int getSum(){
//        return sum;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main2[] main2 = new Main2[3];
        for(int i = 0; i<3; i++){
            int sco1 = sc.nextInt();
            int sco2 = sc.nextInt();
            int sco3 = sc.nextInt();
            main2[i] = new Main2(sco1, sco2, sco3);
        }
        int sum1=0, sum2=0, sum3=0, sum4 = 0;
        for(int i = 0; i<3; i++){
            System.out.println(main2[i].sco1 + " " +main2[i].sco2 + " " +main2[i].sco3 + " " + main2[i].sum);
            sum1 += main2[i].sco1;
            sum2 += main2[i].sco2;
            sum3 += main2[i].sco3;
            sum4 += main2[i].sum;
        }
        System.out.println(sum1 + " " + sum2 + " " + sum3 + " " +sum4);
    }
}

