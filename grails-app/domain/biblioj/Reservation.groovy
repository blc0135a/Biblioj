package biblioj

class Reservation {
	String code
	Date dateReservation
    static constraints = {
		code(blank:false, unique:true)
		dateReservation(blank:false)
    }
}
