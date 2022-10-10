<?php /* 
Realiser par : mahdi boughrous et ....;
exercice n° : 3 ;
*/

//sans static 
function cumul($prix)
{
    static $cumul = 0;
    static $i = 0;
    echo "total des achats $i = ";
    $cumul += $prix;
    $i++;
    return $cumul;
}
echo cumul(175),"<br>";
echo cumul(65),"<br>";
echo cumul(69),"<br>";
//calculer la surface d'une cercle

define("PI",3.14);

function surface($r){
    $s = PI*pow($r,2);
    return $s;
}
echo "claclue de la surface d'une cercle <br> ";
echo '$r = 2 dans la surface ='.surface(2);
?>
