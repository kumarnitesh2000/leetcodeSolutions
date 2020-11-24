public class DfsIsland {

    public static void dfsprocess(char[][]grid,int x,int y,int row,int col){


        if(x<0 || y<0 || x>=row || y>=col || grid[x][y]!='1')
        return;

        grid[x][y]=2;
        dfsprocess(grid, x+1, y,row,col);
        dfsprocess(grid, x, y+1,row,col);
        dfsprocess(grid, x-1, y,row,col);
        dfsprocess(grid, x, y-1,row,col);


    }

    public static int numIslands(char[][] grid) {
        int totisland = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){

                if(grid[i][j]=='1'){
                    totisland+=1;
                    dfsprocess(grid,i,j,grid.length,grid[0].length);
                    
                }

            }

        }
        return totisland;    
    }
    public static void main(String[] args) {
        char[][] grid = {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'}, {'0','0','0','1','1'}};
        System.out.println(numIslands(grid));
    }
}
