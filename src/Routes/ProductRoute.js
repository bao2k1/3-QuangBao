const express = require("express");
const productController = require("../Controllers/ProductController");
const productRouter = express.Router();
productRouter.get('/',productController.getAllProducts);
module.exports = productRouter;