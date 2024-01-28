# L3 design pattern report

- **Firstname**: [Nicolas]
- **Lastname**: [DODART]


> Add your thoughts on every TP bellow, everything is interesting but no need to right a book.
> 
> Keep it short simple and efficient:
> 
> - What you did and why
> - What helped you and why
> - What did you find difficult
> - What did not help you
> - What did you need to change
> - Anything relevant
> 
> Add a link to schemas describing your architecture (UML or not but add a legend)
> 
> Remember: it is ok to make mistakes, you will have time to spot them later.
> 
> Fill free to contact me if needed.

---
...

# Rapport du TP

>## Première Partie
>> ### introduction
>>Pour la première partie du TP, j'ai principalement essayé de mettre en œuvre le principe de responsabilité unique. Je n'ai pas ressenti de difficulté particulière lors de cette tâche, car c'est quelque chose que je pratique assez régulièrement lorsque je code, étant donné que j'ai l'esprit assez brouillon.  
>>J'ai également examiné deux autres points :
>>- Codage d'une tâche en tant qu'objet (classe Task)
>>- Travail sur la logique d'exécution des commandes (classes CommandExecutor, FileHandlerFactory)
>
>>### Codage d'une tâche en tant qu'objet
>>J'ai travaillé sur la classe Task car j'ai réalisé qu'il était compliqué de changer le concept de tâche sans retravailler sur la partie "complexe / logique" du code. Cela a impliqué que je modifie le fonctionnement des insert et des list pour qu'ils s'adaptent au concept d'objet Task. J'ai réussi à appliquer ce concept pour les fichiers CSV, mais pas pour les fichiers JSON en raison d'un problème avec les guillemets (`"`), ce qui a entraîné l'échec du ghost test.
>
>>### Travail sur la logique d'exécution des commandes
>>En ce qui concerne la retravail de la logique d'exécution (classes CommandExecutor, FileHandlerFactory), c'est parce qu'il me semblait compliqué d'ajouter un nouveau type de gestion de fichier sans se prendre la tête avec la logique d'exécution du code (pavé de `if` et de `else`). J'ai donc travaillé sur ces classes avec l'idée de rendre cela plus simple.
>
>>### Difficultés
>>#### Inserts avec Ghost Test
>>- Je n'ai pas réussi à trouver les commandes utilisées pour les inserts lors du Ghost Test.
>>#### Stockage dans les Fichiers 
>>- En lien avec le primier point, Je n'ai pas trouvé à quoi ressemblait le stockage dans les fichiers lorsque le test réussissait.
>>#### Gestion de Git
>> - Perte de temps due à une utilisation incorrecte de Git.
 
---