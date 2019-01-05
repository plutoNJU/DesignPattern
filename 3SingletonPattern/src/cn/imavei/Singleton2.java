package cn.imavei;



/**
 * 
 * 2������ʽ���̰߳�ȫ
     �Ƿ� Lazy ��ʼ������
     �Ƿ���̰߳�ȫ����
     ʵ���Ѷȣ���

     ���������ַ�ʽ�߱��ܺõ� lazy loading���ܹ��ڶ��߳��кܺõĹ��������ǣ�Ч�ʺܵͣ�99% ����²���Ҫͬ����
     �ŵ㣺��һ�ε��òų�ʼ���������ڴ��˷ѡ�
     ȱ�㣺������� synchronized ���ܱ�֤��������������Ӱ��Ч�ʡ�
   getInstance() �����ܶ�Ӧ�ó����Ǻܹؼ����÷���ʹ�ò�̫Ƶ������
 * @author mawei
 *
 */
public class Singleton2 
{
	private static Singleton2 instance;  
    private Singleton2 (){}  
    public static synchronized Singleton2 getInstance()
    {  
    if (instance == null) 
    {  
        instance = new Singleton2();  
    }  
    	return instance;  
    }
    
	@Override
	public String toString() 
	{
		return "Singleton2 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}  

}
