package optionalExercise;
class Bank{
	void form() {
		System.out.println("details age_name_");
	}

void submitproof(String id ,String adress) {
	System.out.println("id="+id+"+adress="+adress);
}
String passbook() {
	return "passbook";
}
 String deposit(int amount) {
	 System.out.println("amount given="+amount);
	 return "deposit";
 }
}
public class Custamar_return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank sbi=new Bank();
		sbi.form();
		sbi.submitproof("pan:bar72364","aadhar:2200");
		System.out.println("Bank given"+sbi.passbook());
		System.out.println("Amount given"+sbi.deposit(220));

	}

}
