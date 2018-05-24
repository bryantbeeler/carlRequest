import java.util.HashMap;import java.util.Map;//helpful links:// https://www.tutorialspoint.com/java/util/hashmap_values.htm// https://www.tutorialspoint.com/java/util/hashmap_size.htm// http://www.tutorialspoint.com/java/util/hashmap_put.htm//The FindAverage classpublic class FindAverage {    public static void main(String [] args) {        //Questions:                //1) What is the average number of pages ALL the students have read? show me results in a comment        //2) If this book was added to object ted: ("Remembrance of Things Past", 4215")        //would be the average number of pages ALL the students have read? show me results in a comment        //Write your logic in static method averagePages() and instance method totalPages()                Student carl = new Student("Carl Bevere", 25);        carl.addBooks("Green Eggs and Ham", 20);        carl.addBooks("War and Peace", 1225);        carl.addBooks("Game of thrones", 694);                Student ted = new Student("Ted Ytienne", 24);        ted.addBooks("The Hobbit", 304);        ted.addBooks("Life of Pi", 354);        ted.addBooks("A Feast for Crows", 753);                Student nerine = new Student("Neriene Tarper", 23);        nerine.addBooks("The Two Towers", 415);        nerine.addBooks("War and Peace", 1225);        nerine.addBooks("A Storm of Swords", 973);                Student [] studentArray = {carl, ted, nerine};        }      }        System.out.println(averagePages(studentArray));

    }        public static double averagePages(Student [] students) {    public static double averagepages(){

     double sum = 0;

     double divisor;

     for (int i=0; i < student.length; i++){

       sum+=student[i].totalPages;

       divisor += student[i].totalBooks;

     }      return sum/divisor;

   }        //how would you get the average number of all the books of all the students?        //for example: theres 5 students, each have 2 books:  totalNumber of pages of all students / totalNumber of books of all students        //write your logic in here        //please message me if you need help        return 0; //replace this 0 with a variable called average    }}//The Student classclass Student{    int age;    String name;    Map<String, Integer> books = new HashMap<String, Integer>();        public Student(String name, int age){        this.name = name;        this.age = age;    }  public int totalBooks(){

   int total = this.books.size();

   return total;

 }

        public void addBooks(String bookName, int bookPages) {        this.books.put(bookName,bookPages);        }        public int totalPages(){                //How would you get the total number of pages a student has of all of their books?        //write your logic in here        //please message me if you need help        return 0; //replace this 0 with a variable called sum    }  public int totalBooks(){

   int sum = 0;

   for(int pages:this.books.values()){

     int sum += pages;

   }

   return sum;

 }}