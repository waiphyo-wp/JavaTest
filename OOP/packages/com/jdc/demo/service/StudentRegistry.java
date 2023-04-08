package com.jdc.demo.service;

import com.jdc.demo.utils.IdGenerator;
import com.jdc.demo.dto.Student;

public class StudentRegistry {

	private IdGenerator idGen;
	private Student [] array;

	private static final StudentRegistry INSTANCE = new StudentRegistry();

	public static StudentRegistry getInstance() {
		return INSTANCE;
	}

	private StudentRegistry() {
		idGen = new IdGenerator();
		array = new Student[0];
	}

	public Student addNew(Student s) {
		// Generate ID
		var id = idGen.generate();

		// Set id to student
		s.setId(id);

		// push into array
		pushToArray(s);

		// return student
		return s;
	}

	public Student[] getAll() {
		return array;
	}

	public Student findById(int id) {

		for(var s : array) {
			if(s.getId() == id) {
				return s;
			}
		}

		return null;
	}

	private void pushToArray(Student s) {

		var copy = new Student[array.length + 1];

		for(var i = 0; i < array.length; i ++) {
			copy[i] = array[i];
		}
		copy[copy.length - 1] = s;

		array = copy;
	}
}