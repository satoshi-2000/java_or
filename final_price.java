//Name : satoshi-2000
//Date : 2020/12/16
//Title: final_price
//終価係数による元利合計算出
//例題5-1
//ここでは簡単のため, 正確な計算であるBigDecimal型などは不採用

public class final_price {
    public static void main(String args[]){
        double money = 1000.0;   //資金
        double final_rate = 1.0;    //終価係数
        double comp_int = 1.01; //年利率
        int year = 20;  //経過年数
        int sum_money = 0;  //元利合計

        //実質金利計算
        for(int i = 0; i < year; i++) {
            final_rate *= comp_int;
        }

        sum_money = (int)(money * final_rate);

        System.out.println("元利合計\t:\t"+sum_money);
    }
}
