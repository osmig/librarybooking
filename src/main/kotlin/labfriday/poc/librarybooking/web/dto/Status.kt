package labfriday.poc.librarybooking.web.dto

data class Status(
    val bookId: String,
    val isbn: String,
    val title: String,
    val checkedIn: Boolean
)