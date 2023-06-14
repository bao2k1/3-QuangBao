const fs = require('fs');
const tempData = require("../data/tempData");
exports.exportData=(req,res)=>{
        const outputContent = JSON.stringify(tempData, null, 2);
      
        // Ghi dữ liệu vào file "output.json"
        fs.writeFile("output.json", outputContent, (err) => {
          if (err) {
            console.error(err);
            res.status(500).send("Error writing to file");
          } else {
            console.log("Data written to output.json");
            res.send("Data written to output.json");
          }
        });
      }


exports.getData=(req, res)=>{
        // API to get all data from output.json

    fs.readFile("output.json", "utf8", (err, data) => {
      if (err) {
        console.error(err);
        res.status(500).send("Error reading file");
      } else {
       if(data===null || data==="") {
        res.json(JSON.parse("{}"));
       }
       else{

           res.json(JSON.parse(data));
       }
      }
    });
  
   }


exports.getDataByCountry=(req, res)=>{
    const country = req.params.country.toLowerCase();

  fs.readFile("output.json", "utf8", (err, data) => {
    if (err) {
      console.error(err);
      res.status(500).send("Error reading file");
    } else {
      try {
        const jsonData = JSON.parse(data);
        const yearData = jsonData.children[0];

        // Tìm kiếm trong dữ liệu Imports
        const importsData = yearData.children.find(
          (item) => item.type === "Imports"
        );
        const importsFilteredData = importsData.children.flatMap(
          (item) => item.children
        );
        // console.log(importsFilteredData)
        const importsResult = importsFilteredData.find(
          (item) => item.country && item.country.toLowerCase() === country
        );

        // Tìm kiếm trong dữ liệu Exports
        const exportsData = yearData.children.find(
          (item) => item.type === "Exports"
        );
        const exportsFilteredData = exportsData.children.flatMap(
          (item) => item.children
        );
        const exportsResult = exportsFilteredData.find(
          (item) => item.country && item.country.toLowerCase() === country
        );

        if (importsResult) {
          res.json(importsResult);
        } else if (exportsResult) {
          res.json(exportsResult);
        } else {
          res.status(404).send("Country not found");
        }
      } catch (error) {
        console.error(error);
        res.status(500).send("Error parsing JSON data");
      }
    }
  });
   }