const http = require('http');
const server = http.createServer((req, res) => {
    const url = req.url;

    if (url === "/index") {
        res.writeHead(200, {"Content-Type": "text/html"});
        res.write("<h2>WELCOME TO INDEX PAGE</h2>");
    } else if (url === "/about") {
        res.writeHead(200, {"Content-Type": "text/html"});
        res.write("<h2>WELCOME TO ABOUT ME PAGE!</h2>")
    } else if (url === "/contact") {
        res.writeHead(200, {"Content-Type": "text/html"});
        res.write("<h2>WELCOME TO CONTACT PAGE!</h2>")
    } else {
        res.writeHead(200, {"Content-Type": "text/html"});
        res.write("<h2>404 PAGE NOT FOUND!</h2>")
    }
    res.end();
});
const port=5000;

server.listen(port,()=>{
    console.log(`Server started with port ${port}`);
})