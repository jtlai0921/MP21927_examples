// ��ܱƧǪk

public class Selection extends Object
{
	int data[]=new int[]{9,7,5,3,4,6};
	
	public static void main(String args[])
	{
		System.out.print("��l��Ƭ��G");
		Selection test=new Selection();		
		test.showdata ();
		test.select ();
	}
	
	void showdata ()
	{
		for (int i=0;i<6;i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.print("\n");
	}
	
	void select ()
	{
		int smallest,temp,j,k,index;
		for(int i=0;i<5;i++)    	    //���y5��
		{   
                    smallest=data[i];
                    index=i;
			for(j=i+1;j<6;j++)  //��i+1����_�A���5��
			{	
				if(smallest>data[j])  //��X�̤p����
				{	
                                        smallest=data[j];
                                        index=j;
                                }
                        }
			temp=data[index];
			data[index]=data[i];
			data[i]=temp;	
			System.out.print("��"+(i+1)+"���Ƨǵ��G�G");
		        for (k=0;k<6;k++)
		        {
			     System.out.print(data[k]+" ");    //�C�L�Ƨǵ��G
		        }
		    System.out.print("\n");
	        }
	        System.out.print("\n");
	}
}
