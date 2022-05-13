
/* this function adds an item to the list by inserting 
HTML code at a specific div */
function addItem() {
    var div = document.createElement('div'); //the div
    var inputValue = document.getElementById("input").value; //getting the inputted item
    var t = document.createTextNode(inputValue); //creating the node w/ item

    div.append(t); //appenind the node to the div

    /* if the input is empty, let the user know; otherwise, add the item */
    if(inputValue === '') {
        alert("Um, its empty...");
    } else {
        div.setAttribute('class', 'item'); //give the div a class
        div.innerHTML = document.getElementById('myList').innerHTML;

        /* the HTML code to be inserted w/ the new item value.
        will add in delete button after the end label (maybe) */
        div.innerHTML = `
            <input type="checkbox">
            <label class="item-style">
              ${inputValue}
            </label>
        `;

        /* add the div (with the item value) into myList; add the item */
        document.getElementById("myList").appendChild(div);
    }

    /* reset the text for the next item */
    document.getElementById("input").value = "";
}