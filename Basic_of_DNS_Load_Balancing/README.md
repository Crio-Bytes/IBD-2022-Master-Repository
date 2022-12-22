# Basic DNS Load Balancing
## Introduction

A lot of applications and websites are used by many users to perform specific tasks. Have you ever thought about how this web application handles multiple users? How are these web applications able to provide their services in such a smooth manner, even if thousands of users use the app at the same time?

How would you respond if you were given too many tasks simultaneously? To conquer this, you should be able to do all the tasks in a balanced way to stay energized and energized. Similarly, when many users use the application simultaneously, there should be a balancer to manage all the incoming loads from different users.

In this Micro-Byte, we will learn the concept of DNS Load Balancing.

## Scope
- Understand the concept of **Load Balancing**.
- Understand **DNS Load Balancing** and its need.
- Understand load balancing using `www.google.com` as an example. 

## Activity 1: Ping to `www.google.com` twice on the Linux terminal and Observe the IP address

Let's do one activity. We will use the `ping` command to ping the Google server in the Linux terminal.

Open this link `https://www.tutorialspoint.com/linux_terminal_online.php` in a browser. It will open an online Linux terminal.

Run the following command twice and observe the IP address.
`ping www.google.com -c 2`

The `ping` command sends a packet to the specified address, a URL or an IP.
c is the attribute that stands for the count.
By using `-c 2` , we send only 2 data packets to the specified address, `www.google.com`.

<img src='./images/pic1.JPG'>

You observe that the IP addresses of google.com change every time we ping. Why is this so? Continue with this micro byte, and we will explore why this is happening.

## What is Load Balancing?

Let's use an example to understand the idea of load balancing better. Suppose our application is active on a server. What if our application suddenly became much more popular? Is our single server capable of handling millions of requests?  The answer is NO, it usually leads to a server crash, and eventually, we will lose clients.

So, we will launch multiple application servers instead of using a single server.  Now how will be distributing the incoming traffic across multiple servers? Should we give the IPs of all our servers to the client and say to try every IP and connect? Would that be a good practice?

Of course not, If this much effort is to be made by users, they will end up abandoning our application. The load balancer resolves this issue. A load balancer is a server which distributes traffic across multiple servers. In other words, a load balancer is utilized to manage and reroute user traffic among various servers.

<img src='./images/pic2.JPG'>

Load Balancing is a method in which we can distribute network traffic across multiple resources with the help of a load balancer that supports an application. Another name for load balancing is *server pool*. It is essential to improving a website's functionality and dependability.

## What are DNS and DNS Load Balancing?

DNS stands for Domain Name System. It is a directory service that establishes a connection between the hostname and address on a network.

<img src="./images/pic3.JPG">

Remembering numbers is difficult. It is comparatively easier to remember names. We can reach a website using its different IP address, but it is easier to use the domain name, which consists of words and is unique to a particular website.

### DNS Load Balancing

Load Balancing can be classified into different categories. One of the categories of Load Balancing is *DNS Load Balancing*. It involves configuring the domain name to route network requests and divide them among servers.

<img src="./images/pic4.JPG">

DNS Load Balancing keeps the apps accessible and evenly distributes network traffic among the servers. We can provide domain to any service accessible through the internet, like a website, a mail system, a print server, etc.

## Understanding Activity 1

`www.google.com` uses the concept of DNS load balancing. Multiple servers with different IP addresses are deployed with the application code running. All these servers are connected to the load balancer, which has a single DNS name. When a user sends a request to the DNS name (like we did, using the ping command), the load balancer automatically detects which server is accessible for use or has a lesser workload and connects us to that server.

## Activity 2 : Ping to `www.google.com` using command prompt

Now that we understand the concept of load balancing and DNS load balancing, let's do one more activity and try to understand the result.

Open the command prompt and ping to `www.google.com`.

<img src="./images/pic5.JPG">

Observe the IP address.
Try to rerun the same command, and you will get the same IP address.

Now change the wifi connection and again ping to `www.google.com`.

<img src="./images/pic6.JPG">

Observe the IP address in both cases. We will see that the IP addresses change. Now, you should know the reason behind it.

Google uses DNS load balancing in the backend to distribute traffic across the servers. So every time we send packets to the server, we get a different IP. In the above activity, it returned the same address when we tried to ping `google.com` using the same internet connection. It happened as the google servers use some concepts to maintain cache and metadata, and based on that, you will be connected to the same google server for a specific interval of time.

## Conclusion
Deploying a single server for hosting web applications cannot serve millions of requests, so we need to deploy multiple servers. Load balancer helps in distributing incoming traffic across multiple servers equally. It reduces workload and assists in serving user requests smoothly.