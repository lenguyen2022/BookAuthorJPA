DROP DATABASE IF EXISTS BookStoreDB;
CREATE DATABASE BookStoreDB;
USE BookStoreDB;
CREATE TABLE book
(   book_id BIGINT(6) NOT NULL AUTO_INCREMENT,
    title VARCHAR(100),
    PRIMARY KEY (book_id)
);

CREATE TABLE author
(
    author_id BIGINT(6) NOT NULL AUTO_INCREMENT,
    name VARCHAR(100),
    PRIMARY KEY (author_id)
);
CREATE TABLE author_book
(   author_id BIGINT,
    book_id   BIGINT,
    PRIMARY KEY (author_id, book_id),
    CONSTRAINT fk_author_id
        FOREIGN KEY (author_id) REFERENCES author (author_id),
    CONSTRAINT fk_book_id
        FOREIGN KEY (book_id) REFERENCES book (book_id)
);
