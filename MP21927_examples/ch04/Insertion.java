// ���J�ƧǪk

import java.io.*;

public class Insertion extends Object
{
	int data[]=new int[6];
	int size=6;
	
	public static void main(String args[])
	{
		Insertion test=new Insertion();
		test.inputarr();
		System.out.print("�z��J����l�}�C�O�G");		
		test.showdata();
		test.insert();
	}

	void inputarr()
	{
		int i;
		for (i=0;i<size;i++)      //�Q�ΰj���J�}�C���
		{
			try{
				System.out.print("�п�J��"+(i+1)+"�Ӥ����G");
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				data[i]=Integer.parseInt(br.readLine());
			}catch(Exception e){}
		}
	}
	
	void showdata()
	{  
		int i;
		for (i=0;i<size;i++)
		{
			System.out.print(data[i]+" ");   //�C�L�}�C���
		}
		System.out.print("\n");
	}
	
	void insert()
	{  
		int i;     //i�����y����
		int j;     //�Hj�өw����������
		int tmp;   //tmp�ΨӼȦs���
		for (i=1;i<size;i++)  //���y�j�馸�Ƭ�SIZE-1
		{  
			tmp=data[i];
	j=i-1;
		while (j>=0 && tmp<data[j])  //�p�G�ĤG�����p��Ĥ@����
			{							
			  data[j+1]=data[j]; //�N��Ҧ�����������@�Ӧ�m
			  j--;
			}
			data[j+1]=tmp;       //�̤p���������Ĥ@�Ӥ���
			System.out.print("��"+i+"�����ˡG");
			showdata();
		}
	}
	
}