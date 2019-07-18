package ����;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtil {
	//��ӡ�����Ϣ��������ĳ�Ա��������Ա����
		public static void printClassMethodMessage(Object obj) {
			Class c = obj.getClass();
			System.out.println("�������"+c.getName());
			Method[] ms = c.getMethods();
			for(int i=0;i<ms.length;i++) {
				//�õ���������ֵ���͵�������
				Class returnType = ms[i].getReturnType();
				System.out.println("����ֵ����:"+returnType.getName());
				//�õ�����������
				System.out.println("���������ƣ�"+ms[i].getName());
				//�õ������б��������
				Class[] paramTypes = ms[i].getParameterTypes();
				for(Class class1:paramTypes) {
					System.out.println(class1.getName()+",");
				}
			}
		}
		
		//��ȡ��Ա��������Ϣ
		public static void printClassFieldMessage(Object obj) {
			Class c= obj.getClass();
			Field[] fs = c.getDeclaredFields();
			for(Field field:fs) {
				//�õ���Ա���������͵�������
				Class fieldType = field.getType();
				String typeName = fieldType.getName();
				System.out.println("��Ա����������:"+typeName);
				//�õ���Ա����������
				String feildName = field.getName();
				System.out.println("��Ա����������:"+feildName);
			}
		}
		
		//��ȡ����Ĺ��캯������Ϣ
		public static void printClassConstructorMessage(Object obj) {
			Class c= obj.getClass();
			Constructor[] cs = c.getDeclaredConstructors();
			for(Constructor constructor:cs) {
				System.out.println("���췽�����ƣ�"+constructor.getName()+"(");
				Class[] paramTypes = constructor.getParameterTypes();
				for(Class class1:paramTypes) {
					System.out.print(class1.getName()+" ");
				}
				System.out.println(")");
			}
   }
}
