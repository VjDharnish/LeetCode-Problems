
public class quad_eqn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=-1,b=-8,c=2,r1,r2,real,img;
		double d= (b*b)-(4*a*c);
		if(d>0) {
			d=Math.sqrt(d);
			r1=(-b+d)/(2*a);
			r2 = (-b-d)/(2*a);
			System.out.format("x=%.2f,x=%.2f",r1,r2);
		}
		else if(d==0) {
			r2=r1=-b/(2*a);
			System.out.format("x=%.2f,x=%.2f",r1,r2);
		}
		else {
			
			real = -b/(2*a);
			img = (-d*0.5)/(2*a);
			System.out.format("x=%.2f+%.2f"+'i'+",x=%.2f-%.2f"+'i',real,img,real,img);
			
		}
		
		

	}

}
