import java.io.*;
import java.util.*;

class Book {
    private String title;
    private List<String> authors;

    public Book(String title, List<String> authors) {
        this.title = title;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getAuthors() {
        return authors;
    }
}

class Category {
    private String name;
    private List<Book> books;

    public Category(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getName() {
        return name;
    }
}

public class Perpustakaan {
    private Map<String, Category> categories;

    public Perpustakaan() {
        this.categories = new HashMap<>();
    }

    public void addCategory(String name) {
        categories.put(name, new Category(name));
    }

    public void addBookToCategory(String categoryName, Book book) {
        Category category = categories.get(categoryName);
        if (category != null) {
            category.addBook(book);
            System.out.println("Buku berhasil ditambahkan ke dalam kategori " + categoryName);
        } else {
            System.out.println("Kategori '" + categoryName + "' tidak ditemukan. Menambahkan kategori baru...");
            addCategory(categoryName);
            addBookToCategory(categoryName, book);
        }
    }

    public void displayBooksInCategory(String categoryName) {
        Category category = categories.get(categoryName);
        if (category != null) {
            System.out.println("Buku dalam kategori " + categoryName + ":");
            List<Book> books = category.getBooks();
            if (!books.isEmpty()) {
                for (Book book : books) {
                    System.out.println("Judul: " + book.getTitle());
                    System.out.println("Penulis: " + String.join(", ", book.getAuthors()));
                    System.out.println();
                }
            } else {
                System.out.println("Tidak ada buku dalam kategori ini.");
            }
        } else {
            System.out.println("Kategori '" + categoryName + "' tidak ditemukan.");
        }
    }

    public void writeToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (Category category : categories.values()) {
                writer.println("Kategori: " + category.getName());
                for (Book book : category.getBooks()) {
                    writer.println("Judul: " + book.getTitle());
                    writer.println("Penulis: " + String.join(", ", book.getAuthors()));
                    writer.println();
                }
            }
            System.out.println("Data telah ditulis ke " + filename);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis ke file: " + e.getMessage());
        }
    }

    // ...

    public void readFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Kategori: ")) {
                    String categoryName = line.substring("Kategori: ".length());
                    addCategory(categoryName);
                } else if (line.startsWith("Judul: ")) {
                    String title = line.substring("Judul: ".length());
                    String authorsLine = reader.readLine();
                    String[] authors = authorsLine.substring("Penulis: ".length()).split(", ");
                    addBookToCategory(categories.keySet().stream().findFirst().get(),
                            new Book(title, Arrays.asList(authors)));
                }
            }
            System.out.println("Data telah dibaca dari " + filename);
        } catch (IOException e) {
            System.out.println("Kesalahan membaca dari file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Perpustakaan library = new Perpustakaan();
        library.readFromFile("C:\\Users\\isria\\Desktop\\OOP\\library_data.txt"); // Sesuaikan dengan path lengkap file library_data.txt

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Sistem Perpustakaan");

        while (true) {
            System.out.println("\nPilih suatu tindakan:");
            System.out.println("1. Tambah buku");
            System.out.println("2. Tampilkan Buku dalam Kategori");
            System.out.println("3. Tulis Data ke File");
            System.out.println("4. Baca Data dari File");
            System.out.println("5. Keluar");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Masukkan judul buku:");
                    String title = scanner.nextLine();

                    System.out.println("Masukkan penulis (dipisahkan koma):");
                    String[] authors = scanner.nextLine().split(", ");
                    System.out.println("Masukkan nama kategori:");
                    String categoryName = scanner.nextLine();
                    library.addBookToCategory(categoryName, new Book(title, Arrays.asList(authors)));
                    break;
                case 2:
                    System.out.println("Masukkan nama kategori:");
                    categoryName = scanner.nextLine();
                    library.displayBooksInCategory(categoryName);
                    break;
                case 3:
                    System.out.println("Masukkan nama file untuk disimpan:");
                    String saveFileName = scanner.nextLine();
                    library.writeToFile(saveFileName);
                    break;
                case 4:
                    System.out.println("Masukkan nama file yang akan dimuat:");
                    String loadFileName = scanner.nextLine();
                    library.readFromFile(loadFileName);
                    break;
                case 5:
                    System.out.println("Keluar dari program...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
