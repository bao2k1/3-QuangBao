exports.validateUser = (req, res,next)=>{
    const { username, password } = req.body;
    
    // console.log(username);
      if (username===undefined||username==="") {
        res.status(400);
        throw new Error("User name is required");
        // throw new Error("Username is required")
      }
      if(username.length>20||password.toString().length>8){
        throw new Error("User name must <=20 characters and password must <=8 characters");
      }
      else{

        next();
      }

  }
