import * as shippingService from './shippingService.js';

export function orderService(order){

    const frete = shippingService.basic(order.basic);
    const descontar = shippingService.discount(order.discount);
  return order.basic - frete - descontar; 
}
