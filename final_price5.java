//Name : satoshi-2000
//Date : 2020/12/16
//Title: final_price5
//減債基金係数による条件制約下での必要年数算出
//例題5-5
//ここでは簡単のため, 正確な計算が行えるBigDecimal型などは不採用とした

public class final_price5 {
    public static void main(String args[]){
        double money = 4000.0;   //目標金額
        double final_rate = 1.0;    //終価係数
        double comp_int = 1.03; //年利率
        int year = 0;  //必要年数
        double fin_pension = 0.0;   //年金終価係数
        double every_deposit = 70.0;  //毎年の預金金額
        double threshold = every_deposit / money;   //しきい値
        int count  = 1; ///必要年数
        double sink_fund = 0.0; //減債基金係数

        while(true){
            //実質金利計算
            final_rate *= comp_int;

            //年金終価係数の計算
            fin_pension = (final_rate - 1.0) / (comp_int - 1.0);

            //減債基金係数の計算
            sink_fund = 1/fin_pension;

            //必要年数の更新
            if(sink_fund < threshold){
                break;
            }
            count++;
        }
        year = count;
        System.out.println("必要年数\t:\t"+year);
    }
}
