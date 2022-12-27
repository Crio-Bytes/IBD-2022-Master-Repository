const mongoose=require('mongoose');
const authSchema=mongoose.Schema({
    username:{type:String,required:true,maxLength:50,unique:true},
    email:{type:String,required:true,unique:true},
    password:{type:String,required:true}
})
const authModel=mongoose.model('auth',authSchema);
module.exports=authModel;