package cn.imavei;



/**
 * 
 * 4��˫����/˫��У������DCL���� double-checked locking��
   JDK �汾��JDK1.5 ��
     �Ƿ� Lazy ��ʼ������
     �Ƿ���̰߳�ȫ����
     ʵ���Ѷȣ��ϸ���
      ���������ַ�ʽ����˫�����ƣ���ȫ���ڶ��߳�������ܱ��ָ����ܡ�
    getInstance() �����ܶ�Ӧ�ó���ܹؼ���
 * @author mawei
 *
 */
public class Singleton4 
{

	@Override
	public String toString() 
	{
		return "Singleton4 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	private volatile static Singleton4 singleton;  
    private Singleton4 (){}  
    public static Singleton4 getSingleton()
    {  
    	if (singleton == null) 
    	{  
    		synchronized (Singleton4.class) 
    		{  
    			if (singleton == null) 
    			{  
    				singleton = new Singleton4();  
    			}  
    		}  
    	}  
    	return singleton;  
    }  
}
