
<?php
/* 
Realiser par : mahdi boughrous et ....;
exercice n° : 3 ;
*/


$nombre = 30;
echo "le nombre : $nombre <br>";

if($nombre%15 == 0){
    echo " est un multiple de 3 et 5";

}
else {
    echo " n'est un multiple de 3 est 5";
}
echo "<br>";
// si le nombre est paire ou impaire 


if ($nombre%2 == 0){
    echo "le nombre $nombre est paire";
}
else {

    echo "le nombre $nombre est impaire";
}

//pgcd 

$c = 546;
$d = 218;
$e = 12.3;
$f = 8.2;
function calPGCD($a,$b){
if($a > $b){
while($a%$b != 0){
    $c = $a%$b;
    $a = $b;
    $b = $c ;
}
echo "<br>le pgcd est : $b";
}
else {
while($b%$a != 0){
    $c = $b%$a;
    $b = $a;
    $a = $c ;
}
echo "<br>le pgcd est : $a";

}
}
calPGCD($c,$d);
calPGCD($e,$f);
// 
//
//
//
//

// pers 1
$age1 = 41;
$sexe1 = "feminin";
// pers 2
$age2 = 22;
$sexe2 = "masculin";
//pers 3
$age3 = 23;
$sexe3 = "feminin";
function check($age,$sexe){
if($age <= 40 && $age >= 21 && $sexe == "feminin" )
{
    echo " <br>Bienvenue !";
}
else {
    echo " <br>desole !";
}

}
check($age1,$sexe1);
check($age2,$sexe2);
check($age3,$sexe3);
?>
