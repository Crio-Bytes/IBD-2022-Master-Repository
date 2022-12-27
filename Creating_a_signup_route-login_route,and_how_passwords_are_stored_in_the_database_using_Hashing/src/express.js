
//Activity 2: Steps to create an Express.js Application
// step 1. Create an app instance using express

// const express=require('express');
// const app=express();
// const PORT=5000;
// const authRoutes=require('./routes/auth.routes.js');
// //step 2.Listening to PORT using app.listen
// app.listen(PORT,()=>{
//     console.log("listing...",PORT);

// });

// //Activity 3: Creating a Singup Route and understanding the why we use express.json() middleware
//    //step 1: Create a '/sgnup route' 
//    //step 2: Test signup api using Postman

// //app.use(express.json()); // acts as middleware to read data 
// // app.post('/signup',(req,res)=>{
// //     console.log(req.body);
// //     const {username,email,password}=req.body;
// //     console.log(username,email,password);
// //     res.status(200).json({message:"signup successfully",username,email,password});
    
// // })
// //Actvity 4
// app.use(express.json()); // acts as middleware to read data 
// app.use('/v1',authRoutes); // we use 'v1' as like every request which starts like "http://localhost:5000/v1...." will transfer the folder to the authRoutes which we imported from auth.routes.js file 

//Activity 6:
const express=require('express');
const app=express();
 const authRoutes=require('./routes/auth.routes.js');
const mongoose=require('mongoose');
const PORT=5000;


mongoose.connect('mongodb://127.0.0.1:27017').then(()=>{
    console.log("connected to DB");
    app.listen(PORT,()=>{
        console.log("listing...",PORT);
    
    })
    
}).catch(()=>{
    console.log("not connected to DB");
})
app.use(express.json());//used as middleware to read request.body
app.use('/v1',authRoutes);