package test;

public class FindPair {

	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		int b[]= {6,7,8,9,10};
		int c[]= {10,11,12,13,14,15};
		int m =a.length;
		int n=b.length;
		int o=c.length;
		int x=3;
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				for(int k=0;k<o;k++)
					if(a[i]+b[j]-c[k]==x)
				
						System.out.println(a[i]+" "+b[j]+" "+c[k]);
	}

}
