package biblioj

class Auteur {
	String nom
	String prenom

    static constraints = {
		nom(blank:false)
		prenom(blank:false)
    }
}
