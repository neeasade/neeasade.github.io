
// give us anchors on headings bls

function make_header(elem) {
    header_text = elem.textContent;
    t = elem.tagName;
    id = elem.getAttribute("id");
    url = document.location.href.match(/(^[^#]*)/) + "#" + id
    new_el = document.createEelement(og_tag);
    new_el.innerHtml = "<"+t+"><a href='" + url + "'>" + header_text + "</a>";
    elem.parentNode.replaceChild(new_el, elem)
}

headers = ['h1', 'h2', 'h3', 'h4', 'h5'];
for (int i = 0; i < headers.length; i++) {
    make_header
    headers[]
}
