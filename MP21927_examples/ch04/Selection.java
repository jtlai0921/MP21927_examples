// 選擇排序法

public class Selection extends Object
{
	int data[]=new int[]{9,7,5,3,4,6};
	
	public static void main(String args[])
	{
		System.out.print("原始資料為：");
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
		for(int i=0;i<5;i++)    	    //掃描5次
		{   
                    smallest=data[i];
                    index=i;
			for(j=i+1;j<6;j++)  //由i+1比較起，比較5次
			{	
				if(smallest>data[j])  //找出最小元素
				{	
                                        smallest=data[j];
                                        index=j;
                                }
                        }
			temp=data[index];
			data[index]=data[i];
			data[i]=temp;	
			System.out.print("第"+(i+1)+"次排序結果：");
		        for (k=0;k<6;k++)
		        {
			     System.out.print(data[k]+" ");    //列印排序結果
		        }
		    System.out.print("\n");
	        }
	        System.out.print("\n");
	}
}
