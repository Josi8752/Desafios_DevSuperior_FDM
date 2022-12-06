 import * as orderServices from "./services/orderService.js";
 import * as  ShippingService from "./services/shippingService.js";
 import Order from "./models/order.js";

const dados = document.getElementById("data").innerHTML.split("\n");
const order =  new Order(Number(dados[0]), Number(dados[1]), Number(dados[2]));


const basic =  orderServices.basic(order);
const discount = ShippingService.discount(order);

console.log(`Pedido código = ${order.code}`);
console.log(`Valor total:  = ${discount}`);