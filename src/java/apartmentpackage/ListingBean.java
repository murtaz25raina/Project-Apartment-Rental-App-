package apartmentpackage;

public class ListingBean {
String ImgLink;
String ApId;
String UserEmail;
String State;
String Address;
String Bedrooms;
String RequestedBy;
String RequestStatus;
ListingBean(String Img,String id,String email,String stat,String add,String bed,String req,String reqby)
{
    this.ImgLink=Img;
    this.ApId=id;
    this.UserEmail=email;
    this.State=stat;
    this.Address=add;
    this.Bedrooms=bed;
    this.RequestStatus=req;
    this.RequestedBy=reqby;
}

    public String getRequestedBy() {
        return RequestedBy;
    }

    public void setRequestedBy(String RequestedBy) {
        this.RequestedBy = RequestedBy;
    }

    public String getRequestStatus() {
        return RequestStatus;
    }

    public void setRequestStatus(String RequestStatus) {
        this.RequestStatus = RequestStatus;
    }

    public String getImgLink() {
        return ImgLink;
    }

    public void setImgLink(String ImgLink) {
        this.ImgLink = ImgLink;
    }

    public String getApId() {
        return ApId;
    }

    public void setApId(String ApId) {
        this.ApId = ApId;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String UserEmail) {
        this.UserEmail = UserEmail;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getBedrooms() {
        return Bedrooms;
    }

    public void setBedrooms(String Bedrooms) {
        this.Bedrooms = Bedrooms;
    }

}
