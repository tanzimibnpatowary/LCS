package onetoten;

public class RotateImage {
	public void rotate(int[][] matrix) {
		int n= matrix.length;
        int i=0,j=0;
        
        while(i<=n/2 && j<=n/2){
            
            for(int c=i ; c< n-1-i ; c++){
                // we have 4 points to swap data starting with i,c
                int ax,ay,bx,by,cx,cy,dx,dy;
                int tmp;
                
                ax=i;               ay=c;
                bx=ay;              by=n-1-ax;
                cx=by;              cy=n-1-bx;
                dx=cy;              dy=n-1-cx;
                
                tmp = matrix[dx][dy];
                /*
                SWAP Strategy
                 tmp <- d
                 d <-c <- b <- a <-tmp
                
                */
                
                matrix[dx][dy] = matrix[cx][cy];
                matrix[cx][cy] = matrix[bx][by];
                matrix[bx][by] = matrix[ax][ay];
                matrix[ax][ay] = tmp;
            }
            i++;
            j++;
        }
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
