function handleRSVP() {
  const button = document.getElementById("rsvp-btn");
  const responseMsg = document.getElementById("response-msg");

  // Update button state
  button.innerText = "LOCKED IN! ✅";
  button.style.backgroundColor = "#4caf50";
  button.disabled = true;

  // Show confirmation message
  responseMsg.innerText = "See you in Discord! Don't forget your warmup.";
  responseMsg.classList.remove("hidden");
}