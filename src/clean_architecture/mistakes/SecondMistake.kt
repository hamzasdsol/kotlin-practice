package clean_architecture.mistakes


/**
 * You don't need to use abstraction everywhere.
 * Use wherever it is needed
 */

data class Book(
    val id: Int,
    val name: String,
    val author: String
)

data class BookDto(
    val id: Int,
    val name: String,
    val author: String
)

interface BookMapper {
    fun toBook(bookDto: BookDto): Book
    fun toBookDto(book: Book): BookDto
}

/**
 * This is unnecessary because you don't need abstraction here because
 * there would not be multiple implementations for mapper class
 */
class DefaultBookMapper: BookMapper {
    override fun toBook(bookDto: BookDto): Book {
        return Book(bookDto.id, bookDto.name, bookDto.author)
    }

    override fun toBookDto(book: Book): BookDto {
        return BookDto(book.id, book.name, book.author)
    }
}

/**
 * The correct way / Extension function way
 */

fun Book.toBookDto() = BookDto(this.id, this.name, this.author)
fun BookDto.toBook() = Book(this.id, this.name, this.author)