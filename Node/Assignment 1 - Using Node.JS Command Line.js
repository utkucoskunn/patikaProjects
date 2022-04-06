let calculateArea=(r)=>{
    return (Math.PI)*r*r;
}

const arg=process.argv.slice(2);
let r=arg[0]*1;

if(r>0){
    console.log(`Area=${calculateArea(r)}`);
    console.log(typeof r);
}