exports.getAllOrders=(req,res)=>{
    res.send([
        {id: '1',totalCost: 2300},
        {id: '2',totalCost: 5000},

    ]);
}
// module.exports = {getAllBooks};