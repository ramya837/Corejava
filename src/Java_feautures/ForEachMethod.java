package Java_feautures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class PowerStation{
	     private String Powerstationname;
	     private int generatingpower;
	     public PowerStation(String Powerstaionname, int generatingpower) {
		this.Powerstationname=Powerstaionname;
		this.generatingpower=generatingpower;
	}
		
public String getPowerStationname() {
	return Powerstationname;
}
public void setPowerStationname(String PowerStationname) {
	this.Powerstationname=PowerStationname;
}
public int getgeneratingpower() {
	return generatingpower;
}
public void setgeneratingpower(int generatingpower) {
	this.generatingpower=generatingpower;
}
}
public class ForEachMethod{
public static void main(String args[])  {
	
List<PowerStation>Li=new ArrayList<PowerStation>();
Li.add(new PowerStation("biomassplant",2000));
Li.add(new PowerStation("nuclear",2220));
Li.add(new PowerStation("hydro",2222));
Li.add(new PowerStation("wind",2233));
List<PowerStation>p=Li.stream().filter(f->f.getPowerStationname()=="nuclear").collect(Collectors.toList());
p.forEach(f->System.out.println(f.getPowerStationname()+" "+f.getgeneratingpower()));
System.out.println("hfdtrhh");
}
}
