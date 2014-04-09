package biblioj

class TypeDocument {
	String intitule;
    static constraints = {
		intitule()
    }
	
	String toString(){
		"${intitule}";
	}
}
