/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */

/**NO constructor
* Getters have return value
* setters have no return value
* properties are determined using private fields
* values are behaviors are determined through setters
* toString will convert the entire animal class with properties and behaviors
*/

//POJO: Plain old java object access the getters/setters for Animal class
public class Animal {

	/**
	 * 
	 */
	
	// Defining variables
	
	private String animal_name;
	private String animal_specie;
	private int animal_height;
	private int animal_weight;
	
	// get method for animal name
	public String getAnimal_name() {
		return animal_name;
	}

	// setting the animal name
	public void setAnimal_name(String animal_name) {
		this.animal_name = animal_name;
	}
	
	// get method for animal specie
	public String getAnimal_specie() {
		return animal_specie;
	}

	
	// set method animal specie
	public void setAnimal_specie(String animal_specie) {
		this.animal_specie = animal_specie;
	}

	// get method for animal height
	public int getAnimal_height() {
		return animal_height;
	}
	
	//setting the animal height
	public void setAnimal_height(int animal_height) {
		this.animal_height = animal_height;
	}

	// get method for animal weight
	public int getAnimal_weight() {
		return animal_weight;
	}

	// setting the animal weight
	public void setAnimal_weight(int animal_weight) {
		this.animal_weight = animal_weight;
	}

	/**
	 * @param args
	 */
	
	public String toString() {
        return "Animal [name=" + animal_name + ", speice=" + animal_specie +  ", height=" + animal_height + 
        		", weight="+ animal_weight +"]";
	}
	
}
