exports.getAllProducts=(req,res)=>{
    res.send([
        {name: 'Con meo trong nha',cost:123},
        {name: 'Con cho ngoai cua so',cost:136},
    ]);
}

// module.exports = {getBooks:getAllBooks};
// su dung nhu tren se thiet lap lai ten ham khi lay ra su dung (getBooks)