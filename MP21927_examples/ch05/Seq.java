// �`�Ƿj�M�k

import java.io.*;
public    class Seq
{
public static void main(String args[]) throws IOException
   {  
	String strM;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	int data[] =new int[100];
	int i,j,find,val=0;
	for (i=0;i<80;i++)
		data[i]=(((int)(Math.random()*150))%150+1);
	while (val!=-1)
	{  
		find=0;
		System.out.print("�п�J�j�M���(1-150)�A��J-1���}�G");
		strM=keyin.readLine();
		val=Integer.parseInt(strM);
		for (i=0;i<80;i++)
		{  
			if(data[i]==val)
			{  
				System.out.print("�b��"+(i+1)+"�Ӧ�m������ ["+data[i]+"]\n");
				find++;
			}
		}
		if(find==0 && val !=-1)
			System.out.print("######�S����� ["+val+"]######\n");
	}
	System.out.print("��Ƥ��e�G\n");
	for(i=0;i<10;i++)
	{ 
		for(j=0;j<8;j++)
			System.out.print(i*8+j+1+"["+data[i*8+j]+"]  ");
		System.out.print("\n");
	}
   }
}