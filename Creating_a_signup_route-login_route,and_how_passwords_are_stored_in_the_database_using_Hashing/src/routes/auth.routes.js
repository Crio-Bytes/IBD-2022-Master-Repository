const router=require('express').Router();
const {postSignup,postLogin}=require('../controller/auth.controller.js');
router.post('/signup',postSignup);
router.post('/login',postLogin);
module.exports=router;