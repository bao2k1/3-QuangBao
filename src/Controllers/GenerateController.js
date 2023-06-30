exports.getData=(req,res)=>{
    const start=performance.now();
    const size = req.params.size;
    // console.log(size);
    let array=[];
    array= Array.from({length:size});
    // console.log(array);
   for (let i=0; i<array.length;i++){
    array[i]=i+1;
   }
   const end=performance.now()-start;
    res.send({
       array:array,
       runtime:end
    });
}