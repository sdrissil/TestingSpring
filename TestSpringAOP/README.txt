




-- Le code de l'aspect à exécuter doit être contenu dans une méthode qui attend en paramètre un objet de type ProceedingJoinPoint. 
-- La classe contenant la méthode doit être instanciable par le contexte.
-- L'aspect fait référence à un bean géré par le conteneur.
-- L'advice est une association entre le point de coupe et la méthode de l'aspect à exécuter. 
-- La configuration de l'AOP se fait avec un tag <aop:config>.
-- Chaque aspect est défini grâce à un tag <aop:aspect> 
-- La définition des points de jonction se fait en utilisant des expressions régulières pour définir les méthodes concernées.
	Le caractère « * » indique n'importe quel caractère sauf le caractère * lui-même ou n'importe quel élément (modificateur, type de retour, classe, méthode, paramètre)
	Les caractères « .. » indiquent n'importe quelle signature ou sous-package
	Le caractère « + » indique n'importe quel sous-type
-- <aop:spring-configured> : permet d'activer le support de l'annotation @Configurable