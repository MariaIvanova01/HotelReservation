package com.company;

public enum DiscountType {
    VIP(0.80),
    SECOND_VISIT(0.90),
    NONE(1);

    private double findNewPrice;

    DiscountType(double findNewPrice){
        this.findNewPrice = findNewPrice;
    }

    public double getFindNewPrice() {
        return findNewPrice;
    }
    public static DiscountType parse(String str){
        if (str.equals("VIP")){
            return VIP;
        }else if(str.equals("SecondVisit")){
            return SECOND_VISIT;
        }else{
            return NONE;
        }
    }
}
