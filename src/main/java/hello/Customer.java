package hello;

import java.util.Date;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;


public class Customer {

    @Id
    public String id;

    public String firstName;
    public String lastName;
    
    @CreatedBy
    private String createUser;

    @CreatedDate
    private Date createdDate;
    
    @LastModifiedBy
    private String lastModifiedUser;
    
    @LastModifiedDate
    private Date updateDttm;
    
    public Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", createUser="
				+ createUser + ", createdDate=" + createdDate + ", lastModifiedUser=" + lastModifiedUser + "]";
	}
}

