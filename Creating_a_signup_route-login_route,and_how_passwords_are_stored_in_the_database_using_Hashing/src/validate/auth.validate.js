const Joi=require('joi');
const signupValidationSchema=Joi.object().keys({
    username:Joi.string().required().max(50),
    email:Joi.string().required().email({tlds:{allow:false}}),
    password:Joi.string().required().min(8)
})
const loginValidationSchema=Joi.object().keys({
    username:Joi.string().required().max(50),
    
    password:Joi.string().required().min(8)
});
module.exports={
    signupValidationSchema,
    loginValidationSchema
}
