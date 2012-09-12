package org.sqlproc.sample.simple.model2;
  
import org.sqlproc.sample.simple.model.PhoneNumber;

public class Contact2 {
	
  public Contact2() {
  }
  
  public Contact2(String address) {
  setAddress(address);
  }
  
  private Long id;
    
  public Long getId() {
    return id;
  }
    
  public void setId(Long id) {
    this.id = id;
  }
  
  private Long personId;
    
  public Long getPersonId() {
    return personId;
  }
    
  public void setPersonId(Long personId) {
    this.personId = personId;
  }
  
  private String address;
    
  public String getAddress() {
    return address;
  }
    
  public void setAddress(String address) {
    this.address = address;
  }
  
  private PhoneNumber homePhone;
    
  public PhoneNumber getHomePhone() {
    return homePhone;
  }
    
  public void setHomePhone(PhoneNumber homePhone) {
    this.homePhone = homePhone;
  }
}
