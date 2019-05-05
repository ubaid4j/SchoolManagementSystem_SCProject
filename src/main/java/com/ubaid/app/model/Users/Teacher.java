package com.ubaid.app.model.Users;

public class Teacher extends User
{
	private String speciality;
	private String courses;
	
	public static class Builder {
		private String name;
		private String password;
		private String age;
		private String gender;
		private String email;
		private String speciality;
		private String courses;


		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder password(String password) {
			this.password = password;
			return this;
		}

		public Builder age(String age) {
			this.age = age;
			return this;
		}

		public Builder gender(String gender) {
			this.gender = gender;
			return this;
		}

		public Builder email(String email) {
			this.email = email;
			return this;
		}

		public Builder speciality(String speciality) {
			this.speciality = speciality;
			return this;
		}

		public Builder courses(String courses) {
			this.courses = courses;
			return this;
		}

		
		public User build() {
			Teacher user = new Teacher();
			user.name = name;
			user.password = password;
			user.age = age;
			user.gender = gender;
			user.email = email;
			user.setCourses(courses);
			user.setSpeciality(speciality);
			return user;
		}
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	
	
}
