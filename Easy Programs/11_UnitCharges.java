// An electricity board charges the following rates for the use of electricity: For the first 200 units
// 80 paisa per unit, For the next 100 units 90 paisa per unit and beyond 300 units Rs 1.00 per unit.
// All users are charged minimum of Rs.100 as meter charge. If the total amount is more than Rs.
// 300 then an additional surcharge of 12.36% of total amount is charged. W.A.P. to read the
// number of units consumed and print out the bill amount.

import java.util.*;
public class UnitCharges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Units: ");
        double unit = sc.nextDouble();

        double bill = 0;
        if(unit > 300){
            bill = (((unit - 300) * 1) + (100 * 0.9) +  (200 * 0.8));
        }else if(unit > 200 && unit <= 300){
            bill = ((unit - 200) * 0.9) + 160;
        }else{
            bill = unit * 0.8;
        }

        if(bill > 300){
            bill = bill + ((bill * 12.36) / 100);
        }
        System.out.print("Bill: " + bill);
    }
}
