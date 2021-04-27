

public class Fruits {
	
	String name, color, taste, torn, countryOfOrigin;
	
	public Fruits(String name) {
		
		this.name = name;
	    
		System.out.println("Fruit constructor is invoked");
	  }
}

class Main {
	
	public static void main(String[] args) {
		
		
		new Durian("Durian","Green on the outside", "Sweet","Yes","Malaysia");
		System.out.println();
		
		new Mango("Mango", "Yellow Or Green", "Sour","NO","India");
		System.out.println();
		
		System.out.println("-----------Green Apple and Red Apple----------");
		System.out.println();
	
		
		new RedApple("Red Apple", "Red","Sour", "NO","Peru");
		System.out.println();
		
		new GreenApple("Green Apple", "Green", "Sour","NO", "Australia");
		System.out.println();
	}
}

class Mango extends Fruits{

	public Mango(String name, String color, String taste, String torn, String countryOfOrigin) {
	
		super (name);
		this.color = color;
		this.taste = taste;
		this.torn = torn;
		this.countryOfOrigin = countryOfOrigin;
	
		System.out.println(this.name + " constructor is invoked");
	    System.out.println(this.name + " color is "+ this.color);
	    System.out.println(this.name + " taste is "+ this.taste);
	    System.out.println(this.name + " torn " + this.torn);
	    System.out.println(this.name + " Country of Origin " + this.countryOfOrigin);
  }
}

class Durian extends Fruits{
	
	public Durian(String name, String color, String taste, String torn, String countryOfOrigin) {
		
		super (name);
		this.color = color;
		this.taste = taste;
		this.torn = torn;
		this.countryOfOrigin = countryOfOrigin;
			
		System.out.println(this.name + " constructor is invoked");
		System.out.println(this.name + " color is "+ this.color);
		System.out.println(this.name + " taste is "+ this.taste);
		System.out.println(this.name + " torn " + this.torn);
		System.out.println(this.name + " Country of Origin " + this.countryOfOrigin);
	  }
}



class Apple extends Fruits{
	
	public Apple(String name,String taste, String torn,String countryOfOrigin, String color) {
		
		super (name);
		
		System.out.println("Apple constructor is invoked");

	  }
}



class RedApple extends Apple{
	
	public RedApple(String name, String color,String taste, String torn, String countryOfOrigin) {
		
		super (name ,torn ,taste ,color, countryOfOrigin);
		this.color = color;
		this.taste = taste;
		this.torn = torn;
		this.countryOfOrigin = countryOfOrigin;
		
		System.out.println(this.name + " constructor is invoked");
		System.out.println("Color is " + this.color);
	    System.out.println(this.name + " taste is "+ this.taste);
	    System.out.println(this.name + " torn " + this.torn);
	    System.out.println(this.name + " Country of Origin " + this.countryOfOrigin);
	}
}



class GreenApple extends Apple{
	
	public GreenApple(String name, String color,String taste, String torn, String countryOfOrigin) {
		
		super (name, torn,taste, color ,countryOfOrigin);
		this.color = color;
		this.taste = taste;
		this.torn = torn;
		this.countryOfOrigin = countryOfOrigin;
		
		System.out.println(this.name + " constructor is invoked");
		System.out.println("Color is " + this.color);
	    System.out.println(this.name + " taste is "+ this.taste);
	    System.out.println(this.name + " torn " + this.torn);
	    System.out.println(this.name + " Country of Origin " + this.countryOfOrigin);
	}
}