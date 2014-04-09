import biblioj.Auteur
import biblioj.Livre
import biblioj.TypeDocument;

class BootStrap {

    def init = { servletContext ->
		if (!Livre.count()){
			def nouveaute = new TypeDocument(intitule:"Nouveaut�").save(failOnError: true)
			def ado = new TypeDocument(intitule:"Livre ado").save(failOnError: true)
			def adulte = new TypeDocument(intitule:"Livre adulte").save(failOnError: true)
			
			def vigan = new Auteur(nom:"Vigan", prenom:"Delphine de").save(failOnError: true)
			def collins = new Auteur(nom: "Collins", prenom:"Suzanne").save(failOnError: true)
			def stockett = new Auteur(nom:"Stockett", prenom:"Kathryn").save(failOnError: true)
			def carrere = new Auteur(nom:"Carr�re", prenom:"Emmanuel").save(failOnError: true)
			def murakami = new Auteur(nom:"Murakami", prenom:"Haruki").save(failOnError: true)
			def delacourt = new Auteur(nom:"Delacourt", prenom:"Gr�goire").save(failOnError: true)
			def larsson = new Auteur(nom:"Larsson", prenom:"Stieg").save(failOnError: true)
			def ferrari = new Auteur(nom:"Ferrari", prenom:"J�r�me").save(failOnError: true)
			def pennac = new Auteur(nom:"Pennac", prenom:"Daniel").save(failOnError: true)
			def dicker = new Auteur(nom:"Dicker", prenom:"Jo�l").save(failOnError: true)
			def jonasson = new Auteur(nom:"Jonasson", prenom:"Jonas").save(failOnError: true)
			
			new Livre(titre:"Rien ne s'oppose � la nuit : roman", auteurs:vigan, type:nouveaute).save(failOnError: true)
			new Livre(titre:"Hunger games [Texte imprim�]", auteurs:collins, type:ado).save(failOnError: true)
			new Livre(titre:"La couleur des sentiments", auteurs:stockett, type:nouveaute).save(failOnError: true)
			new Livre(titre:"L'embrasement", auteurs:collins, type:ado).save(failOnError: true)
			new Livre(titre:"Limonov", auteurs:carrere, type:nouveaute).save(failOnError: true)
			new Livre(titre:"1Q84. 1. Avril-juin", auteurs:murakami, type:nouveaute).save(failOnError: true)
			new Livre(titre:"1Q84. 3. Octobre-d�cembre", auteurs:murakami, type:nouveaute).save(failOnError: true)
			new Livre(titre:"La r�volte", auteurs:collins, type:ado).save(failOnError: true)
			new Livre(titre:"La liste de mes envies", auteurs:delacourt, type:adulte).save(failOnError: true)
			new Livre(titre:"1Q84. 2. Juillet-septembre", auteurs:murakami, type:nouveaute).save(failOnError: true)
			new Livre(titre:"La reine dans le palais des courants d'air [Texte imprim�]", auteurs:larsson, type:adulte).save(failOnError: true)
			new Livre(titre:"Le sermon sur la chute de Rome", auteurs:ferrari).save(failOnError: true)
			new Livre(titre:"Journal d'un corps", auteurs:pennac).save(failOnError: true)
			new Livre(titre:"La v�rit� sur l'affaire Harry Quebert : roman", auteurs:dicker, type:adulte).save(failOnError: true)
			new Livre(titre:"Le vieux qui ne voulait pas f�ter son anniversaire : roman", auteurs:jonasson, type:nouveaute).save(failOnError: true)
			
			
		}
    }
    def destroy = {
    }
}

/*String titre
int nombreExemplaires
int nombreExemplairesDisponibles
TypeDocument type
static hasMany = [auteurs: Auteur]*/