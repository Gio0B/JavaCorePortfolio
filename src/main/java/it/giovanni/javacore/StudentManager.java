package it.giovanni.javacore;

import java.util.ArrayList;

public class StudentManager {
	
	private ArrayList<String> students;
	
	public StudentManager() {
	    students = new ArrayList<>();
	}
	
	public void addStudent(String name) {
		if (name == null || name.isBlank() || students.contains(name)) {
			throw new IllegalArgumentException("Invalid or duplicate student name!");
		}
		students.add(name);
	}
	
	public void removeStudent(String name) {
		if (name == null || name.isBlank() || !students.contains(name)) {
			throw new IllegalArgumentException("Invalid student name or student not found!");
		}
		students.remove(name);
	}
	
	public boolean containsStudent(String name) {
	    if (name == null || name.isBlank()) {
	        throw new IllegalArgumentException("Student has to have a name!");
	    }

	    return students.contains(name);
	}
	
	public int getStudentCount() {
		return students.size();
	}
	
	public ArrayList<String> getAllStudents() {
	    return new ArrayList<>(students);
	}
}
