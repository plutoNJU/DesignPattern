package cn.imavei;


/**
 * 
 * 
 * 1������ʽ���̲߳���ȫ
         �Ƿ� Lazy ��ʼ������
         �Ƿ���̰߳�ȫ����
         ʵ���Ѷȣ���

         ���������ַ�ʽ���������ʵ�ַ�ʽ������ʵ������������ǲ�֧�ֶ��̡߳�
         ��Ϊû�м��� synchronized�������ϸ��������������㵥��ģʽ��
        ���ַ�ʽ lazy loading �����ԣ���Ҫ���̰߳�ȫ���ڶ��̲߳�������������
 * @author mawei
 *
 */
public class Singleton1 
{
	private static Singleton1 instance;  
    private Singleton1 (){}  
  
    public static Singleton1 getInstance() 
    {  
    	if (instance == null) 
    	{  
    		instance = new Singleton1();  
    	}  
    	return instance;  
    }

	@Override
	public String toString()
	{
		return "Singleton1 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}  
	
}
