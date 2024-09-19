public class Computer
{
    private String hersteller;
    private boolean laptop;
    private int preis;
    
    public void setHersteller(String neuHersteller)
    {
        hersteller = neuHersteller;
    }
    
    public void setLaptop(boolean neuLaptop)
    {
        laptop = neuLaptop;
    }    
    
    public void setPreis(int neuPreis)
    {
        preis = neuPreis;
    }    
    
    public String getHersteller()
    {
        return hersteller;
    }
    
    public boolean getLaptop()
    {
        return laptop;
    }    

    public int getPreis()
    {
        return preis;
    }
}