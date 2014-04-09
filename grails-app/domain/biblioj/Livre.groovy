package biblioj

class Livre {
	String titre
	int nombreExemplaires
	int nombreExemplairesDisponibles
    static constraints = {
		titre(blank:false)
		nombreExemplaires()
		nombreExemplairesDisponibles()
    }
}
