
<?php
 /* 
Realiser par : mahdi boughrous et ....;
exercice n° : 3 ;
*/



function check($nbr){
 $i = 1;
while($i <=$nbr){
static $somme = 0;
    $somme = $somme + $i;
    $i++;
}
echo "limite : $nbr";
echo "la somme est : $somme <br>";
if($somme <= 100){
    echo" <br> Pas suffisant ";
}
else{

    echo" <br> Bon resultat";
}

    unset($i);
    unset($somme);
}
//test 
$nbr1 = 100;
$nbr2 = 10;
check($nbr1);
check($nbr2);


// pow 
echo "<br> q n° 2<br>";

for($i = 1; $i <= 30;$i++){
    $r = pow($i,$i);
    echo "<br>$i<sup>$i</sup> = $r<br>";
}

?>
