function showTime(){
    let date = new Date();
    let h = date.getHours();
    let m = date.getMinutes();
    let s = date.getSeconds();
    let d = date.getDate() ;
    let day=new Date().getDay();
    let month = date.getMonth()+1;
    let year = date.getFullYear();
    let session = "AM";


    let val;
    switch (day) {
        case 0:
            val = "Pazar";
            break;
        case 1:
            val = "Pazartesi";
            break;
        case 2:
            val = "Salı";
            break;
        case 3:
            val = "Çarşamba";
            break;
        case 4:
            val = "Perşembe";
            break;
        case 5:
            val = "Cuma";
            break;
        case 6:
            val = "Cumartesi";
            break;
    }

    if(h == 0){
        h = 12;
    }

    if(h > 12){
        h = h - 12;
        session = "PM";
    }

    h = (h < 10) ? "0" + h : h;
    m = (m < 10) ? "0" + m : m;
    s = (s < 10) ? "0" + s : s;
    d = (d < 10) ? "0" + d : d;
    month = (month < 10) ? "0" + month : month;



    let time = h + ":" + m + ":" + s + " " + session + " "+val;
    document.getElementById("DigitalCLOCK").innerText = time;
    document.getElementById("DigitalCLOCK").textContent = time;
    setTimeout(showTime, 1000);


}

showTime();

