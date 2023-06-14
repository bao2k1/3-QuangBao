const express = require('express');
const countryRouter = express.Router();
const countryController = require("../Controllers/CountryController");
// API to get all data from output.json
countryRouter.get("/",countryController.getData);
//API to find data for country
countryRouter.get("/find/:country",countryController.getDataByCountry);
// API to receive data and write to output.json
countryRouter.post("/export-data", countryController.exportData);

module.exports=countryRouter;