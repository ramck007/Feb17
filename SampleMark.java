import java.util.*;
import java.util.Scanner;
class Mark{
	Scanner sc= new Scanner(System.in);
	public int[] rl() {
		int r[]=new int[2];
		for(int i=0;i<2;i++) {
			r[i]=sc.nextInt();
		}
		return r;
		}
		public String[] sName() {
			String[] s=new String[2];
			for(int i=0;i<=2;i++) {
				s[i]=sc.nextLine();
			}
			return s;
	}
		/*public int[] mk() {
			int m[]=new int[2];
			for(int i=0;i<2;i++) {
				m[i]=sc.nextInt();
			}
			return m;
			}*/
	
}
public class SampleMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mark mark=new Mark();
		int a[]=new int[2];
		String b[]=new String[5];
		int c[]=new int[2];
		a=mark.rl();
		b=mark.sName();
	//	c=mark.mk();
	for(int i=0;i<2;i++) {
		System.out.print(a[i]+" "+b[i]);//+" "+c[i]);
		System.out.println("");
		
	}

	}

}
