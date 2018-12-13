package Ferma;

public class Farm {
	

		
	    public static void main(String[] args) {
	    	Animal animal = new Animal();
	        Animal cat  = new Cat();
	        Animal dog = new Dog();
	        Animal sheep  = new Sheep();
	        Animal cow  = new Cow();
	        Animal chicken  = new Chicken();
	        
	        Animal[] animals = {sheep, cat, dog, chicken, dog, cat, sheep, cow, sheep, chicken, cat};
	        //Animal[] animals2 = {sheep, cat, dog, chicken, dog, cat, sheep, cow, sheep, chicken, cat};
	         
	        int catNum = 0;
	        int dogNum = 0;
	        int cowNum = 0;
	        int sheepNum = 0;
	        int chickenNum = 0;
	        	for(int i =0; i<animals.length; i++) {
	        		if(animals[i] instanceof Cat) {
	                catNum++;
	        		} else if (animals[i] instanceof Dog) {
	                dogNum++;
	        		} else if (animals[i] instanceof Cow) {
	                cowNum++;
	        		} else if (animals[i] instanceof Sheep) {
	                sheepNum++;
	        		} else if (animals[i] instanceof Chicken) {
	                chickenNum++;
	            }
	        }
	        System.out.println("Cats: "+catNum+" "+cat+". Dogs: "+dogNum+" "+dog+". Cows: "+ cowNum+" "+cow+". Sheep: "+sheepNum+" "+sheep+". Chicken: "+chickenNum +" "+ chicken+".");
	    }
	}


