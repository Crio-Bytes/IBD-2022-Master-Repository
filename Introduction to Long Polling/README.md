# Introduction

Client and server often need to communicate with each other in real-time, such as in chat application, online gaming and collaborative tools. There are different backend communication patterns that help in real-time communication between client and server such as Push, Polling, Long Polling, and Server sent events. In this micro byte we are going to cover:

- What is Long Polling
- How is it different from Polling
- Applications of Long Polling
- Activity: Implementing Long Polling

## What is Long Polling?

Long Polling is a technique that allows real-time communication between a client and server without overhead of creating new connection for every message.

In Long Polling client sends request to the server and then waits for a response from the server. If the server does not have any new information to send back to the client, it will keep the request open for a specified amount of time, known as **long poll timeout**. So the connection is not closed by the server until it has new information available or if the long poll timeout threshold is reached.

## How is Long Polling different from Polling?

The basic idea of Polling is that client sends request repetadly to the server at regular intervals to check for new data. So server has to constantly process and respond to the requests, even when no new data is available.

![polling](/Introduction%20to%20Long%20Polling/Images/polling.png)

Pros of polling:

- Simple to implement.
- Polling is suitable for applications that do not require real-time updates. If the updates can be sent at regular intervals, polling can be used to retrieve the updates without the overhead of maintaining a persistent connection.

Cons of polling:

- Polling can be inefficient and resource-intensive. It requires client to constantly send request to server and server to constantly process and respond to those request even when there is no new data available.
- It utilze more network bandwidth and backend resource compared to long polling.

Long polling is similar to polling, but it is designed to be more efficient and less resource-intensive by keeping the connection open until new data becomes avialble. When new data becomes available, the server sends the data to the client and closes the connection. If no new data is available withing a specified timeout period, the server sends message to client indicating that no new data is available and closes the connection.

![long-polling](/Introduction%20to%20Long%20Polling/Images/long%20polling.png)

Pros of Long Polling:

- Long Polling reduces the number of HTTP requests and server resources required for real-time communication, compared to traditional Polling.
- It is easy to implement using different languages & frameworks.

Cons of Long Polling:

- Long Polling may introduce latency, as the client has to wait for the server to send a response with new data. This may not be suitable for applications that require real-time updates.

Both Polling & Long Polling are not as efficient and secure as other approches as they require the client to send requests to the server at regular intervals. This makes it easier for attackers to identify and target the server with malicious requests.

## Applications of Long Polling

Long Polling is used in real-time applications, where server needs to send updates to client as soon as they become available.

It can be used in chat systems and social media applications, where the client needs to be notified as soon as new information becomes available on the server. It can also be used to implement push notifications in web applications, allowing the server to send updates to the client without the need for the client to continuously poll the server for new information.

### Prerequisite for the Activity

The logic to implement long polling is similar for different languages, but for this micro byte we are going to use Node.js so basic familiarity with Node.js is required to understand the code.

# Activity

## Activity 1 - Setting up the codebase

Create a new folder and npm repository.

1.  Create a new folder and navigate to that directory

        mkdir long-polling
        cd long-polling

2.  Initiate a new npm repository

        npm init

Enter necessary data and package.json file will be created.

![package-png](/Introduction%20to%20Long%20Polling/Images/package.png)

3. Create an `index.js` file and open any IDE.

## Activity 2 - Creating HTTP server using `http` module.

In this activity you need to create a simple HTTP server using `http` module in Node.js that sends "Learning about Long Polling" message to the client when a request is received.

1. Import the `http` module.

2. create HTTP server using `createServer` method of HTTP module.

Hint:
The `createServer` method takes a callback function with request & response as its paramenters.

<details>
<summary>Solution</summary>

        const http = require('http');

        const server = http.createServer((req,res) => {
            res.end("Learning about Long Polling");
        })

The createServer method is called whenever server receives a request.

</details>

3. Start listening for requests on port **3000**.

Hint:

- We can use `listen` method of the `server` object to complete this activity.

<details>
<summary>Solution</summary>

        server.listen((3000, ()=>{
            console.log('Server is listening on port 3000');
        }))

</details>

## Activity 3 - Sending data if available

We will now update the `createServer` method so that it will check if data is available and sends it as response.

1. create a variable called as `isDataAvialable` & assign it value of false.

2. Now update the `createServer` method so that it will return the data if data is avialable.

<details>
<summary>Solution</summary>

        let isDataAvialable = false;

        const http = require('http');

        const server = http.createServer((req,res) => {
            if(isDataAvialable){
                res.end(`Data is ${data}`);
            }
        })

        server.listen((3000, ()=>{
            console.log('Server is listening on port 3000');
        }))

</details>

## Activity 4 - Adding long poll timeout

Add a timeout in `createServer` method so that it will send responde as "No new data available" if no data is updated in 5 seconds.

Hint:

- Use `setTimeout` method to add time period for each connection.

The `setTimeout` function is a JavaScript method that allows you to set a delay before executing a callback function. It is often used in conjunction with long Polling to set a timeout period for each connection.
Here is an example of how to use setTimeout():

        setTimeout(callback, delay);

The `callback` parameter is a function that will be executed after the specified `delay` period has elapsed. The `delay` parameter is the number of milliseconds to wait before executing the callback function.

<details>
<summary>Solution</summary>

        let isDataAvialable = false;

        const http = require('http');

        const server = http.createServer((req,res) => {

            // Set a timeout period for each connection
             const timeout = setTimeout(() => {
                res.end("No new data available");
            }, 30000);

            // Wait for new data to become available
            if(isDataAvialable){
                res.end(`Data is ${data}`);
            }

        })

        server.listen((3000, ()=>{
            console.log('Server is listening on port 3000');
        }))

</details>

## Activity 5 - Trying the code.

Start the server and test the URL using Postman.

1. Start the server using **node index.js**

2. Open postman and enter the url **http://localhost:3000**

![postman-loading](/Introduction%20to%20Long%20Polling/Images/loadingPostman.png)

After 5 seconds, server will send response as "No data is avialable".

![no-data](/Introduction%20to%20Long%20Polling/Images/no-data.png)

3. Update the value of d=isDataAvialable to true

4. Restart the server using **node index.js**

5. Send request to server

![data-loaded](/Introduction%20to%20Long%20Polling/Images/data-loaded.png)

## Conclusion

We learned what Long Polling is and how it is different from Polling. Long Polling is a variant of Polling that is designed to be more efficient and less resource-intensive by keeping the connection open until new data becomes available. However, it may still require more resources compared to other approaches, such as WebSockets or server-sent events (SSE), which use a persistent connection for real-time communication. We also implemented Long Polling in Node.js

## Refrences

[Http Long Polling](https://www.pubnub.com/blog/http-long-polling/)
[Long Polling](https://javascript.info/long-polling#long-polling)
[Difference between Polling & Long Polling](https://www.geeksforgeeks.org/what-is-long-polling-and-short-polling/)
[Implementing long polling](https://levelup.gitconnected.com/understand-and-implement-long-polling-and-short-polling-in-node-js-94334d2233f3)
