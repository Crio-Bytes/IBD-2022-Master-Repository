# Introduction

If you have a task that may take a long time to complete, such as reading data from a file or making a network request, you may want to perform the task concurrently, rather than sequentially. This can be achieved with help of Asynchronous programming. With help of Asynchronous programming, you can continue running your program while waiting for tasks to complete.

In JavaScript, you can achieve Asynchronous programming with help of callbacks, Promises, and async/await. In this micro-byte we will learn:

1. What is Promise in JS?
2. How to create a Promise?

![promise](/PROMISES%20IN%20JAVASCRIPT/Images/Promise.png)

&nbsp;

# What is Promise in JS?

A Promise in JavaScript is an object that is used to represent the outcome of an asynchronous operation. The outcome can either represent a failure or the completion of an asynchronous operation.

Imagine that you are waiting for a package to be delivered. You might tell the delivery person, "I promise to be home by 4:00 PM to receive the package." This promise represents your intention to fulfill a particular action (being at home by 4) at some point in the future.

Similarly, a Promise in JavaScript represents the intention to perform a particular action (an asynchronous operation) at some point in the future.

## How to create a Promise?

To create a Promise in JavaScript, you can use the 'Promise' constructor which takes a function as an argument. This function is called as executor function. The executor function takes two arguments, resolve and reject.

```
const promise = new Promise((resolve, reject) => {
    // code you want to execute asynchronously
})

```

The **new Promise()** constructor returns a promise object. The promise object is capable of informing whether the execution has been started, completed, or returned with an error. To store this information promise object has a property called state.

state can have following values:

- pending: It represents the initial state.
- fulfilled: It represents that the operation was completed successfully, i.e the promise is **resolved**.
- rejected: It represents that the operation failed, i.e promise is rejected.

So we can say that the state is initially **pending**, then changes to either **fulfilled** when resolve is called or **rejected** when reject is called.

A promise is said to be settled if it is either fulfilled or rejected, but not pending.

Apart from state, the promise object has one more internal property called as result.

result can have following values:

- undefined: Initially when state value is pending.
- value: When resolve(value) is called.
- error: When reject(error) is called.

![state](/PROMISES%20IN%20JAVASCRIPT/Images/state.png)

### then & catch method to handle Promise:

then() registers callback functions to receive the resolved value or the reason for rejection.

The then method takes two functions as argument:

```
promise.then(
  (value) => {
    // Promise fulfilled
    console.log(value);
  },
  (error) => {
    // Promise rejected
    console.log(error);
  }
);

```

If you are only interested in a successful outcome, you can just pass one argument to it.

```

promise.then((value)=>{
    console.log(value)
})

```

**then()** returns a new Promise, which allows you to chain multiple **then** methods, creating a chain of Promises.

**catch()** is used to handle rejected Promises. It takes a single argument, a function that is called when Promise is rejected.

```

promise.then((value)=>{
    console.log(value)
}).catch((error)=>{
    console.log(error)
})

```

The **catch** method is equivalent to using the **then** method with only a reject function:

```

promise.then(null, (error)=>{
console.log(error)
})

```

# Activities

## Activity 1

1. Which of the following is not a state in Javascript?

- [ ] pending
- [ ] resolve
- [ ] rejected
- [ ] fulfilled

<details>
<summary>Click here to see the answer</summary>
<b>resolve</b>
Reason: resolve is a callback function that we pass as an argument to the Promise constructor.
</details>

2. What is the initial state of a Promise?

- [ ] pending
- [ ] rejected
- [ ] fulfilled
- [ ] none of the above

<details>
<summary>Click here to see the answer</summary>
<b>pending</b>
Reason: Initially the state is pending which later changes to either **fulfilled** when resolve is called or **rejected** when reject is called.
</details>

3. Which of the following is equivalent to using the then method with only a reject function?

- [ ] catch method
- [ ] finally method
- [ ] then method with null as the first argument
- [ ] reject method

<details>
<summary>Click here to see the answer</summary>

<b>catch method</b>

Reason:

        promise.then(null, (error)=>{
        console.log(error)
        })

this is equivalent to:

        promise.catch((error)=>{
            console.log(error)
        })

</details>

## Activity 2: Promise in practice

We learned how to use a promise to handle asynchronous operations. with that knowledge send a get request to [media post](https://jsonplaceholder.typicode.com/posts) and log the result, also add **catch()** to handle the errors.

<details>
<summary>Hint</summary>
make use of the new Promise constructor to send a get request.

        let promise = new Promise(function (resolve, reject) {
        let req = new XMLHttpRequest();
        req.open("GET", URL);
        req.onload = function () {
        if (req.status == 200) {
            resolve(req.response);
        } else {
            reject("There is an Error!");
        }
        };
        req.send();
        });

</details>

<details>
<summary>Hint 2</summary>
use the then() & catch() to handle the promise object 
</details>

<details>
<summary>answer</summary>

    const URL = 'https://jsonplaceholder.typicode.com/posts'
    let promise = new Promise(function (resolve, reject) {
        let req = new XMLHttpRequest();
        req.open("GET", URL);
        req.onload = function () {
        if (req.status == 200) {
            resolve(req.response);
        } else {
            reject("There is an Error!");
        }
        };
        req.send();
    });

    promise.then(
        (result) => {
            console.log({result}); // Log the result of 50 Pokemons
        }).catch(
        (error) => {
            console.log(error)
            // As the URL is a valid one, this will not be called.
            console.log('We have encountered an Error!'); // Log an error
    });

Note: This might not work in online JS editors as XMLHttpRequest is a built-in object in web browsers.

</details>
&nbsp;

## Conclusion

Promises are often used in JavaScript to handle asynchronous operations. In this micro byte, we learned what is promise and different events to handle promise in JavaScript.

## Refrences

[Javascript Info - Promise](https://javascript.info/promise-basics)

[MDN - Promise](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise)
