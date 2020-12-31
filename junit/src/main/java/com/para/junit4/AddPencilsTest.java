package com.para.junit4;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class AddPencilsTest {

    FirstDayAtSchool school = new FirstDayAtSchool();

    String[] bag = { "Books", "Notebooks", "Pens", "Pencils" };

    @Test
    public void testAddPencils() {

        System.out.println("Inside testAddPencils()");
        assertArrayEquals(bag, school.addPencils());

    }

}
