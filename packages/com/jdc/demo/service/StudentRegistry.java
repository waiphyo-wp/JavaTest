package com.jdc.demo.service;

import com.jdc.demo.dto.Student;
import com.jdc.demo.utils.IdGenerator;

public class StudentRegistry {
    private IdGenerator idGen;
    private Student[] array;

    public StudentRegistry() {
        idGen = new IdGenerator();
        array = new Student[0];
    }

    // add new student
    public Student addNew(Student s) {
        // id generate
        var id = idGen.generate();

        // set id to Student
        s.setId(id);

        // push into array
        pushToArray(s);

        // return student
        return s;
    }

    // get all student
    public Student[] getAll() {
        return array;
    }

    // find Student by id
    public Student findById(int id) {

        // equl id
        for (var s : array) {
            if (s.getId() == id) {
                return s;
            }
        }

        // not equal id
        return null;
    }

    private void pushToArray(Student s) {
        var copy = new Student[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }

        copy[copy.length -1] = s;

        array = copy;
    }
}
