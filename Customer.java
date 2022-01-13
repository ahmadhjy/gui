public class Customer {
    private String CfirstName;
    private String CsurName;
    private String Cid;
    private String Caddress;
    private String Cphone;
    private String Cemail;

    public Customer(){}


    public void setCustomerFirstName(String CfirstName){
        this.CfirstName=CfirstName;
    }
    public String getCfirstName(){
        return CfirstName;
    }

    public void setCustomerSurName(String CsurtName){
      this.CsurName=CsurtName;
    }
    public String getCsurName(){
        return CsurName;
    }

    public void setCid(String Cid){
        this.Cid=Cid;
    }
    public String getCid(){
        return Cid;
    }

    public void setCaddress(String Caddress){
        this.Caddress=Caddress;
    }
    public String getCaddress(){
        return Caddress;
    }

    public void setCphone(String Cphone){
        this.Cphone=Cphone;
    }
    public String getCphone() {
        return Cphone;
    }

    public void setCemail(String Cemail){
        this.Cemail=Cemail;
    }
    public String getCemail() {
        return Cemail;
    }

}
