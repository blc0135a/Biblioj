package biblioj

class Livre {
	String titre
	int nombreExemplaires
	int nombreExemplairesDisponibles
	TypeDocument type
	static hasMany = [auteurs: Auteur]
	
    static constraints = {
		titre(blank:false)
		nombreExemplaires()
		nombreExemplairesDisponibles()
		type(nullable:true)

    }
	
	String toString(){
		"${titre}";
	}
}
