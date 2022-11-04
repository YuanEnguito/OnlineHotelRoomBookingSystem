package roomreservation;


public class SUniqueRoomID {
     private String rstatus;
    private int urid;
   
    SUniqueRoomID(int id, String status)
    {
        this.urid = id;
        this.rstatus = status;
    }
   
    public int geturid()
    {
        return urid;
    }
   
    public String getrstatus()
    {
        return rstatus;
    }
   
    public void setrstatus(String status)
    {
        this.rstatus = status;
    }
}
