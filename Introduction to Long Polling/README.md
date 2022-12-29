# Introduction

Client and server often need to communicate with each other in real-time, such as in chat application, online gaming and collaborative tools. There are different backend communication patterns that help in real-time communication between client and server such as Push, Polling, Long Polling, and Server sent events. In this micro byte we are going to cover:

- What is Long Polling
- How is it different from Polling
- Applications of Long Polling
- Activity

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
