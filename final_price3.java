//Name : satoshi-2000
//Date : 2020/12/16
//Title: final_price3
//年金終価係数による元利合計算出
//例題5-3
//ここでは簡単のため, 正確な計算が行えるBigDecimal型などは不採用とした

public class final_price3 {
    public static void main(String args[]){
        double money = 50.0;   //資金
        double final_rate = 1.0;    //終価係数
        double comp_int = 1.03; //年利率
        int year = 30;  //経過年数
        int sum_money = 0;  //元利合計
        double fin_pension = 0.0;   //年金終価係数

        //実質金利計算
        for(int i = 0; i < year; i++) {
            final_rate *= comp_int;
        }
        fin_pension = (final_rate - 1.0) / (comp_int - 1.0);

        sum_money = (int)(money * fin_pension);

        System.out.println("預金\t:\t"+sum_money);
    }
}
