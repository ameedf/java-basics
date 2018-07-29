package com.ameed;

import java.util.Objects;

public class Course {
	private String id;
	private String name;
	private Language language;

	public Course(String id, String name, Language language) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, language);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Course)) {
			return false;
		}
		Course course = (Course) o;
		return Objects.equals(name, course.name) 
				&& Objects.equals(id, course.id)
				&& Objects.equals(language, course.language);
	}

}
