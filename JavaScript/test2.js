//неправильное использование функций
var x = "Внешний";
var f1 = function()
{
    var x = "Внутри F1";
}
f1();
console.log(x);

//правильное использование переменных
var x = "Внешняя";
var f2 = function()
{
    x="Внутри F2";
}
f2();
console.log(x);

// максимальное кол-во стэков
/*function chicken() {
return egg();
}
function egg() {
return chicken();
}
console.log(chicken() + " came first.");
*/


//функция которая принимает строку в качестве элемента, и возвращает  кол-во символов аргумента (L)
var numB1 = 0;
var f3 = function (str) 
{
    for (var i = 0; i < str.length; i++) 
    {
       if ('l' == str.toLocaleLowerCase().charAt(i)) 
       {
           numB1++;
       }
   }
}
f3("Localelup");
console.log("Первый вариант функции "+numB1);


//функция которая принимает строку в качестве элемента, и возвращает  кол-во символоф аргумента
var numB2 = 0;
var f4 = function (str, letter) 
{
    for (var i = 0; i < str.length; i++) 
    {
       if (letter == str.toLocaleLowerCase().charAt(i)) 
       {
           numB2++;
       }
   }
}
f4("Localelup", 'l');
console.log("Второй вариант функции "+numB2);


//Объекты
var myObj={
    left: "1",
    right: 2,
    /* middle: function(){
    
    }*/
}
for (var name in myObj){
console.log(name);
}

//задание на лекции машина, модель, год, двигатель
var myCar=
    {
    make: "Ford",
    model: "Sierra",
    year: 1986,
    engine:
        {
        volume: 2500,
        power: 200
        }
    }
for (var name1 in myCar)
{
console.log(name1);
}
console.log(myCar.make);
console.log(myCar.model);
console.log(myCar.year);
console.log(myCar.engine.power);
console.log(myCar.engine.volume);

//конструктор

function car (model, make){
    this.model = model;
    this.make = make;
}

var toyota = new car("Тойота", 1989);

car.prototype.speak = function(line){
    console.log("я"+this.model+"фываыва"+line);
};
toyota.speak("asfasf");