const express = require("express");
const app = express();

let dataAvailable = true;

app.get("/long-poll", (req, res) => {
  let data = "No new data is available";

  // Set a timer to check for new data every 5 seconds
  const interval = setInterval(() => {
    // Check for new data here
    // For example, you could query a database or make an API call

    // If new data is available, update the data object and clear the interval
    if (dataAvailable) {
      data = "Shweta Kale";
      clearInterval(interval);
    }
  }, 5000);

  // Wait for new data or for the timeout to expire
  setTimeout(() => {
    res.send(data);
  }, 30000);
});

app.listen(3000, () => {
  console.log("Server listening on port 3000");
});
