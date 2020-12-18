//Name : satoshi-2000
//Date : 2020/12/18
//Title: final_price6
//資金回収係数による条件制約下での借金返済への必要費用算出
//例題5-6
//ここでは簡単のため, 正確な計算が行えるBigDecimal型などは不採用とした

public class final_price6 {
    public static void main(String args[]){
        final double money = 4500.0;   //目標金額
        double final_rate = 1.0;    //終価係数
        final double comp_int = 1.03; //年利率
        final int year = 30;  //必要年数
        double every_pay= 0.0;  //毎年の返済金額
        double return_pay = 0.0;    //資金回収係数

        //終価係数を算出
        for(int i = 0 ; i < year; i++){
            final_rate *= comp_int;
        }
        System.out.println("final_rate\t:\t" + final_rate);
        System.out.println("1/final_rate\t:\t" + 1/final_rate);

        //必要資金計算
        return_pay = ((comp_int-1.0)/(1.0 - (1.0 / final_rate)));
        every_pay = return_pay*money;

        //画面表示
        System.out.println("必要資金\t:\t"+every_pay);

    }
}
