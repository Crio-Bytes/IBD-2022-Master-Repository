const http = require("http");
let dataAvailable = true;
let data = "Shweta Kale";
const server = http.createServer((req, res) => {
  // Set a timeout period for each connection
  const timeout = setTimeout(() => {
    res.end("No new data available");
  }, 30000);

  // Wait for new data to become available
  if (dataAvailable) {
    clearTimeout(timeout);
    res.end(data);
  }
});

server.listen(3000, () => {
  console.log("Server listening on port 3000");
});
