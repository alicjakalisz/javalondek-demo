Git - good practices

*commit powinnien miec dobry opis
*commit powinninen zawierac jedna zmiane
*zmiana opisu tylko dla ostatniego comitta (amend)
*pdorozuj po historii i branchach tylko przy czystym drzewie roboczym
*usuwanie branchy
    *zmergowany branch mozna usunac
    *nie powinnismy usuwac niezmergowanych branchy,bo nie bedziemy w stanie wrocic do nich
    *
    *nie usuwamy brancha na ktorym sie aktualnie znajdujemy
*git flow - w skrocie    
    * master - branch release'owy
    *develop - branch developerski
    *feature branch - branch do rozwoju funcjonalnosci
    *feature branch - powinien startowac od developa i do niego finalnie zostac zmergowany
    
* branch
    * wlasny branch nie musi byc idealny, moze nie dzialac, moze zawierac komentarze FIXME/TODO,
     ale wyslanie merge requesta z tego brancha musi zawierac "piekny kod"  


Git - przydatne komendy
git status
git add .
git add file name
git commit -m "[tag] - message"
git restore --staged file-name //zdejmij ze stage
git checkout branch-name // przelacz sie na branch name
git checkout -b branchname //przelacz na nowo utworzony branch
git log --graph // rysuje graf historii w konsoli
