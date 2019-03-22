package labfriday.poc.librarybooking.webdtos

import java.time.LocalDate
import java.time.LocalDateTime

data class ReservationConfirmation(
    val bookId : String,
    val successfullyReserved: Boolean,
    val startedLending: LocalDateTime,
    val returnDate: LocalDate
)