window.onload = function () {
  getQuote();
};

function getQuote() {
  fetch("https://api.quotable.io/random")
    .then((response) => response.json())
    .then((data) => {
      var y = document.getElementById("quote");
      y.innerHTML = data.content;
      var z = document.getElementById("author");
      z.innerHTML = data.author;
    });
}

document.addEventListener("DOMContentLoaded", function () {
  if (document.getElementById("skip") != null) {
    document.getElementById("skip").addEventListener("click", getQuote);
  }
});
