
class library{
    String name;
    int quantity=3;
    public String addbook(){
   
    name="harry potter";
     System.out.println(" name of the book you want to add is = "+name);
    quantity++;
    return name;
    }
    public void stock(){
        System.out.println("The total number of books in the library is:"+quantity);
    }

}


public class ex5{
    public static void main(String[] args) {
        String[] books= new String[10];
        books[0]="Book1";
        books[1]="Book2";
        books[2]="Book3";
        books[3]="Book4";
        library book=new library();
        String newbook=book.addbook();
                    System.out.println(newbook);
                    for(int i=0;i<books.length;i++){
                    if(books[i]==null){
                    books[i]=newbook;
                    break;
                }}

                System.out.println("\nthe available books in the library are\n ");
                    for(int i=0;i<books.length;i++){
                        if(books[i] != null){
                        System.out.println(books[i]);
        }
                    }
       // System.out.printf("1. add book\n 2. show total quanitity of books \n 3. show availabie books \n 4. issue book \n 5. removebook\n");
       /*  int choice =1;
        System.out.printf("your choice was="+choice);
        switch (choice) {
            case 1 :   
                    
                    String newbook=book.addbook();
                    System.out.println(newbook);
                    for(int i=0;i<books.length;i++){
                    if(books[i]==null){
                    books[i]=newbook;
                    break;
                }}
                    break;
                
            case 2 :
                    
                    book.stock();
                    break;
            case 3 : 
                    System.out.println("\nthe available books in the library are\n ");
                    for(int i=0;i<books.length;i++){
                        if(books[i] != null){
                        System.out.println(books[i]);
        }
                    }
        }


    */
    }
}


