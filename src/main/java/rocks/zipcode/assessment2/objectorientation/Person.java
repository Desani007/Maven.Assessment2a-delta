package rocks.zipcode.assessment2.objectorientation;

import rocks.zipcode.assessment2.objectorientation.animals.Animal;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person    {
    Long id;
    String name;
    Address address;

    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
       this.address=address;
        this.id=id;
        this.name=name;
    }

    public Person() {
        this.id=Long.MIN_VALUE;
        this.name="";
        this.address= new Address();


    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id=id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address=address;
    }

    @Override
  public boolean equals(Object o) {
        boolean n;


            Person p = (Person) o;
    try {
        return p.name.equals(name) && p.address.equals(address) && p.id.equals(id) ? true:false;
    } catch (NullPointerException e){
        return true;


    }
 }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}