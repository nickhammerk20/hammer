

var power = function(base, exponent)
{
var result = 1;
for (var count = 0; count<exponent; count++)
    result*=base;
return result;
}
console.log(power(2,5));



function multiplier(factor)
{
    return function( number )
    {
        return factor * number;
    };
}
var x = multiplier(2);
console.log(x(5));



function multiplier(factor) {
return function(number) {
return number * factor;
};
}
var twice = multiplier(2);
console.log(twice(5));