// �ֳt�ƧǪk

import java.io.*;
import java.util.*;

public class Quick extends Object
{
	int process = 0;
	int size;
	int data[]=new int[100];
	
	public static void main(String args[])
	{
		Quick test = new Quick();
		
		System.out.print("�п�J�}�C�j�p(100�H�U)�G");
		try{			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			test.size=Integer.parseInt(br.readLine());
		}catch(Exception e){}		
		
		test.inputarr ();
		System.out.print("��l��ƬO�G");		
		test.showdata ();
		
		test.quick(test.data,test.size,0,test.size-1);
		System.out.print("\n�Ƨǵ��G�G");
		test.showdata();
	}	
	
	void inputarr()
	{
		//�H�üƿ�J
		Random rand=new Random();
		int i;
		for (i=0;i<size;i++)
			data[i]=(Math.abs(rand.nextInt(99)))+1;		
	}
	
	void showdata()
	{  
		int i;
		for (i=0;i<size;i++)
			System.out.print(data[i]+" ");		
		System.out.print("\n");
	}

	void quick(int d[],int size,int lf,int rg)
	{
		int i,j,tmp;		
		int lf_idx;
		int rg_idx;
		int t;
                                         //1:�Ĥ@����Ȭ�d[lf]
		if(lf<rg)
		{
			lf_idx=lf+1;
			rg_idx=rg;
			
			//�Ƨ�
			while(true)
			{			
				System.out.print("[�B�z�L�{"+(process++)+"]=> ");
				for(t=0;t<size;t++)
					System.out.print("["+d[t]+"] ");									
				
				System.out.print("\n");
			
				for(i=lf+1;i<=rg;i++)  //2:�ѥ��V�k��X�@����Ȥj��d[lf]��
				{		
					if(d[i]>=d[lf])
					{
						lf_idx=i;
						break;
					}
					lf_idx++;
				}
			
				for(j=rg;j>=lf+1;j--)   //3:�ѥk�V����X�@����Ȥp��d[lf]��
				{			
					if(d[j]<=d[lf]) 
					{
						rg_idx=j;
						break;
					}
					rg_idx--;
				}
			
				if(lf_idx<rg_idx)        //4-1:�Ylf_idx<rg_idx
				{								
					tmp = d[lf_idx];
					d[lf_idx] = d[rg_idx]; //�hd[lf_idx]�Md[rg_idx]����
					d[rg_idx] = tmp;       //�M���~��Ƨ�	
				}else{
					break;		       //�_�h���X�ƧǹL�{
				}
			}
			
			//��z
			if(lf_idx>=rg_idx)              //5-1:�Ylf_idx�j�󵥩�rg_idx
			{                               //�h�Nd[lf]�Md[rg_idx]����
				tmp = d[lf];
				d[lf] = d[rg_idx];
				d[rg_idx] = tmp;
				   //5-2:�åHrg_idx������I�������k��b
				quick(d,size,lf,rg_idx-1); //�H���j�覡���O�����k��b�i��Ƨ�
				quick(d,size,rg_idx+1,rg); //���ܧ����Ƨ�
			}
		}
	}
}