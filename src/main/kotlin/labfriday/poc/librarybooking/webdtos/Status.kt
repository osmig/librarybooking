package labfriday.poc.librarybooking.webdtos

data class Status(
    val bookId: String,
    val isbn: String,
    val title: String,
    val checkedIn: Boolean
)