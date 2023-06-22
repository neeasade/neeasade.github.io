const copyButtonLabel = "📋";

// use a class selector if available
let blocks = document.querySelectorAll("pre");

blocks.forEach((block) => {
  // only add button if browser supports Clipboard API
  if (navigator.clipboard) {
    let button = document.createElement("button");

    button.innerText = copyButtonLabel;
    block.appendChild(button);

    button.addEventListener("click", async () => {
	await copyCode(block, button);
    });
  }
});

async function copyCode(block, button) {
  let parentElement = block;

    // hack, ignore child elements (here, just the copy button)
  let text = [].reduce.call(parentElement.childNodes, function(a, b) { return a + (b.nodeType === 3 ? b.textContent : ''); }, '');

  // let text = code.innerText;

  await navigator.clipboard.writeText(text);

  // visual feedback that task is completed
  button.innerText = "Copied!";

  setTimeout(() => {
    button.innerText = copyButtonLabel;
  }, 700);
}

