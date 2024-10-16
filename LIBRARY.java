
package library;

import java.util.Scanner;


public class LIBRARY {

     public void addstudents(){
        Scanner sc = new Scanner(System.in);
        CONFIG conf = new CONFIG();
        System.out.print("Enter Book Title: ");
        String btitle = sc.next();
        System.out.print("Enter Author: ");
        String auth = sc.next();
        System.out.print("Enter Standard book Number:");
        String  isbn = sc.next();
        System.out.print("Enter Availability: ");
        String avail = sc.next();
        System.out.print("Enter Published year: ");
        String publish = sc.next();

        String sql = "INSERT INTO tbl_library (l_book_title, l_author, l_isbn, l_availability, l_published_year) VALUES (?, ?, ?, ?, ?)";
        conf.addRecord(sql, btitle, auth ,isbn, avail, publish);
      }
      
      private void viewstudents(){
       String cqry = "SELECT * FROM tbl_library";
       String[] hrds = {"ID","btitle","auth","isbn","avail","publish"};
       String[]clmns = {"l_id","l_book_title","l_author","l_isbn","l_availability","l_published_year"};
       CONFIG conf = new CONFIG();
       conf.viewRecords(cqry, hrds, clmns );
      } 
      private void updatestudents(){
      Scanner sc = new Scanner(System.in);
         System.out.print("Enter Student id:");
         int id = sc.nextInt();
         
         System.out.println("Enter New Book Title::");
         String btitle = sc.next();
         System.out.println("Enter New Author:");
         String auth = sc.next();
         System.out.println("Enter New Standard book Number:");
         String isbn = sc.next();
         System.out.println("Enter New Availability::");
         String avail = sc.next();
         System.out.println("Enter new published year:");
         String publish = sc.next();
      
      String qry = "UPDATE tbl_birthingcenter SET l_book_title = ?,l_author = ?,l_isbn = ?, l_availability = ?, l_published_year = ? WHERE b_clientNumber = ?";
      CONFIG conf =  new CONFIG();
      conf.updateRecord(qry,id,btitle, auth, isbn, avail, publish );
      }
         private void deletestudents(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Id to delete:");
            int id = sc.nextInt();
            
           String sqlDelete = "DELETE FROM tbl_library WHERE l_id = ?";
           CONFIG conf = new CONFIG();
           conf.deleteRecord(sqlDelete, id);
      
      }
    
    public static void main(String[] args) {
       
         Scanner sc = new Scanner (System.in);
      String response;
      
      do{
          System.out.println("1. ADD");
          System.out.println("2. VIEW");
          System.out.println("3. UPDATE");
          System.out.println("4. DELETE");
          System.out.println("5. EXIT");
      
          System.out.println("Enter Action:");
          int action = sc.nextInt();
          LIBRARY Library = new LIBRARY();
          
      switch(action){
          
          case 1:
             
              Library.addstudents();
              
              
              break;
              
              
              
          case 2:
              
              Library.viewstudents();
              
              break;
              
              
          case 3:
              
               Library.viewstudents();
               Library. updatestudents();
              
              break;
              
              
              
          case 4:
              
              Library.viewstudents();
              Library.deletestudents();
              Library.viewstudents();

              break;
              
              
          case 5:
              
              System.out.println("Existing......");
              
              break; 
          default:
              System.out.println("Invalid action, Please try again.");
      }
      
          System.out.println("Do you want to continue? (yes/no):");
          response = sc.next();
     
      }while(response.equalsIgnoreCase("yes"));
        System.out.println("Thank You, See you soon!");
          
        
        
        
      }    
       
        
        
    }
    

