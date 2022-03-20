(function () {
    let name = prompt("Please enter your name:");
    name = name.toLowerCase();
    let arr = name.split("");
    arr.splice(0, 1, arr[0].toUpperCase());
    arr = arr.join("");

    let myName = document.querySelector("#myName");
    myName.innerHTML = `${arr}`
})()

/*let date=new Date();
let hour=date.getHours()
let minute=date.getMinutes()
let second=date.getSeconds();
let myClock=document.querySelector("#myClock");
myClock.innerHTML=`${hour}`+`${minute}`+`${second}`;*/

