package seminars.fourth.book;


import org.junit.jupiter.api.Test;

import static java.lang.String.valueOf;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {
    /**
     * Задание 2.
     * У вас есть класс BookService, который использует интерфейс BookRepository
     * для получения информации о книгах из базы данных.
     * Ваша задача написать unit-тесты для BookService,
     * используя Mockito для создания мок-объекта BookRepository.
     */
    @Test

    public void bookServiceTest() {
        BookRepository bookRepositoryMock = mock(BookRepository.class);

        when(bookRepositoryMock.findById("1")).thenReturn(new Book("1", "Book1", "Author1"));
        when(bookRepositoryMock.findById("2")).thenReturn(new Book("2", "Book2", "Author2"));
        when(bookRepositoryMock.findById("3")).thenReturn(new Book("3", "Book3", "Author3"));
        BookService bookService = new BookService(bookRepositoryMock);

//         тест успешен
//        assertThat(bookService.findBookById("1").getId()).isEqualTo("1");

//         тест неуспешен
        assertThat(bookService.findBookById("2").getId()).isEqualTo("3");

    }
}