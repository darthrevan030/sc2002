package part1;
import java.util.Objects;

public class SalePerson implements Comparable<SalePerson>
{
    private final String firstName;
    private final String lastName;
    private final int totalSales;
    
    // Constructor
    public SalePerson(String firstName, String lastName, int totalSales)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }
    
    // toString: returns "lastName, firstName : totalSales"
    @Override
    public String toString()
    {
        return lastName + ", " + firstName + " : " + totalSales;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
    
    // equals: checks if first and last names are the same
    @Override
    public boolean equals(Object other)
    {
        if (other instanceof SalePerson otherPerson)
        {
            return this.firstName.equals(otherPerson.firstName) &&
                   this.lastName.equals(otherPerson.lastName);
        }
        return false;
    }
    
    // compareTo: compares by totalSales (descending), then by lastName (ascending)
    @Override
    public int compareTo(SalePerson other)
    {
        // First compare by total sales (higher sales should come first)
        if (this.totalSales != other.totalSales)
        {
            return other.totalSales - this.totalSales; // Descending order
        }
        else
        {
            // If sales are equal, compare by last name (ascending alphabetical)
            return this.lastName.compareTo(other.lastName);
        }
    }
    
    // Getters (optional but good practice)
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getTotalSales() { return totalSales; }
}