const authModel=require('../model/auth.model.js');
const bcrypt=require('bcrypt');

const signup=async(body)=>{
   try{ 
    console.log("body",body);
    const {password}=body;
    console.log(password);
    const hashedPassword=await encryptPassword(password);
    console.log("hash",hashedPassword);
    const newUser=new authModel({...body,password:hashedPassword});
    const result=await newUser.save();
    return result;
}
    catch(err)
    {
        throw error;
    }
}
const login=async(username,password)=>{
  
    try{
     const user=await authModel.find({username});
     console.log("user",user);
    
     const result=await bcrypt.compareSync(password,user[0].password)
     if(result)
     {
         return {
             isLogged:true,
             
             
         }
     }
     else
     {
         return null;
     }
    }
    catch(error)
    {
       throw error;
    }
 
 
 }
const encryptPassword=async(password)=>{
    console.log("yes12")
    const salt=await bcrypt.genSalt();
    const hashedPassword=await bcrypt.hash(password,salt);
    return hashedPassword;
}

module.exports={
    signup:signup,
    encryptPassword,
    login,
}