package sampleprograms;
import java.util.*;
public class PatternRhombus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Number=sc.nextInt();
		int A='A';
		int C=1;
		for(int i=1;i<=Number*2-1;i=i+2)
		{
			for(int j=1;j<=C;)
			{
				System.out.print(A);
			}
			C=C+2;
			System.out.print("\n");
		}

	}

}
