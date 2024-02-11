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
>>J'ai travaillé sur la classe Task car j'ai réalisé qu'il était compliqué de changer le concept de tâche sans retravailler sur la partie "complexe / logique" du code. Cela a impliqué que je modifie le fonctionnement des insert et des list pour qu'ils s'adaptent au concept d'objet Task. J'ai réussi à appliquer ce concept pour les fichiers CSV, mais pas pour les fichiers JSON en raison d'un problème avec les guillemets (`"`), ce qui a entraîné l'échec du ghost test.(Résolu : c'était seulement les guillemets de début et de fin d'output, j'ai pu les rajouter "manuellement" lors du print.)
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
>> 
>#### diagrame de class de mon programme:
> ```mermaid
> classDiagram
>     class App {
>         +main(String[] args): void
>         +exec(String[] args): int
>     }
>     class CommandLineSettingsProvider {
>         +parseCommandLine(String[] args, Options cliOptions): CommandLine
>         +getFileName(CommandLine cmd): String
>         +getCommand(CommandLine cmd): List<String>
>         +getFileContent(Path filePath): String
>     }
>     class CommandExecutor {
>         +executeCommand(String fileName, String command, List<String> positionalArgs, String fileContent, Path filePath): void
>     }
>     class FileHandlerFactory {
>         +createFileHandler(String fileName): Optional<FileHandlerBase>
>     }
>     class FileHandlerBase {
>         +insert(List<String> positionalArgs, String fileName, String fileContent, Path filePath): void
>         +list(String fileContent): void
>     }
>     class CsvFileBase {
>         +isCsv(String fileName): boolean
>     }
>     class JsonFileBase {
>         +isJson(String fileName): boolean
>     }
>     App --|> CommandLineSettingsProvider
>     App --|> CommandExecutor
>     CommandExecutor --|> FileHandlerFactory
>     FileHandlerFactory --|> FileHandlerBase
>     FileHandlerBase <|.. CsvFileBase
>     FileHandlerBase <|.. JsonFileBase
> ```
---
>## Deuxième Partie
>>### Introduction
>>Pour la deuxième partie du TP, je me suis concentré sur plusieurs points. Tout d'abord, l'ajout de fonctionnalités demandées par Ilia. Ce processus n'a pas été très compliqué car j'avais déjà créé un objet Task et adapté mes classes Insert et List en conséquence. Il m'a suffi d'ajouter un paramètre dans la classe Task et dans ses initialisations. Pendant ce processus, je me suis rendu compte qu'il peut être éprouvant de changer tous les paramètres qui initialisent la classe Task. J'ai donc créé une classe TaskCreator (distincte de ma classe Task pour la garder la plus simple possible) où je me charge de renvoyer une tâche avec les paramètres d'initialisation de la class Task (permet de regrouper les paramètres d'initialisation dans un seul point central)
>>### Gestion des Tâches et Flexibilité
>>Pour couvrir le plus d'éventualités et mieux gérer mes erreurs, j'ai envoyé ma ligne de commande directement dans ma fonction Insert plutôt que de passer par une liste d'arguments positionnels . Cela peut être moins optimal, mais je pense que cela offre plus de flexibilité. Peut-être devrais-je appliquer la même méthode pour la fonction List ?
>>### Réflexion sur les Fonctions Statiques
>>Je me suis aussi préoccupé de mes nombreuses fonctions statiques. Pour cela, je me suis concentré sur les fonctions principales de mon programme. Je pense notamment à ma classe CommandExecutor, où il me semble beaucoup plus facile de comprendre le fonctionnement du code avec des fonctions en statique.
>>### Gestion des Tests
>>Au moment où je fais ce commit, j'ai laissé les listes avec un "-" si l'option `done == false` pour qu'elles passent toujours les ghost tests.
>
>#### diagrame de class de mon programme:
>  (pour plus de lisibilité j'ai simplifié mon fichier CommandHandlers en une seul class excluant commandExecutor qui as pour moi une responsabilité plus grande  )
>```mermaid
>classDiagram
>    class App {
>        +exec(String[] args): int
>        +main(String[] args): void
>    }
>    class TaskCreator {
>        +creator(CommandLine cmd): Task
>    }
>    class Task {
>        -String name
>        -Boolean done
>        +getName(): String
>        +getDone(): Boolean
>   }
>    class FileHandlerFactory {
>        +createFileHandler(String fileName): Optional<FileHandlerBase>
>    }
>    class FileHandlerBase {
>        +insert(String fileName, String fileContent, Path filePath, CommandLine cmd): void
>        +list(String fileContent): void
>    }
>    class JsonFileBase {
>        +isJson(String fileName): boolean
>    }
>    class CsvFileBase {
>        +isCsv(String fileName): boolean
>    }
>    class CommandExecutor {
>        +executeCommand(String fileName, String command, String fileContent, Path filePath, CommandLine cmd): void
>    }
>     class CommandHandlers {
>         +parseCommandLine(String[] args, Options cliOptions): CommandLine
>         +getFileName(CommandLine cmd): String
>         +getCommand(CommandLine cmd): List<String>
>         +getFileContent(Path filePath): String
>         +isList(String command): boolean
>         +isinsert(String command): boolean
>     }
>
>    Task<..TaskCreator
>    CsvFileBase <|-- TaskCreator
>    JsonFileBase <|-- TaskCreator
>    CommandExecutor --|> FileHandlerFactory
>    FileHandlerFactory --|> FileHandlerBase
>    FileHandlerBase <|.. JsonFileBase
>    FileHandlerBase <|.. CsvFileBase
>    App --|> CommandHandlers
>    CommandHandlers --|>CommandExecutor
>```
---

>## Troisième  Partie
> j'ai commencé cette troisième en faisant deux chose:
> ajouter une fonctionnalité dont je n'ai pas pris connaissance qu'il fallait l'ajouter (le -d sur la command list)  
> corriger le partie list de mon prgramme pour correspondre a la sortie attendu par le ghost test
> j'ai modifier la logique de ma class FileHandlerFactory pour qu'il soit beaucoup plus facile de mettre en place de nouveau type de fichier a gérer.
> le but est de faire en sorte que les fichier puisse être identifiée et instanciée dynamiquement en fonction du nom du fichier, sans codage explicite des conditions pour chaque type. 