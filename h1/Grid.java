package h1;

public class Grid {
 private Cell[][] gridArray;
 public Cell[][] getGridArray(){
	 return gridArray;
 }
 
 public void setGridArray(Cell[][] gridArray) {
	 this.gridArray=gridArray;
 }
 
 public Grid(Cell[] cells, int gridRows, int gridCols) {
	 gridArray= new Cell[gridRows][gridCols];
	 for(int i=0; i< gridRows; i++) {
		 for (int j =0; i<gridCols; j++) {
			 gridArray[i][j] = new Cell(i,j);
		 }
	 }
for (Cell cell : cells) {
	int row =cell.getIndexRow();
	int col =cell.getIndexCol();
	if (row>=0 && row< gridRows && col>=0 && col< gridCols) {
		gridArray[row][col].setAlive(true);
	}
}
for (int i=0; i< gridRows; i++) {
	for (int j=0; j< gridCols; j++) {
		gridArray[i][j].countLivingNeighbors(gridArray);
		
	}
}
 }
 
 
}
