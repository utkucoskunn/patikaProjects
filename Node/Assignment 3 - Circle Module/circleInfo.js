/**** Circle Area****/
function circleArea(r){
    const area= (Math.PI)*r**2;
    console.log(`Area=${area}`);
}

/**** Circle Circumference****/
function circleCircumference(r) {
    const circumference = (Math.PI) * r * 2;
    console.log(`Circlecircumference=${circumference}`);
}

module.exports={circleArea,circleCircumference};