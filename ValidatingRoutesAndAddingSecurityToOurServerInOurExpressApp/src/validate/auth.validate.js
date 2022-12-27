const Joi=require('joi');
const signupValidationSchema=Joi.object().keys({
    username:Joi.string().required().min(8).max(50),//username must be string then it must be required and max length is 50
    email:Joi.string().required().email({tlds:{allow:false}}),
    password:Joi.string().required().min(8)
})
const loginValidationSchema=Joi.object().keys({
    username:Joi.string().required().max(50),
    
    password:Joi.string().required().min(8)
});
const verifyAuth=(req,res,next)=>{
    const {authorization}=req.headers;
    console.log("authorization",authorization);
    console.log("env password",process.env.route_password);
    if(!authorization)
    {
        return res.status(403).json({message:"unauthorized"})
    }
    if(authorization!==process.env.route_password)
    {
        return res.status(403).json({message:"unauthorized"})
    }
    next();
}
module.exports={
    signupValidationSchema,
    loginValidationSchema,
    verifyAuth,
}
