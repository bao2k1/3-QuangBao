const express=require('express');
const generateRouter=express.Router();
const generateController=require("../Controllers/GenerateController");
generateRouter.get('/:size',generateController.getData);
module.exports=generateRouter;