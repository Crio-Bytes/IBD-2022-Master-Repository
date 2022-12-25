
const {signup,login}=require('../service/auth.service.js');
const postSignup=async(req,res)=>{
    const {username,email,password}=req.body;

    try{ console.log("yes");
        const result=await signup(req.body);
        console.log("result",result);
        res.status(200).json(result);
    }
    catch(err){
      res.status(422).json(err);
    }

}
const postLogin=async(req,res)=>{
    try{
        const {username,password}=req.body;
     const result=await login(username,password);
     if(result)
     {  
        
     res.status(200).json({username,isLogged:true});}
     else
     {
        res.json({message:"incorrect password"});
     }
    }catch(err)
    {
        res.json(err);
    }
}
module.exports={
    postSignup:postSignup,
    postLogin:postLogin,
} 