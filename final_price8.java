//Name : satoshi-2000
//Date : 2020/12/18
//Title: final_price8
//年金現価係数による条件制約下での返済可能な借入金額算出
//例題5-8
//ここでは簡単のため, 正確な計算が行えるBigDecimal型などは不採用とした

public class final_price8 {
    public static void main(String args[]){
        final double money = 300.0;   //返済額
        final double money2 = 150.0;   //返済額
        double final_rate = 1.0;    //終価係数
        final double comp_int = 1.03; //年利率
        final int year = 10;  //必要年数
        final int year2 = 20;
        double avail_pay= 0.0;  //借入可能金額
        double avail_pay2= 0.0;  //借入可能金額
        double return_pay = 0.0;    //資金回収係数
        double sum_pay = 0.0;       //最終的に借り入れ可能な金額
        double pre_value = 0.0;   //現価係数


        //--------------------------初めの10年---------------------------//
        //終価係数を算出
        for(int i = 0 ; i < year; i++){
            final_rate *= comp_int;
        }

        //現価係数の計算;
        pre_value = 1.0 / final_rate;


        //必要資金計算
        return_pay = ((comp_int-1.0)/(1.0 - (1.0 / final_rate)));
        avail_pay = (1/return_pay)*money;
        //---------------------------次の20年---------------------------//

        //終価係数のリセット
        final_rate = 1.0;

        //終価係数を算出
        for(int i = 0 ; i < year2; i++){
            final_rate *= comp_int;
        }

        //必要資金計算
        return_pay = ((comp_int-1.0)/(1.0 - (1.0 / final_rate)));
        avail_pay2 = (1/return_pay)*money2;

        avail_pay2 *= pre_value;    //現時点での価値に変換

        //最終的に借り入れ可能な金額
        sum_pay = avail_pay + avail_pay2;

        //画面表示
        System.out.println("返済可能借入金額\t:\t"+sum_pay);

    }
}
