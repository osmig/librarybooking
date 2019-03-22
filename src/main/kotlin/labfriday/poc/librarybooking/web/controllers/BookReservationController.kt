package labfriday.poc.librarybooking.web.controllers

import labfriday.poc.librarybooking.web.dto.ReservationConfirmation
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import java.time.LocalDateTime

@Controller
@RequestMapping("/api/{bookId}")
class BookReservationController {
    @GetMapping("/reserve")
    fun status(@PathVariable("bookId") bookId: String): ResponseEntity<ReservationConfirmation> {
        val timestampNow = LocalDateTime.now()
        val returnDate = timestampNow.plusDays(30).toLocalDate()
        return ResponseEntity(ReservationConfirmation(bookId, true, timestampNow, returnDate), HttpStatus.OK)
    }
}