package roomreservation;


public class address extends Roomreservation
{
    public static void AddressMain()
    {
        Municipal();
    }
    public static void Municipal()
    {
        while(!stat)
        {
            try
            {
       
    System.out.println("                    _______________________________");
        System.out.println("ADDRESS           :|MIS.OR MUNICIPALITY/CITY LIST |");
        System.out.println("                   | 1.LAGUINDINGAN                |");
        System.out.println("                   | 2.EL SALVADOR                 |");
        System.out.println("                   | 3.TAGOLOAN                    |");
        System.out.println("                   | 4.OPOL                        |");
        System.out.println("                   | 5.CAGAYAN DE ORO CITY         |");
        System.out.println("                   |_______________________________|\n");
        System.out.print("MUNICIPALITY #    : ");
        choice3 = input.nextInt();
         switch(choice3)
        {
            case 1:
                munic = "LAGUINDINGAN";
                System.out.println("MUNICIPALITY      : " + munic);
                LAGUINDINGAN();
                break;
            case 2:
                munic = "EL SALVADOR";
                System.out.println("MUNICIPALITY      : " + munic);
                ELSALVADOR();
                break;
            case 3:
                munic = "TAGOLOAN";
                System.out.println("MUNICIPALITY      : " + munic);
                TAGOLOAN();
                break;
            case 4:
                munic = "OPOL";
                System.out.println("MUNICIPALITY      : " + munic);
                OPOL();
                break;
            case 5:
                munic = "CAGAYAN DE ORO CITY";
                System.out.println("MUNICIPALITY      : " + munic);
                CDO();
                break;
             default:
                 System.out.println("NOT IN CHOICES!!! INPUT CORRECTLY :)");
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
   
    private static void LAGUINDINGAN()
    {
        while(!stat)
        {
            try
            {
        System.out.println("***********************************");
        System.out.println("LAGUINDINGAN BARANGAY LIST");
        System.out.println("***********************************");
        System.out.println("1.  AROMAHON");
        System.out.println("2.  GASI");
        System.out.println("3.  KIBAGHOT (SAN ISIDRO)");
        System.out.println("4.  LAPAD");
        System.out.println("5.  LIBERTY");
        System.out.println("6.  MAUSWAGON ");
        System.out.println("7.  MOOG ");
        System.out.println("8.  POBLACION ");
        System.out.println("9.  SAMBULAWAN ");
        System.out.println("10. SANAI ");
        System.out.println();
        System.out.print("BARANGAY #          : ");
        choice4 = input.nextInt();
         switch(choice4)
        {
            case 1:
                brgy = "AROMAHON";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 2:
                brgy = "GASI";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 3:
                brgy = "KIBAGHOT (SAN ISIDRO)";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 4:
                brgy = "LAPAD";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 5:
                brgy = "LIBERTY";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 6:
                brgy = "MAUSWAGON";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 7:
                brgy = "MOOG";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 8:
                brgy = "POBLACION";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 9:
                brgy = "SAMBULAWAN";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 10:
                brgy = "SANAI";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
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
                System.out.println("               PRESS NUMBER ONLY ! PLEASE TRY AGAIN !            ");
                System.out.println();
            }
    }
 }
    private static void ELSALVADOR()
    {
        while(!stat)
        {
            try
            {
        System.out.println("***********************************");
        System.out.println("EL SALVADOR BARANGAY LIST");
        System.out.println("***********************************");
        System.out.println("1.  AMOROS");
        System.out.println("2.  BOLISONG");
        System.out.println("3.  COGON");
        System.out.println("4.  HIMAYA");
        System.out.println("5.  HINIGDAAN ");
        System.out.println("6.  KALABAYLABAY ");
        System.out.println("7.  LOLUGAN ");
        System.out.println("8.  PEDRO S. BACULIO (BOLO-BOLO) ");
        System.out.println("9.  POBLACION ");
        System.out.println("10. QUIBONBON ");
        System.out.println();
        System.out.print("BARANGAY #          : ");
        choice4 = input.nextInt();
        switch(choice4)
        {
            case 1:
                brgy = "AMOROS";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 2:
                brgy = "BOLISONG";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 3:
                brgy = "COGON";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 4:
                brgy = "HIMAYA";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 5:
                brgy = "HINIGDAAN";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 6:
                brgy = "KALABAYLABAY";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 7:
                brgy = "LOLUGAN";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 8:
                brgy = "PEDRO S. BACULIO (BOLO-BOLO) ";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 9:
                brgy = "POBLACION";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 10:
                brgy = "QUIBONBON";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
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
                System.out.println("               PRESS NUMBER ONLY ! PLEASE TRY AGAIN !            ");
                System.out.println();
            }
        }
    }
        private static void TAGOLOAN()
    {
        while(!stat)
        {
            try
            {
        System.out.println("***********************************");
        System.out.println("TAGOLOAN BARANGAY LIST");
        System.out.println("***********************************");
        System.out.println("1.  BALUARTE");
        System.out.println("2.  CASINGLOT");
        System.out.println("3.  GRACIA");
        System.out.println("4.  MOHON");
        System.out.println("5.  NATUMOLAN");
        System.out.println("6.  POBLACION ");
        System.out.println("7.  ROSARIO ");
        System.out.println("8.  SANTA ANA ");
        System.out.println("9.  SANTA CRUZ ");
        System.out.println("10. SUGBONGCOGON ");
        System.out.println("");
        System.out.print("BARANGAY #  : ");
        choice4 = input.nextInt();
        switch(choice4)
        {
            case 1:
                brgy = "BALUARTE";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 2:
                brgy = "CASINGLOT";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 3:
                brgy = "GRACIA";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 4:
                brgy = "MOHON";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 5:
                brgy = "NATUMOLAN";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 6:
                brgy = "POBLACION";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 7:
                brgy = "ROSARIO";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 8:
                brgy = "SANTA ANA";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 9:
                brgy = "SANTA CRUZ";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 10:
                brgy = "SUGBONGCOGON";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
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
                System.out.println("               PRESS NUMBER ONLY ! PLEASE TRY AGAIN !            ");
                System.out.println();
            }
        }
    }
       
        private static void OPOL()
    {
        while(!stat)
        {
            try
            {
        System.out.println("***********************************");
        System.out.println("OPOL BARANGAY LIST");
        System.out.println("***********************************");
        System.out.println("1.  AWANG");
        System.out.println("2.  BAGOCBOC");
        System.out.println("3.  BARRA");
        System.out.println("4.  BONBON");
        System.out.println("5.  CAUYONAN");
        System.out.println("6.  IGPIT ");
        System.out.println("7.  LIMONDA ");
        System.out.println("8.  LUYONG BONBON ");
        System.out.println("9.  MALANANG ");
        System.out.println("10. NANGCAON ");
        System.out.println();
        System.out.print("BARANGAY #  : ");
        choice4 = input.nextInt();
        switch(choice4)
        {
            case 1:
                brgy = "AWANG";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 2:
                brgy = "BAGOCBOC";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 3:
                brgy = "BARRA";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 4:
                brgy = "BONBON";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 5:
                brgy = "CAUYONAN";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 6:
                brgy = "IGPIT";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 7:
                brgy = "LIMONDA";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 8:
                brgy = "LUYONG BONBON";
               
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 9:
                brgy = "MALANANG";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 10:
                brgy = "NANGCAON";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
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
                System.out.println("               PRESS NUMBER ONLY ! PLEASE TRY AGAIN !            ");
                System.out.println();
            }
        }
    }
       
            private static void CDO()
    {
        while(!stat)
        {
            try
            {
        System.out.println("***********************************");
        System.out.println("CAGAYAN DE ORO CITY BARANGAY LIST");
        System.out.println("***********************************");
        System.out.println("1.  AGUSAN");
        System.out.println("2.  BAIKINGON");
        System.out.println("3.  BALUBAL");
        System.out.println("4.  BALULANG");
        System.out.println("5.  BARANGAY 1");
        System.out.println("6.  BARANGAY 2");
        System.out.println("7.  BARANGAY 3");
        System.out.println("8.  BARANGAY 4");
        System.out.println("9.  BARANGAY 5");
        System.out.println("10. BARANGAY 6");
        System.out.println();
        System.out.print("BARANGAY #          : ");
        choice4 = input.nextInt();
        switch(choice4)
        {
            case 1:
                brgy = "AGUSAN";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 2:
                brgy = "BAIKINGON";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 3:
                brgy = "BALUBAL";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 4:
                brgy = "BALULANG";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 5:
                brgy = "BARANGAY 1";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 6:
                brgy = "BARANGAY 2";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 7:
                brgy = "BARANGAY 3";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 8:
                brgy = "BARANGAY 4";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 9:
                brgy = "BARANGAY 5";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
                gender();
                break;
            case 10:
                brgy = "BARANGAY 6";
                System.out.println("BARANGAY ADDRESS  : " + brgy);
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
                System.out.println("               PRESS NUMBER ONLY ! PLEASE TRY AGAIN !            ");
                System.out.println();
            }

        }
    }
           
   

}
