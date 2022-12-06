

export function  ShippingService(order){
    if (order < 100){
        return  20.0;
    }
    if(order == 100 || order <= 200){
        return 12.0;
    }
    if (order > 100){
     return 0.0
    }
    }