package org.landontek.person


class Person implements Serializable
{

    /** name of the person you are creating */
    private String firstName

    private String lastName

    String getLastName() {
        return lastName
    }

    void setLastName(String lastName) {
        this.lastName = lastName
    }

    String getFirstName() {
        return firstName
    }

    void setFirstName(String firstName) {
        this.firstName = firstName
    }

    /**
     * This is just a random class for testing groovy docs and groovy build with TDD
     */

    Person(String firstName, String lastName) {
        this.firstName = firstName
        this.lastName = lastName;
    }

    Person() {
    }
}