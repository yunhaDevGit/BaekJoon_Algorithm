package Toss;

public class VAT {
    static int getVAT(int orderPrice, int nonTaxable ,int serviceCharge){
        int vat = Math.round((orderPrice - nonTaxable - serviceCharge)/11); // 부가가치세
        int tax = vat*10; // 과세
        int supplyPrice = tax + nonTaxable; // 공급가액
        if(supplyPrice+vat-nonTaxable==1)
            vat = 0;


        return vat;
    }
    public static void main(String[] args) {
//        (생략)
    }
}


// 부가가치세 = 과세 * 10%
// 과세 금액 = 공급가액 - 비과세 금액
// 주문금액 = (공급대가 = 공급가액 + 부가가치세) + 봉사료
//
// 주문금액, 비과세 금액, 봉사료 -> 부가가치세 구하기


// 주문금액 = (공급가액 - 비과세금액)*0.1 + 공급가액 + 봉사료
// 주문금액 - 봉사료 +0.1 비과세금액 = 1.1공급가액
//
// 과세금액 + 비과세 금액 + 부가가치세 = ㅁ
// 과세금액 + 부가가치세 = 주문금액 - 봉사료 - 비과세금액
// 1.1과세 = 주문금액 - 봉사료 - 비과세금액
