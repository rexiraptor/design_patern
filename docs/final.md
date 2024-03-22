# L3 Design Pattern Report

- **Firstname**: [Nicolas]
- **Lastname**: [DODART]

ajouter une commande:
pour ajouter une commande au programme faut:
rajouter un fichier qui hérite de CommandAction dans lequel tu diras quel est la logique de cette fonction(que va t'elle faire?)
ne pas oublier de rajouter le nom de ta commande dans le CommandHandlerMap (en suivant l'exemple des lignes du dessus)
a la fin du nom de la command ne pas oublier de rajouter le nom de la source (File si c'est pour un fichier par exemple)
ne pas hésiter a rajouter des fonctions dans les fichiers "Base" (filHandlerBase par exemple) en cas de besoin (ne pas oublier de respecter la methode SOLID (voir les dossier csvhandler et jsonhandlerpour avoir un exmple))


pour ajouter un nouveau type fichier prise en charge:
dans le dossier file, créer un dossier avec le nom du nouveau fichier pris en charge(prendre exemple sur ceux existant)
faire un fichier qui hérite de FileHandlerBase et y mettre toute les fonctions nécessaire (List et Insert au moment ou ce document est écrit) et les coder!
ne pas ouvblier de respecter la methode SOLID (voir les dossier csvhandler et jsonhandler pour avoir un exmple)



pour  ajouter une nouvelle source de données(interface ou source de donnée non-fichier par exemple ) il faut:
rajouter un dossiser dans le fichier data qui est nommé d'apres le nouveau type de source
rajouter comment reconnaitre ce nouveau type de data dans le SourceIdentifier
pour ajouter des commande à ce type de source voir: comment ajouter une nouvelle commande 

pour ajouter un attribut a une task, il faut:
rajouter l'attribut a la classe Task et faire un geter( faire comme pour les autre attribut)
ne pas oublier de rajouter la gestion de l'attribut dans la class TaskCreator

