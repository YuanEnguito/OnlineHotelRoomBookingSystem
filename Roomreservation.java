package Roomreservation;
import java.util.*;

public class Roomreservation
{
     public static Scanner input = new Scanner (System.in).useDelimiter("\n");
    public static boolean stat;
    public static int attempt =0, contact, choice4;
    public static int choose2, choice3, choose5, choice7, choice8, choice9,choose1;
    public static String fname, mname, lname, gender, email, bmonth, nationality, username, password;
    public static int age, bdate, byear;
    public static String Address, munic, brgy;
    public static String roomnum;
    public static int price, Room, amount, change;
   
    public static List<RRusers> rruserList = new ArrayList<>();
    // duha ka hashset kay isa single room ang isa family room
    public static Set<SUniqueRoomID> surid = new HashSet<>();
    public static Set<FUniqueRoomID> furid = new HashSet<>();
   
    public static void CHOOSE()
    {
       
       stat = false;
        while(!stat)
        {
            try
            {
            int log;
           
           
            System.out.print("\n********************************************************\n");
            System.out.println("|  WELCOME TO OUR ONLINE HOTEL ROOM RESERVATION SYSTEM |"
                           + "\n|               '1' for CREATE ACCOUNT                 |"
                           + "\n|               '2' for LOG-IN ACCOUNT                 |"
                           + "\n********************************************************\n");
            System.out.print("TYPE # OF YOUR CHOICE: ");
            log = input.nextInt();
            
            if(log == 1)
            {
                System.out.print("********************************\n");
                RegisterAccount();
                stat = false;
            }
            else if(log == 2)
            {
                System.out.print("********************************\n");
                LogIn();
                stat = false;
                break;
            }
            else if(log !=1 && log != 2 && log != 3 && attempt == 3)
            {
                System.out.println("\t\t\t\t|                 MAXIMUM ATTEMPTS ATTEMPT # " + attempt + "       ⚠      |");
                System.out.println("\t\t\t\t|                                                              |");
                System.out.println("\t\t\t\t|           MAXIMUM ATTEMPTS THE PROGRAM WAS EXITED         |");
                System.out.println("\t\t\t\t|                                                              |");
                System.out.println("\t\t\t\t****************************************************************\n\n");
                System.exit(0);
            }
            else
            {
                System.out.print("INVALID! TRY AGAIN! ATTEMPT # " + attempt + "\n");
                System.out.print("________________________________\n");
                attempt++;
               
            }          
            }
            catch(Exception ex )
            {
                String str = input.next();
                System.out.println("               PRESS NUMBER ONLY ! PLEASE TRY AGAIN !            ");
                System.out.println();
            }
        }
       
    }
   
    private static void RegisterAccount()
    {
        System.out.print("\n________________________________");
        System.out.print("\n________________________________\n\n");
        System.out.print("\n********************************\n");
        System.out.print("|       REGISTRATION FORM      |");
        System.out.print("\n********************************\n");
       
       
        System.out.print("First Name        : ");
        fname = input.next();
           
        System.out.print("Middle Name       : ");
        mname = input.next();
           
        System.out.print("Last Name         : ");
        lname = input.next();
       
        System.out.print("Email             : ");
        email = input.next();
        address();
    }
   
    public static void address()
    {
        while(!stat)
        {
            try
            {
               System.out.println("                    _______________________________");
        System.out.println("ADDRESS           :|          PROVINCES            |");
        System.out.println("                   |1.MISAMIS ORIENTAL             |");
        System.out.println("                   |_______________________________|\n");
        System.out.print("PROVINCE #        : ");
        choose2 = input.nextInt();
            switch(choose2)
            {
                case 1:
                    Address = "MIS.OR";
                    System.out.println("PROVINCE ADDRESS  : " + Address);
                    address.AddressMain();
                    gender();
                    break;
                default:
                 System.out.println("NOT IN CHOICES!!! INPUT CORRECTLY :)");
                 break;
            }
            }
            catch(Exception ex)
            {
               String str = input.next();
                System.out.println("              PRESS NUMBER ONLY ! PLEASE TRY AGAIN !            ");
                System.out.println();
            }
        }
       
    }
    public static void gender()
    {
        while(!stat)
        {
            try
            {
        System.out.println("Gender  1. Male"
                     + "\n        2. Female ");
        System.out.print("\nChoose: ");
        choose1 = input.nextInt();
                switch (choose1) {
                    case 1:
                        gender = "MALE";
                        System.out.println("GENDER            : " + gender);
                         age();
                        break;
                    case 2:
                        gender = "FEMALE";
                        System.out.println("GENDER            : " + gender);
                         age();
                        break;
                    default:
                        System.out.println("NOT IN CHOICES!!! INPUT CORRECTLY:)");
                        break;
                }
            }
            catch(Exception ex)
            {
               String str = input.next();
                System.out.println("               PRESS NUMBER ONLY ! PLEASE TRY AGAIN !            ");
                System.out.println();
            }
        }  
       
    }

    public static void age()
    {
        while(!stat)
        {
        try
        {
        System.out.print("Age               : ");
        age = input.nextInt();
        if (age < 18)
        {
            System.out.println("AGE RESTRICTIONS! NEED CONSENT/GUIDANCE FROM PARENTS");
            System.exit(0);
        }
        birthmonth();
        }
        catch(Exception ex)
        {
         String str = input.next();
                System.out.println("               PRESS NUMBER ONLY ! PLEASE TRY AGAIN !            ");
                System.out.println();
        }
       
        }
       
    }
       
    public static void birthmonth()
    {
        while(!stat)
        {
            try
            {
                System.out.println("                    ______________________________");
        System.out.println("BIRTH MONTH       :             MONTH             ");
        System.out.println("                    1.JANUARY                     ");
        System.out.println("                    2.FEBRUARY                    ");
        System.out.println("                    3.MARCH                       ");
        System.out.println("                    4.APRIL                       ");
        System.out.println("                    5.MAY                         ");
        System.out.println("                    6.JUNE                        ");
        System.out.println("                    7.JULY                        ");
        System.out.println("                    8.AUGUST                      ");
        System.out.println("                    9.SEPTEMBER                   ");
        System.out.println("                   10.OCTOBER                     ");
        System.out.println("                   11.NOVEMBER                    ");
        System.out.println("                   12.DECEMBER                    ");
        System.out.println("                   _______________________________\n");
        System.out.print("MONTH # CHOOSE    : ");
        choice3 = input.nextInt();
         switch(choice3)
        {
            case 1:
                bmonth = "JANUARY";
                System.out.println("BIRTH MONTH       : " + bmonth);
                  bdate();
                break;
            case 2:
                bmonth = "FEBRUARY";
                System.out.println("BIRTH MONTH       : " + bmonth);
                  bdate();
                break;
            case 3:
                bmonth = "MARCH";
                System.out.println("BIRTH MONTH       : " + bmonth);
                  bdate();
                break;
            case 4:
                bmonth = "APRIL";
                System.out.println("BIRTH MONTH       : " + bmonth);
                  bdate();
                break;
            case 5:
                bmonth = "MAY";
                System.out.println("BIRTH MONTH       : " + bmonth);
                  bdate();
                break;
            case 6:
                bmonth = "JUNE";
                System.out.println("BIRTH MONTH       : " + bmonth);
                  bdate();
                break;
            case 7:
                bmonth = "JULY";
                System.out.println("BIRTH MONTH       : " + bmonth);
                  bdate();
                break;
            case 8:
                bmonth = "AUGUST";
                System.out.println("BIRTH MONTH       : " + bmonth);
                  bdate();
                break;
            case 9:
                bmonth = "SEPTEMBER";
                System.out.println("BIRTH MONTH       : " + bmonth);
                  bdate();
                break;
            case 10:
                bmonth = "OCTOBER";
                System.out.println("BIRTH MONTH       : " + bmonth);
                  bdate();
                break;
            case 11:
                bmonth = "NOVEMBER";
                System.out.println("BIRTH MONTH       : " + bmonth);
                  bdate();
                break;
            case 12:
                bmonth = "DECEMBER";
                System.out.println("BIRTH MONTH       : " + bmonth);
                  bdate();
                break;
            default:
                System.out.println("NOT IN CHOICES! INPUT CORRECTLY");
         }
            }
            catch(Exception ex)
            {
                String str = input.next();
                System.out.println("              PRESS NUMBER ONLY ! PLEASE TRY AGAIN !            ");
                System.out.println();
            }
           
        }
     
    }
   
    public static void bdate()
    {
        while(!stat)
        {
            try
            {
                System.out.print("Birth Date        : ");
                bdate = input.nextInt();
                birthyear();  
            }
            catch(Exception ex)
            {
                String str = input.next();
                System.out.println("               PRESS NUMBER ONLY ! PLEASE TRY AGAIN !            ");
                System.out.println();
            }
             
        }
       
    }
   
    public static void birthyear()
    {
        while(!stat)
        {
            try
            {
                System.out.print("Birth Year        : ");
                byear = input.nextInt();
                contact();
            }
            catch(Exception ex)
            {
                String str = input.next();
                System.out.println("                NUMBER ONLY ! PLEASE TRY AGAIN !            ");
                System.out.println();
            }
           
        }
       
    }    
   
    public static void contact()
    {
        while(!stat)
        {
            try
            {
                System.out.println("NOTICE ! EXAMPLE  : +639*********💡");
                  System.out.print("CONTACT NUMBER    : +639");
                contact = input.nextInt();
                national();
            }
            catch(Exception ex)
            {
                String str = input.next();
                System.out.println("                NUMBER ONLY ! PLEASE TRY AGAIN !            ");
                System.out.println();
            }
           
        }
       
    }
   
    public static void national()
    {
        while(!stat)
        {
            try
            {
               System.out.println("NATIONALITY       :        NATIONALITY LIST       ");
        System.out.println("                    1.FILIPINO                    ");
        System.out.println("                    2.JAPANESE                    ");
        System.out.println("                    3.INDONESIAN                  ");
        System.out.println("                    4.RUSSIAN                     ");
        System.out.println("                    5.CHINESE                     ");
        System.out.println("                   _______________________________\n");
        System.out.print("NATIONALITY       : ");
        choose5 = input.nextInt();
         switch(choose5)
        {
            case 1:
                nationality = "FILIPINO";
                System.out.println("NATIONALITY       : " + nationality);
                CreateAccount();
                break;
            case 2:
                nationality = "JAPANESE";
                System.out.println("NATIONALITY      : " + nationality);
                CreateAccount();
                break;
            case 3:
                nationality = "INDONESIAN";
                System.out.println("NATIONALITY       : " + nationality);
                CreateAccount();
                break;
            case 4:
                nationality = "RUSSIAN";
                System.out.println("NATIONALITY       : " + nationality);
                CreateAccount();
                break;
            case 5:
                nationality = "CHINESE";
                System.out.println("NATIONALITY       : " + nationality);
                CreateAccount();
                break;
            default:
                System.out.println("\t\t\t\t\t\t|NOT IN CHOICES! INPUT CORRECTLY");
            }
            }
            catch(Exception ex)
            {
                String str = input.next();
                System.out.println("              PRESS NUMBER ONLY ! PLEASE TRY AGAIN !            ");
                System.out.println();
            }
        }        
       
    }
   
    private static void CreateAccount()
    {
       
            System.out.print("\n________________________________");
            System.out.print("\n________________________________\n\n");
            System.out.print("\n********************************\n");
            System.out.print("|CREATE USERNAME & PIN PASSWORD|");
            System.out.print("\n********************************\n");
            System.out.print("Create Username   : ");
            username = input.next();
       
            System.out.print("Create Password   : ");
            password = input.next();
       
            System.out.print("................................\n");
            System.out.print("  ACCOUNT CREATED SUCCESSFULLY  ");
            System.out.print("\n********************************\n");
            System.out.print("\n________________________________");
            System.out.print("\n________________________________\n\n");
           
            //KANI KAY NA DUGANG GI USAB NAKO ANG ARRAYLIST OG HASHSET
            RRusers nrrusers = new RRusers(fname, mname, lname, Address, gender, age, email, bmonth, bdate, byear, contact, nationality, username, password);
            rruserList.add(nrrusers);
            CHOOSE();
    }
   
    public static void LogIn()
    {
        stat = false;
        
        while(attempt < 4)
        {
            System.out.print("\n________________________________");
            System.out.print("\n________________________________\n\n");
            System.out.print("\n********************************\n");
            System.out.print("|            LOG IN            |");
            System.out.print("\n********************************\n");
           
            System.out.print("Username : ");
            username = input.next();
           
            System.out.print("Password : ");
            password = input.next();
            //mao ning mga users gi check niya if naa ba sa arraylist
            for(RRusers crruser: rruserList)
            {
                if(crruser.getusern().equals(username) && crruser.getpassw().equals(password))
                        {
                            System.out.print("\nWelcome to Hotel Room Reservation\n\n");
                            roomchoice();
                            stat = false;
                        }
                else if(!crruser.getusern().equals(username) || !crruser.getpassw().equals(password))
            {
                attempt+=1;
                    System.out.print("ERROR!  " + attempt);
                    
            System.out.print("\n********************************\n");
            if(attempt == 3)
            {
                System.out.print("THIRD ATTEMPT! ERROR  ");
            System.exit(0);
            }
                }
               
                
            }
            
        }
            
    }
   
    public static void roomchoice()
    {
       
        while(!stat)
        {
            
                String pick;          
        System.out.print("\n********************************************************\n");
        System.out.print("|               CHOOSE WHAT TYPE OF ROOM              |"
                           + "\n|'1' SINGLE ROOM - 1 bed, 1 occupant                  |"
                           + "\n|'2' FAMILY ROOM - 3 beds (1 double and 1 single)     |"
                           + "\n|'3' BACK                                             |"
                           + "\n********************************************************\n"
                           + "TYPE # OF YOUR CHOICE: ");
        pick = input.next();
           
        if(pick.equals("1"))
        {
            Single();  
           
            
               
                stat = false;
            }
            else if(pick.equals("2"))
            {
                Family();
           
                stat = false;
            }
            else if(pick.equals("3"))
            {
                CHOOSE();
            }
            else
            {
                System.out.print("INVALID! TRY AGAIN!ATTEMPT\n");
               
            }

        }    
    }
   
    private static void Family()
    {
        while(!stat)
        {
            try
            {
                            
        
        //haha kamo ra bahala arrange pero dapat inana na siya tagsa2 for loop
        System.out.print("********************************\n");          
        System.out.println("ROOMS             :|          CHOOSE ROOM          |");
        for(FUniqueRoomID curoom: furid)
        {
            if(curoom.geturid() == 1)
            {
                System.out.println("                   |1.ROOM 01           "+ curoom.getrstatus() + "  |");
            }
        }
        for(FUniqueRoomID curoom: furid)
        {
            if(curoom.geturid() == 2)
            {
                System.out.println("                   |2.ROOM 02           "+ curoom.getrstatus() + "  |");
            }
        }
        for(FUniqueRoomID curoom: furid)
        {
            if(curoom.geturid() == 3)
            {
                System.out.println("                   |3.ROOM 03           "+ curoom.getrstatus() + "  |");
            }
        }
        for(FUniqueRoomID curoom: furid)
        {
            if(curoom.geturid() == 4)
            {
                System.out.println("                   |4.ROOM 04           "+ curoom.getrstatus() + "  |");
            }
        }
        for(FUniqueRoomID curoom: furid)
        {
            if(curoom.geturid() == 5)
            {
                System.out.println("                   |5.ROOM 05           "+ curoom.getrstatus() + "  |");
            }
        }
        System.out.println("                   |6.BACK                         |");
        System.out.print("CHOICE #        : ");
        Room = input.nextInt();
        //tanawon niyag ang room kay na reserved naba or wala
        for(FUniqueRoomID curoom: furid)
          {
               if(curoom.geturid() == Room && curoom.getrstatus().equals("Reserved"))
              {
                  System.out.println("\nROOM TAKEN");
                  System.out.print("_______________________________\n\n");
                  roomchoice();
              }  
          }
            switch(Room)
            {
                case 1:
                    roomnum = "ROOM 06";
                    System.out.println("ROOM NUMBER  : " + roomnum);
                    System.out.println("FEATURES : AIR CONDITIONED"
                              +   "\n           2 COMFORT ROOM"
                              +   "\n           48-inch TV"
                              +   "\n           1 REFRIGERATOR"
                              +   "\n           3 beds (1 double and 1 single) ");
                    price = 5000;
                    System.out.print("Price: " + price);
                    System.out.println();
                     System.out.println("DO YOU WANT TO RESERVE THIS ROOM? \n1. YES \n2. NO ");
                System.out.print("ENTER CHOICE: ");
                choice9 = input.nextInt();
           
            if(choice9 == 1)
            {
              calcu();
              System.out.println("SUCCESSFULLY RESERVED THE ROOM");
               for(FUniqueRoomID curoom: furid)
                  {
                      if(curoom.geturid() == Room)
                      {
                          String status = "Reserved";
                          curoom.setrstatus(status);
                      }
                  }
              System.out.println();
              System.out.println("DO YOU WANT TO RESERVE ANOTHER ROOM? \n1. YES \n2. NO ");
              System.out.print("ENTER CHOICE: ");
              choice8 = input.nextInt();
              if (choice8 == 1)
              {
                  roomchoice();
                 
              }
              else if(choice8 == 2)
              {
                  System.out.print("THANK YOU FOR STAYING!!!");
                  System.exit(0);
              }
            }
               
                stat = false;
               
                    break;  
                   
                case 2:
                    roomnum = "ROOM 07";
                    System.out.println("ROOM NUMBER  : " + roomnum);
                   System.out.println("FEATURES : AIR CONDITIONED"
                              +   "\n           2 COMFORT ROOM"
                              +   "\n           48-inch TV"
                              +   "\n           1 REFRIGERATOR"
                              +   "\n           3 beds (1 double and 1 single) ");
                    price = 5000;
                    System.out.print("Price: " + price);
                    System.out.println();
                     System.out.println("DO YOU WANT TO RESERVE THIS ROOM? \n1. YES \n2. NO ");
                System.out.print("ENTER CHOICE: ");
                choice9 = input.nextInt();
           
            if(choice9 == 1)
            {
              calcu();
              System.out.println("SUCCESSFULLY RESERVED THE ROOM");
               for(FUniqueRoomID curoom: furid)
                  {
                      if(curoom.geturid() == Room)
                      {
                          String status = "Reserved";
                          curoom.setrstatus(status);
                      }
                  }
              System.out.println();
              System.out.println("DO YOU WANT TO RESERVE ANOTHER ROOM? \n1. YES \n2. NO ");
              System.out.print("ENTER CHOICE: ");
              choice8 = input.nextInt();
              if (choice8 == 1)
              {
                  roomchoice();
                 
              }
              else if(choice8 == 2)
              {
                  System.out.print("THANK YOU FOR STAYING!!!");
                  System.exit(0);
              }
            }
               
                stat = false;
               
                    break;
                   
                case 3:
                    roomnum = "ROOM 08";
                    System.out.println("ROOM NUMBER  : " + roomnum);
                    System.out.println("FEATURES : AIR CONDITIONED"
                              +   "\n           2 COMFORT ROOM"
                              +   "\n           48-inch TV"
                              +   "\n           1 REFRIGERATOR"
                              +   "\n           3 beds (1 double and 1 single) ");
                    price = 5000;
                    System.out.print("Price: " + price);
                    System.out.println();
                     System.out.println("DO YOU WANT TO RESERVE THIS ROOM? \n1. YES \n2. NO ");
                System.out.print("ENTER CHOICE: ");
                choice9 = input.nextInt();
           
            if(choice9 == 1)
            {
              calcu();
              System.out.println("SUCCESSFULLY RESERVED THE ROOM");
               for(FUniqueRoomID curoom: furid)
                  {
                      if(curoom.geturid() == Room)
                      {
                          String status = "Reserved";
                          curoom.setrstatus(status);
                      }
                  }
              System.out.println();
              System.out.println("DO YOU WANT TO RESERVE ANOTHER ROOM? \n1. YES \n2. NO ");
              System.out.print("ENTER CHOICE: ");
              choice8 = input.nextInt();
              if (choice8 == 1)
              {
                  roomchoice();
                 
              }
              else if(choice8 == 2)
              {
                  System.out.print("THANK YOU FOR STAYING!!!");
                  System.exit(0);
              }
            }
               
                stat = false;
               
                    break;
                   
                case 4:
                    roomnum = "ROOM 09";
                    System.out.println("ROOM NUMBER  : " + roomnum);
                    System.out.println("FEATURES : AIR CONDITIONED"
                              +   "\n           2 COMFORT ROOM"
                              +   "\n           48-inch TV"
                              +   "\n           1 REFRIGERATOR"
                              +   "\n           3 beds (1 double and 1 single) ");
                    price = 5000;
                    System.out.print("Price: " + price);
                    System.out.println();
                     System.out.println("DO YOU WANT TO RESERVE THIS ROOM? \n1. YES \n2. NO ");
                System.out.print("ENTER CHOICE: ");
                choice9 = input.nextInt();
           
            if(choice9 == 1)
            {
              calcu();
              System.out.println("SUCCESSFULLY RESERVED THE ROOM");
               for(FUniqueRoomID curoom: furid)
                  {
                      if(curoom.geturid() == Room)
                      {
                          String status = "Reserved";
                          curoom.setrstatus(status);
                      }
                  }
              System.out.println();
              System.out.println("DO YOU WANT TO RESERVE ANOTHER ROOM? \n1. YES \n2. NO ");
              System.out.print("ENTER CHOICE: ");
              choice8 = input.nextInt();
              if (choice8 == 1)
              {
                  roomchoice();
                 
              }
              else if(choice8 == 2)
              {
                  System.out.print("THANK YOU FOR STAYING!!!");
                  System.exit(0);
              }
            }
               
                stat = false;
               
                    break;
                   
                case 5:
                    roomnum = "ROOM 1o";
                    System.out.println("ROOM NUMBER  : " + roomnum);
                    System.out.println("FEATURES : AIR CONDITIONED"
                              +   "\n           2 COMFORT ROOM"
                              +   "\n           48-inch TV"
                              +   "\n           1 REFRIGERATOR"
                              +   "\n           3 beds (1 double and 1 single) ");
                    price = 5000;
                    System.out.print("Price: " + price);
                    System.out.println();
                     System.out.println("DO YOU WANT TO RESERVE THIS ROOM? \n1. YES \n2. NO ");
                System.out.print("ENTER CHOICE: ");
                choice9 = input.nextInt();
           
            if(choice9 == 1)
            {
              calcu();
              System.out.println("SUCCESSFULLY RESERVED THE ROOM");
               for(FUniqueRoomID curoom: furid)
                  {
                      if(curoom.geturid() == Room)
                      {
                          String status = "Reserved";
                          curoom.setrstatus(status);
                      }
                  }
              System.out.println();
              System.out.println("DO YOU WANT TO RESERVE ANOTHER ROOM? \n1. YES \n2. NO ");
              System.out.print("ENTER CHOICE: ");
              choice8 = input.nextInt();
              if (choice8 == 1)
              {
                  roomchoice();
                 
              }
              else if(choice8 == 2)
              {
                  System.out.print("THANK YOU FOR STAYING!!!");
                  System.exit(0);
              }
            }
                 
                case 6:
                    roomchoice();
                
                default:
                   System.out.print("NOT IN CHOICES PLEASE TRY AGAIN");
            }
            }
            catch(Exception ex)
                    {
                         String str = input.next();
                System.out.println("              PRESS NUMBER ONLY ! PLEASE TRY AGAIN !            ");
                System.out.println();
                    }
        }
    }
   
    private static void Single()
    {
       while(!stat)
       {
           try
           {
        System.out.print("********************************\n");
        System.out.println("ROOMS             :|          CHOOSE ROOM          |");
        for(SUniqueRoomID curoom: surid)
        {
            if(curoom.geturid() == 1)
            {
                System.out.println("                   |1.ROOM 01           "+ curoom.getrstatus() + "  |");
            }
        }
        for(SUniqueRoomID curoom: surid)
        {
            if(curoom.geturid() == 2)
            {
                System.out.println("                   |2.ROOM 02           "+ curoom.getrstatus() + "  |");
            }
        }
        for(SUniqueRoomID curoom: surid)
        {
            if(curoom.geturid() == 3)
            {
                System.out.println("                   |3.ROOM 03           "+ curoom.getrstatus() + "  |");
            }
        }
        for(SUniqueRoomID curoom: surid)
        {
            if(curoom.geturid() == 4)
            {
                System.out.println("                   |4.ROOM 04           "+ curoom.getrstatus() + "  |");
            }
        }
        for(SUniqueRoomID curoom: surid)
        {
            if(curoom.geturid() == 5)
            {
                System.out.println("                   |5.ROOM 05           "+ curoom.getrstatus() + "  |");
            }
        }
        System.out.println("                   |6.BACK                         |");
        System.out.println("                   |_______________________________|\n");
        System.out.print("CHOICE #        : ");
        Room = input.nextInt();
        for(SUniqueRoomID curoom: surid)
          {
               if(curoom.geturid() == Room && curoom.getrstatus().equals("Reserved"))
              {
                  System.out.println("\nROOM TAKEN");
                  System.out.print("_______________________________\n\n");
                  roomchoice();
              }  
          }
          switch(Room)
          {
                case 1:
                   
                    roomnum = "ROOM 01";
                    System.out.println("ROOM NUMBER  : " + roomnum);
                    System.out.println("FEATURES : AIR CONDITIONED"
                              +   "\n           1 COMFORT ROOM"
                              +   "\n           32-inch TV ");
                    price = 1500;
                    System.out.println("Price: " + price);
                    System.out.println();
                    System.out.println("DO YOU WANT TO RESERVE THIS ROOM? \n1. YES \n2. NO ");
            System.out.print("ENTER CHOICE: ");
            choice7 = input.nextInt();
           
            if(choice7 == 1)
            {
              calcu();
              //dinhi tong function nga ma reserved/taken ang room
              System.out.println("SUCCESSFULLY RESERVED THE ROOM");
              for(SUniqueRoomID curoom: surid)
                  {
                      if(curoom.geturid() == Room)
                      {
                          String status = "Reserved";
                          curoom.setrstatus(status);
                      }
                  }
                System.out.println("DO YOU WANT TO RESERVE ANOTHER ROOM? \n1. YES \n2. NO ");
                System.out.print("ENTER CHOICE: ");
                choice7 = input.nextInt();
              if (choice7 == 1)
              {
                   roomchoice();
              }
              else
              {
                  System.out.print("THANK YOU FOR STAYING!!!");
                  System.exit(0);
              }
             
            }
                    break;  
                   
                case 2:
                    roomnum = "ROOM 02";
                    System.out.println("ROOM NUMBER  : " + roomnum);
                    System.out.println("FEATURES : AIR CONDITIONED"
                              +   "\n           1 COMFORT ROOM"
                              +   "\n           32-inch TV ");
                    price = 1500;
                    System.out.println("Price: " + price);
                    System.out.println();
                    System.out.println("DO YOU WANT TO RESERVE THIS ROOM? \n1. YES \n2. NO ");
            System.out.print("ENTER CHOICE: ");
            choice7 = input.nextInt();
           
            if(choice7 == 1)
            {
              calcu();
              //dinhi tong function nga ma reserved/taken ang room
              System.out.println("SUCCESSFULLY RESERVED THE ROOM");
              for(SUniqueRoomID curoom: surid)
                  {
                      if(curoom.geturid() == Room)
                      {
                          String status = "Reserved";
                          curoom.setrstatus(status);
                      }
                  }
                System.out.println("DO YOU WANT TO RESERVE ANOTHER ROOM? \n1. YES \n2. NO ");
                System.out.print("ENTER CHOICE: ");
                choice7 = input.nextInt();
              if (choice7 == 1)
              {
                   roomchoice();
              }
              else
              {
                  System.out.print("THANK YOU FOR STAYING!!!");
                  System.exit(0);
              }
             
            }
                    break;
                   
                case 3:
                    roomnum = "ROOM 03";
                    System.out.println("ROOM NUMBER  : " + roomnum);
                    System.out.println("FEATURES : AIR CONDITIONED"
                              +   "\n           1 COMFORT ROOM"
                              +   "\n           32-inch TV ");
                    price = 1500;
                    System.out.println("Price: " + price);
                    System.out.println();
                    System.out.println("DO YOU WANT TO RESERVE THIS ROOM? \n1. YES \n2. NO ");
            System.out.print("ENTER CHOICE: ");
            choice7 = input.nextInt();
           
            if(choice7 == 1)
            {
              calcu();
              //dinhi tong function nga ma reserved/taken ang room
              System.out.println("SUCCESSFULLY RESERVED THE ROOM");
              for(SUniqueRoomID curoom: surid)
                  {
                      if(curoom.geturid() == Room)
                      {
                          String status = "Reserved";
                          curoom.setrstatus(status);
                      }
                  }
                System.out.println("DO YOU WANT TO RESERVE ANOTHER ROOM? \n1. YES \n2. NO ");
                System.out.print("ENTER CHOICE: ");
                choice7 = input.nextInt();
              if (choice7 == 1)
              {
                   roomchoice();
              }
              else
              {
                  System.out.print("THANK YOU FOR STAYING!!!");
                  System.exit(0);
              }
             
            }
                    break;
                   
                case 4:
                    roomnum = "ROOM 04";
                    System.out.println("ROOM NUMBER  : " + roomnum);
                    System.out.println("FEATURES : AIR CONDITIONED"
                              +   "\n           1 COMFORT ROOM"
                              +   "\n           32-inch TV ");
                    price = 1500;
                    System.out.println("Price: " + price);
                    System.out.println();
                    System.out.println("DO YOU WANT TO RESERVE THIS ROOM? \n1. YES \n2. NO ");
            System.out.print("ENTER CHOICE: ");
            choice7 = input.nextInt();
           
            if(choice7 == 1)
            {
              calcu();
              //dinhi tong function nga ma reserved/taken ang room
              System.out.println("SUCCESSFULLY RESERVED THE ROOM");
              for(SUniqueRoomID curoom: surid)
                  {
                      if(curoom.geturid() == Room)
                      {
                          String status = "Reserved";
                          curoom.setrstatus(status);
                      }
                  }
                System.out.println("DO YOU WANT TO RESERVE ANOTHER ROOM? \n1. YES \n2. NO ");
                System.out.print("ENTER CHOICE: ");
                choice7 = input.nextInt();
              if (choice7 == 1)
              {
                   roomchoice();
              }
              else
              {
                  System.out.print("THANK YOU FOR STAYING!!!");
                  System.exit(0);
              }
             
            }
                    break;
                   
                case 5:
                    roomnum = "ROOM 05";
                    System.out.println("ROOM NUMBER  : " + roomnum);
                    System.out.println("FEATURES : AIR CONDITIONED"
                              +   "\n           1 COMFORT ROOM"
                              +   "\n           32-inch TV ");
                    price = 1500;
                    System.out.println("Price: " + price);
                    System.out.println();
                    System.out.println("DO YOU WANT TO RESERVE THIS ROOM? \n1. YES \n2. NO ");
            System.out.print("ENTER CHOICE: ");
            choice7 = input.nextInt();
           
            if(choice7 == 1)
            {
              calcu();
              //dinhi tong function nga ma reserved/taken ang room
              System.out.println("SUCCESSFULLY RESERVED THE ROOM");
              for(SUniqueRoomID curoom: surid)
                  {
                      if(curoom.geturid() == Room)
                      {
                          String status = "Reserved";
                          curoom.setrstatus(status);
                      }
                  }
                System.out.println("DO YOU WANT TO RESERVE ANOTHER ROOM? \n1. YES \n2. NO ");
                System.out.print("ENTER CHOICE: ");
                choice7 = input.nextInt();
              if (choice7 == 1)
              {
                   roomchoice();
              }
              else
              {
                  System.out.print("THANK YOU FOR STAYING!!!");
                  System.exit(0);
              }
             
            }
                    break;  
               
                case 6:
                    roomchoice();
                    
                default:
                   System.out.print("NOT IN CHOICES PLEASE TRY AGAIN");
            } 
           }
           catch(Exception ex)
           {
                String str = input.next();
                System.out.println("              PRESS NUMBER ONLY ! PLEASE TRY AGAIN !            ");
                System.out.println();
           }
       }
    }
   
    private static void calcu()
    {
        System.out.println();
        System.out.print("Enter amount to pay: ");
        amount = input.nextInt();
       
        //pwede rani walaon gi try ra nakog add
        if(amount < price)
        {
            System.out.print("Kulang kag kwarta");
            roomchoice();
        }
       
        change = amount - price;
       
        System.out.println("Change: " + change);
        System.out.println();
        System.out.println();
    }        
   
    public static void ExisitngRoom()
    {
        //kibali existing room na para ma ilhan og availbale ba ang room or taken/reserved
        SUniqueRoomID sroom1 = new SUniqueRoomID(1, "Available");
        SUniqueRoomID sroom2 = new SUniqueRoomID(2, "Available");
        SUniqueRoomID sroom3 = new SUniqueRoomID(3, "Available");
        SUniqueRoomID sroom4 = new SUniqueRoomID(4, "Available");
        SUniqueRoomID sroom5 = new SUniqueRoomID(5, "Available");
        surid.add(sroom1);
        surid.add(sroom2);
        surid.add(sroom3);
        surid.add(sroom4);
        surid.add(sroom5);
       
        FUniqueRoomID froom1 = new FUniqueRoomID(1, "Available");
        FUniqueRoomID froom2 = new FUniqueRoomID(2, "Available");
        FUniqueRoomID froom3 = new FUniqueRoomID(3, "Available");
        FUniqueRoomID froom4 = new FUniqueRoomID(4, "Available");
        FUniqueRoomID froom5 = new FUniqueRoomID(5, "Available");
        furid.add(froom1);
        furid.add(froom2);
        furid.add(froom3);
        furid.add(froom4);
        furid.add(froom5);
    }
   
    public static void main(String[] args)
    {
        ExisitngRoom();
        CHOOSE();
    }
   
}
