const router=require('express').Router();
const {postSignup,postLogin}=require('../controller/auth.controller.js');
const validateSchema=require('../middleware/validate.js');
const {loginValidationSchema,signupValidationSchema}=require('../validate/auth.validate.js');
const validateSignup=validateSchema(signupValidationSchema);
const validateLogin=validateSchema(loginValidationSchema);
router.post('/signup',validateSignup,postSignup);
router.post('/login',validateLogin,postLogin);
module.exports=router;