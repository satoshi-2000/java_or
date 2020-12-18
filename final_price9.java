//Name : satoshi-2000
//Date : 2020/12/18
//Title: final_price9
//投資方法の選択
//例題5-9
//ここでは簡単のため, 正確な計算が行えるBigDecimal型などは不採用とした

public class final_price9 {
    public static void main(String args[]){
        final double money = 100.0;   //返済額
        final double money2 = 140.0;   //返済額
        final double money_a = 1000.0;  //A社の投資額
        final double money_b = 1500.0;  //B社の投資額
        double final_rate = 1.0;    //終価係数
        final double comp_int = 1.04; //年利率
        final int year = 20;  //必要年数
        double avail_pay= 0.0;  //借入可能金額
        double avail_pay2= 0.0;  //借入可能金額
        double return_pay = 0.0;    //資金回収係数
        double pa = 0.0;          //A社の正味現価
        double pb = 0.0;          //B社の正味現価
        double sa = 0.0;          //A社の正味終価
        double sb = 0.0;          //B社の正味終価
        double ma = 0.0;          //A社の正味年価
        double mb = 0.0;          //B社の正味年価
        double every_pension = 0.0;     //年金終価係数
        double fund_recover = 0.0;      //資本回収係数


        //終価係数を算出
        for(int i = 0 ; i < year; i++){
            final_rate *= comp_int;
        }

        //--------------------------現価法による比較-----------------------//
        //必要資金計算
        return_pay = ((comp_int-1.0)/(1.0 - (1.0 / final_rate)));
        avail_pay = (1/return_pay)*money;
        pa = avail_pay - 1000.0;
        avail_pay2 = (1/return_pay)*money2;
        pb = avail_pay2 - 1500.0;
        System.out.println("pa\t:\t"+pa);
        System.out.println("pb\t:\t"+pb);


        //--------------------------終価法による比較-----------------------//
        //年金終価係数
        every_pension = (final_rate - 1.0) / (comp_int - 1.0);
        sa = money * every_pension - money_a * final_rate;
        sb = money2 * every_pension - money_b * final_rate;
        System.out.println("sa\t:\t"+sa);
        System.out.println("sb\t:\t"+sb);


        //--------------------------年価法による比較-----------------------//
        //資本回収係数
        fund_recover = (comp_int - 1.0) / (1.0 - (1.0/final_rate));
        ma = money - money_a * fund_recover;
        mb = money2 - money_b * fund_recover;
        System.out.println("ma\t:\t"+ma);
        System.out.println("mb\t:\t"+mb);

    }
}
