//Name : satoshi-2000
//Date : 2020/12/16
//Title: final_price4
//減債基金係数による条件制約下での預金算出
//例題5-4
//ここでは簡単のため, 正確な計算が行えるBigDecimal型などは不採用とした

public class final_price4 {
    public static void main(String args[]){
        double money = 1000.0;   //目標金額
        double final_rate = 1.0;    //終価係数
        double comp_int = 1.02; //年利率
        int year = 25;  //経過年数
        int sum_money = 0;  //元利合計
        double fin_pension = 0.0;   //年金終価係数

        //実質金利計算
        for(int i = 0; i < year; i++) {
            final_rate *= comp_int;
        }
        fin_pension = (final_rate - 1.0) / (comp_int - 1.0);

        sum_money = (int)(money * (1/fin_pension));

        System.out.println("預金\t:\t"+sum_money);
    }
}
