

<?php
/* 
Realiser par : mahdi boughrous et ....;
exercice n° : 3 ;
*/



echo "<h1>Calcul sur les variables</h1>";
$TVA = 0.2;
$prix = 150;
$nombre = 10;

$HT = $prix * $nombre;
$TTC = $HT*(1 + $TVA);

$vars = array($HT,$TTC,$TVA,$nombre,$prix);
$vars2 = array('$HT','$TCC','$TVA','$nombre','$prix');
for($i = 0 ; $i < count($vars);$i++){
    echo "<br> -------------------------";
    echo "<br>".$vars2[$i]." :<br> valeur :" .$vars[$i]."<br>type : ".gettype($vars[$i])."<br>";
}
?>
