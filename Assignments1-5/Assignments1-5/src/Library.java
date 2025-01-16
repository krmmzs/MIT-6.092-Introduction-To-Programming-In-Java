public class Library {
    String addresses;
    Book[] books = new Book[10];
    int size = 0;

    Library(String _addresses) {
        addresses = _addresses;
    }
     void addBook(Book book) { books[size ++] = book;
    }

    static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }

    void printAddress() {
        System.out.println(addresses);
    }

    void returnBook(String theLordOfTheRings) {
        for (int i = 0; i < size; i ++) {
            if (books[i].getTitle().equals(theLordOfTheRings)) {
                books[i].returned();
                System.out.println("You successfully returned " + theLordOfTheRings);
                break;
            }
        }
    }

    void borrowBook(String targetBook) {
        boolean isFound = false;
        for (int i = 0; i < size; i ++) {
            if (books[i].getTitle().equals(targetBook)) {
                isFound = true;
                if (books[i].isBorrowed()) {
                    System.out.println("Sorry, this book is already borrowed.");
                    break;
                }
                books[i].borrowed();
                System.out.println("You successfully borrowed " + targetBook);
                break;
            }
        }
        if (!isFound) {
            System.out.println("Sorry, this book is not in our catalog.");
        }
    }
    void printAvailableBooks() {
        if (size == 0) {
            System.out.println("No book in catalog");
        }
        for (int i = 0; i < size; i ++) {
            if (!books[i].isBorrowed()) {
                System.out.println(books[i].getTitle());
            }
        }
    }
    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");
        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));
        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();
        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();
        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();
        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();
        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();
        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }


}