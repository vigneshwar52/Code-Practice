class Book{
  String? title;
  String? author;

  Book(
    this.title,
    this.author
  );

  @override
  String toString() {
    return "Title : $title, Author : $author";
  }
}

class Library{
  List<Book> availableBooks = [];
  List<Book> borrowedBooks = [];

  void addBook(Book book){
    availableBooks.add(book);
    print('Book "${book.title}" by ${book.author} added to the library.');
  }

  void borrowBook(String title){
    for(Book book in availableBooks){
      if(book.title == title){
        availableBooks.remove(book);
        borrowedBooks.add(book);
        print('Book "$title" has been borrowed.');
        return;
      }
    }
    print('Book "$title" is not available for borrowing.');
  }

  void returnBook(String title){
    for(var book in borrowedBooks){
      if(book.title == title){
        borrowedBooks.remove(book);
        availableBooks.add(book);
        print('Book "$title" has been returned to the library.');
        return;
      }
    }
    print('Book "$title" was not borrowed from the library.');
  }

  void deleteBook(String title){
    bool found  = false;
    availableBooks.removeWhere((book){
      if(book.title == title){
        found = true;
        print("Book $title removed from the library");
        return true;
      }
      return false;
    });

    if(!found){
     print('Book "$title" not found in the library.');
    }
  }


  void displayAvailableBooks(){
    if(availableBooks.isEmpty){
      print("No Books present in the library");
    } else{
      print("Books available in the library");
      for(Book book in availableBooks){
        print("${book.title} and the author is ${book.author}");

      }
    }
  }

  void displayBorrowedBooks(){
    if(borrowedBooks.isEmpty){
      print('No borrowed books.');
      return;
    }
    print("Borrowed Books : ");
    for(var book in  borrowedBooks){
      print(book);
    }
  }
}

void main(){

  Library library = Library();

  library.addBook(Book('The Hobbit', 'J.R.R. Tolkien'));
  library.addBook(Book('1984', 'George Orwell'));
  library.addBook(Book('To Kill a Mockingbird', 'Harper Lee'));

  // Display available books
  print('\nAvailable books:');
  library.displayAvailableBooks();

  // Borrow a book
  print('\nBorrowing "1984":');
  library.borrowBook('1984');

  // Display available and borrowed books
  print('\nAvailable books after borrowing:');
  library.displayAvailableBooks();
  print('\nBorrowed books:');
  library.displayBorrowedBooks();

  // Return a book
  print('\nReturning "1984":');
  library.returnBook('1984');

  // Display available and borrowed books after returning
  print('\nAvailable books after returning:');
  library.displayAvailableBooks();
  print('\nBorrowed books after returning:');
  library.displayBorrowedBooks();
}