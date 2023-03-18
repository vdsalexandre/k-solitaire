# Solitaire game in Kotlin

### Rules
Le Solitaire est un jeu de patience qui se joue avec 52 cartes.
Dans notre première version, le tas de carte de réserve (le Deck en anglais) se tirera carte par carte (et non par trois). 
De plus, il ne sera possible de déplacer que la série entière de cartes retournée d’une colonne à l’autre (on ne peut pas choisir une partie de la série)

### Examples
Par exemple, si une colonne contient (X représente une carte retournée):
X, X, X, X, 5 of hearts, 4 of clubs, 3 of diamonds
Et qu’une autre colonne contient:
X, X, X, X, X, 8 of clubs, 7 of hearts, 6 of spades
On pourra déplacer la série entière 5 of hearts, 4 of clubs, 3 of diamonds et la placer derrière le 6 of spades.
Mais si une autre colonne contient X, X, X, 5 of diamonds on ne pourra pas y déplacer la portion de série 4 of clubs, 3 of diamonds
