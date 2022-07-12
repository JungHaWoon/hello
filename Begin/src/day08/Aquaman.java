package day08;
//double speed
public class Aquaman extends Human{
	double speed;
	
	public Aquaman() {
		this("수중인간",160,789.12);
	}
	public Aquaman(String n,int h,double s) {
		this.name = n;
		this.height = h;
		this.speed = s;
	}
	//getInfo()메소드를 오버라이드 해보세요
	public String getInfo() {
		return super.getInfo()+"\n초능력 : "+speed; 
	}
}
