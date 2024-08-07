package tablehibernate;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
//@Entity
//@Table(name = "purchaselist")
public class PurchaseList {
    private Students studentName;
    private Courses courseName;
    private int price;
    @Column(name = "subscription_date")
    private Date subscriptionDate;
}
