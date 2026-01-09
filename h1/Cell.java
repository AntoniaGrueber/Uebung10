package h1;

public class Cell {
private int indexRow;
private int indexCol;
private boolean alive;
private int numLivingNeighbors;
private boolean isAliveNextGen;

public Cell (int indexRow, int indexCol, boolean alive) {
	this.indexRow = indexRow;
	this.indexCol = indexCol;
	this.alive= alive;
			}
public Cell (int indexRow, int indexCol) {
	this.indexRow=indexRow;
	this.indexCol=indexCol;
}

public int getIndexRow() {
	return indexRow;
}

public int getIndexCol() {
	return indexCol;}

public int getnumLivingNeighbors() {
	return numLivingNeighbors;}


public boolean getAlive() {
	return alive;}


public boolean getAliveNextGen() {
	return isAliveNextGen;}

public void setIndexRow(int indexRow) {
	this.indexRow=indexRow;}

public void setIndexCol(int indexCol) {
	this.indexCol=indexCol;

}
public void setAliveNextGen(boolean isAliveNextGen) {
	this.isAliveNextGen=isAliveNextGen;
}

public void setAlive (boolean alive) {
	this.alive=alive;
}

public void setNumLivingNeighbors(int numLivingNeighbors) {
	this.numLivingNeighbors=numLivingNeighbors;
}

private void decideNextStatus() {
	if (alive) {
		if (numLivingNeighbors<2 || numLivingNeighbors> 3) {
			isAliveNextGen=false;
		} else {
			isAliveNextGen=true;
		}
	}else {
		if (numLivingNeighbors ==3) {
			isAliveNextGen=true;
		} else {
			isAliveNextGen=false;
		}
	}	
}

public void countLivingNeighbors(Cell [] [] gridArray) {
	numLivingNeighbors=0;
	int numRows =gridArray.length;
	int numCols =gridArray[0].length;
	
	for (int row = indexRow-1; row <= indexRow +1; row++) {
		for (int col= indexCol-1; col<= indexCol +1; col++) {
			if (row >= 0 && row <numRows && col>=0 && col< numCols && !(row==indexRow && col == indexCol)) {
				if (gridArray[row][col].getAlive()) {
					numLivingNeighbors++;
				}
			}
		}
	}decideNextStatus();
}




}
