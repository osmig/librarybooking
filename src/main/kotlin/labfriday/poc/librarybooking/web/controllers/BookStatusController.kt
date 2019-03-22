package labfriday.poc.librarybooking.web.controllers

import labfriday.poc.librarybooking.web.dto.Status
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import java.util.UUID

@Controller
@RequestMapping("/api/{bookId}")
class BookStatusController {
    @GetMapping("/")
    fun generalStatus(@PathVariable("bookId") bookId: String): ResponseEntity<Status> {
        val bookStatus = Status(bookId, UUID.randomUUID().toString(), "sadfljkasdflkj", false)
        return ResponseEntity(bookStatus, HttpStatus.OK)
    }

    @GetMapping("/status")
    fun reservationStatus(@PathVariable("bookId") bookId: String): ResponseEntity<Boolean> {
        val bookStatus = Status(bookId, UUID.randomUUID().toString(), "sadfljkasdflkj", false)
        return ResponseEntity(bookStatus.checkedIn, HttpStatus.OK)
    }
}