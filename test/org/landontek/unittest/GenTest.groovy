package org.landontek.unittest

import static org.junit.Assert.*;
import org.junit.*;
import org.landontek.person.Person

class GenTest{


    @Test
    void firstName()
    {
        def p = new Person("Test",null)
        p.setFirstName("Test")
        assertEquals(p.getFirstName(),"Test")
    }

    @Test
    void lastName()
    {
        def p = new Person(null,"User")
        p.setLastName("User")
        assertEquals(p.getLastName(),"User")
    }

    @Test
    void isClassSerializable()
    {
        assertTrue( new Person() instanceof java.io.Serializable)

    }


}

