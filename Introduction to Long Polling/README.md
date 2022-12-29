# Introduction

Client and server often need to communicate with each other in real-time, such as in chat application, online gaming and collaborative tools. There are different backend communication patterns that help in real-time communication between client and server such as Push, Polling, Long Polling, and Server sent events. In this micro byte we are going to cover:

- What is Long Polling
- How is it different from Polling
- Applications of Long Polling
- Activity

## What is Long Polling?

Long Polling is a technique that allows real-time communication between a client and server without overhead of creating new connection for every message.

In Long Polling client sends request to the server and then waits for a response from the server. If the server does not have any new information to send back to the client, it will keep the request open for a specified amount of time, known as **long poll timeout**. So the connection is not closed by the server until it has new information available or if the long poll timeout threshold is reached.
