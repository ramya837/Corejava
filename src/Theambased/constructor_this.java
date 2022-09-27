package Theambased;
class Transformer{
	String type;
	int range;
	float rating;
	
	
	Transformer(String type,int range,float rating){
		this.type=type;
		this.range=range;
		this.rating=rating;
		
		
	}
	void details() {
		System.out.println(" transformer type="+type);
		System.out.println("transformer range="+range);
		System.out.println("transformer rating="+rating);
		
	}
	
	
}

public class constructor_this {

	public static void main(String[] args) {
		Transformer T=new Transformer( "stepup" , 1200, 1.2f);
                    T.details();
	}

}
