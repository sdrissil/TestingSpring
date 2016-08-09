




-- Le code de l'aspect � ex�cuter doit �tre contenu dans une m�thode qui attend en param�tre un objet de type ProceedingJoinPoint. 
-- La classe contenant la m�thode doit �tre instanciable par le contexte.
-- L'aspect fait r�f�rence � un bean g�r� par le conteneur.
-- L'advice est une association entre le point de coupe et la m�thode de l'aspect � ex�cuter. 
-- La configuration de l'AOP se fait avec un tag <aop:config>.
-- Chaque aspect est d�fini gr�ce � un tag <aop:aspect> 
-- La d�finition des points de jonction se fait en utilisant des expressions r�guli�res pour d�finir les m�thodes concern�es.
	Le caract�re � * � indique n'importe quel caract�re sauf le caract�re * lui-m�me ou n'importe quel �l�ment (modificateur, type de retour, classe, m�thode, param�tre)
	Les caract�res � .. � indiquent n'importe quelle signature ou sous-package
	Le caract�re � + � indique n'importe quel sous-type
-- <aop:spring-configured> : permet d'activer le support de l'annotation @Configurable