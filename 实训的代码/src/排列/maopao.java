package ееап;

public class maopao {

	public static void main(String[] args) {
		int[] a= {84,83,88,87,61};
		int m=0;
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				if(a[i]>a[j]) {
					m=a[i];
				a[i]=a[j];	
				a[j]=m;
						}
			}
			
		}
		for(int i=0;i<5;i++) {
			
		
		System.out.print(a[i]+"  ");
		}

	}

}
