//Name : satoshi-2000
//Date : 2020/12/18
//Title: final_price7
//年金現価係数による条件制約下での返済可能な借入金額算出
//例題5-7
//ここでは簡単のため, 正確な計算が行えるBigDecimal型などは不採用とした

public class final_price7 {
    public static void main(String args[]){
        final double money = 250.0;   //返済額
        double final_rate = 1.0;    //終価係数
        final double comp_int = 1.04; //年利率
        final int year = 30;  //必要年数
        double avail_pay= 0.0;  //借入可能金額
        double return_pay = 0.0;    //資金回収係数

        //終価係数を算出
        for(int i = 0 ; i < year; i++){
            final_rate *= comp_int;
        }
        System.out.println("final_rate\t:\t" + final_rate);
        System.out.println("1/final_rate\t:\t" + 1/final_rate);

        //必要資金計算
        return_pay = ((comp_int-1.0)/(1.0 - (1.0 / final_rate)));
        avail_pay = (1/return_pay)*money;

        //画面表示
        System.out.println("返済可能借入金額\t:\t"+avail_pay);

    }
}
