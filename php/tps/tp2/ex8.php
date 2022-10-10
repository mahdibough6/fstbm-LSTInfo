<?php
/* 
Realiser par : mahdi boughrous et ....;
exercice n° : 2 ;
*/
// tri du tab1
$tab1 = array ("3", "5","0", "8", "7");


function afficher($t){
    $i = 1;
    foreach($t as $e){
    echo "<br>";
        echo "elem $i  = ".$e;
    echo "<br>";
        $i++;
    }
    unset($i);
    unset($e);
}
function afficherTri($t){
   sort($t);
    afficher($t);
    echo "<br>";
}
    echo "<br> afficher les element du tableau sans order :";

afficher($tab1);
    echo "<br> afficher les element du tableau en order :";
afficherTri($tab1);

// iri du tab2
$tab2 = array ("carottes"=>"3", "Tomates"=>8,"courgettes"=>13);

function aafficher($t){
    foreach($t as $x => $x_val){
  echo "<br>";
      echo "Key=" . $x . ", Value=" . $x_val;
  echo "<br>";
    unset($x);
    unset($x_val);
    }
}
function aafficherTri($t){
    asort($t);
    aafficher($t);
    echo "<br>";
}
    echo "<br> afficher les element du tableau sans order :";
aafficher($tab2);
    echo "<br> afficher les element du tableau en order :";
aafficherTri($tab2);

?>
