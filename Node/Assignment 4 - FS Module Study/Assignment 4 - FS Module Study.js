const fs = require('fs');
const path = require("path");

//***********create*************************
fs.writeFile(
    "./employees.json",
    '{"name": "Employee 1 Name", "salary": 2000}',
    "utf8",
    (error, data) => {
        if (error) {
            console.log(error);
        }
        console.log(data);
        console.log("FILE SUCCESSFULLY CREATED!");
    }
)
//***********read*************************
fs.readFile(
    "./employees.json",
    "utf8",
    (error,data)=>{
        if(error){
            console.log(error);
        }
        console.log(data);
        console.log("FILE READ!");
    }
)
//**************update**********************
fs.appendFile(
    "./employees.json",
    '\n{"name": "Employee 2 Name", "salary": 3000}',
    "utf8",
    (error,data)=>{
        if(error){
            console.log(data);
        }
        console.log(data);
        console.log("NEW DATA ADDED!");
    }
)
//**************update**********************
fs.unlink(
    "./employees.json",
    (error)=>{
        if (error){
            console.log(error);
        }else {
            console.log("FİLE DELETED!");
        }
    }
)