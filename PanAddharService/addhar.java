public class addhar {
    private String addharnumber;
    private String UserName;
    private String FatherName;
    private String address;
    

    public addhar(String addharnumber, String UserName,String FatherName,String address){
        this.addharnumber=addharnumber;
        this.UserName=UserName;
        this.FatherName=FatherName;
        this.address=address;
    }

    public String getAddharnumber(){
        return addharnumber;
    }
    public void setName(String addharnumber){
        this.addharnumber=addharnumber;
    }
    public String getUserName(){
        return UserName;
    }
    public void setUserName(String UserName){
        this.UserName=UserName;
    }
    public String getfatherName(){
        return FatherName;
    }
    public void setFatherName(String FatherName){
        this.FatherName=FatherName;
    }
    public String getaddress(){
        return address;
    }
    public void setaddress(String address){
        this.address=address;  
    }

    @Override
    public String toString(){
        return "addhar{"+
            "addharnumber ="+addharnumber + '\'' +
            "name ="+UserName + '\'' +
            "FatherName ="+FatherName + '\'' +
            "address ="+address +'\'' +
            '}';
    }
}
    

