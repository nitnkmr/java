package ArrayMatrix;

public class RotateMatrixAnticlockWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3},{1,7,4},{7,4,8}};
		int n=a.length;
		int m=a[0].length;
		for(int i=0;i<n;i++) {
		int j=0;
		int k=n-1;
		while(j<k) {
			int temp=a[i][j];
			a[i][j]=a[i][k];
			a[i][k]=temp;
		j++;
		k--;
		}
		}
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
