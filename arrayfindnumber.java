package comp;

public class arrayfindnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[7];
		for(int i=0; i<a.length;i++)
		{
			one_num:
				while(true)
				{
					a[i]=(int)(Math.random()*10)+1;
					
					for(int j=0; j<i;j++)
					{
						if( a[i]==a[j]) continue one_num;
					}
					break;
				}
		}
		for(int num : a)
			System.out.print(num+" ");
		System.out.println();
	}

}
