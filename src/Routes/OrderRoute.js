const express=require('express');
const orderRouter=express.Router();
const orderController=require("../Controllers/OrderController");
orderRouter.get('/',orderController.getAllOrders);
module.exports=orderRouter;