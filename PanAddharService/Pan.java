public class Pan{
    private String panNumber;
    private String addharnumber;
    private String BankDetails;
    private String name;
    private String investment;
     
    Pan(String panNumber,String addharNumber,String bankDetails,String name,String investment){
        this.panNumber=panNumber;
        this.addharnumber=addharNumber;
        this.BankDetails=bankDetails;
        this.name=name;
        this.investment=investment;
    }

    public String getpanName(){
        return name;
    }
    public void stname(String name){
        this.name=name;
    }
    public String getpanNumber(){
        return panNumber;
    }
    public void setpanNumber(String panNumber){
        this.panNumber=panNumber;
    }
    public String getaddharnumber(){
        return addharnumber;
    }
    public void setaddharnukmber(String addharnumber){
        this.addharnumber=addharnumber;
    }public String getdatails(){
        return BankDetails;
    }
    public void setdetails(String BankDetails){
        this.BankDetails=BankDetails;
    }
    public String getinvest(){
        return investment;
    }
    public void setinvest(String investment){
        this.investment=investment;
    }

    @Override
    public String toString(){
        return "pan{"+
            "panNumber="+panNumber + '\'' +
            "name="+name +'\'' +
            "bankdetails="+BankDetails +'\''+
            "investment="+investment +'\''+
            '}';
    }
    
}
