package com.example.rito.groupapp;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;
import java.util.HashMap;
/**
 * Subject class is used to unload firebase data using firebase ui adapter
 * to process. Holds the same structure as firebase nodes under SUBJECT.
 *
 * @author   Gobii, Rito, Yuhao
 * @since    2018-07-08
 */
@IgnoreExtraProperties //only maps fields during serialization
public class Subject implements Serializable {
	private String subject_code;
	private String subject_description;
	private String term_code;

	public Subject(){
	}

	public Subject(String term_code, String subject_code, String subject_description){
		this.subject_code = subject_code;
		this.subject_description = subject_description;
		this.term_code = term_code;
	}

	public String getSubject_code(){
		return this.subject_code;
	}
	public String getSubject_description(){
		return this.subject_description;
	}
	public String getTerm_code(){
		return this.term_code;
	}

	public void setSubject_code(String subject_code){
		this.subject_code = subject_code;
	}
	public void setSubject_description(String subject_description){
		this.subject_description = subject_description;
	}
	public void setTerm_code(String term_code){
		this.term_code = term_code;
	}

	public boolean equals(Subject s){
		if (s == null){
			return false;
		} else if (
				this.term_code.equals(s.getTerm_code())
				&& this.subject_code.equals(s.getSubject_code())
		){
			return true;
		}
		return false;
	}

	@Override
	public String toString(){

		return String.format("%s (%s)", this.subject_description, this.subject_code);
	}

	@Exclude //ignores method from javadocs
	public HashMap<String, Object> toMap() {
		HashMap<String, Object> result = new HashMap<>();
		result.put("subject_code", this.subject_code);
		result.put("subject_description", this.subject_description);
		result.put("term_code", this.term_code);
		return result;
	}
}