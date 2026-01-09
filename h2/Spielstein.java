package h2;

public class Spielstein {
private int currentRow;
private int currentCol;
private Spielbrett brett;
public int getCurrentRo() {
	return currentRow;
}
public void setCurrentRow(int currentRow) {
	this.currentRow =currentRow;
}
public void setCurrentCol(int currentCol) {
	this.currentCol=currentCol;
}
public int getCurrentCol() {
	return currentCol;
}
public Spielbrett getBrett() {
	return brett;
}
public void setBrett(Spielbrett brett) {
	this.brett=brett;
}

public void Spiekstein(Spielbrett brett, int indexRow, int indexCol) {
	this.brett=brett;
	this.currentCol=indexCol;
	this.currentRow=indexRow;
}

private boolean movesOut() {
	Feld currentFeld=brett.getBrett()[currentRow][currentCol];
	char direction= currentFeld.getDirection();
	int dim=brett.getDim();
	if(direction =='U' && currentRow==0) {
		return true;
	}
	if (direction=='D'&& currentRow==dim-1) {
		return true;
	}
	if (direction =='L' && currentCol==0) {
		return true;
	}
	if (direction =='R' && currentCol ==dim-1) {
		return true;
	}
	return false;

}
	public void go (int n) {
		for(int i=0;i<n;i++) {
			Feld currentFeld=brett.getBrett()[currentRow][currentCol];
			if(currentFeld.isBoese()==false) {
				continue;
			}
			char direction =currentFeld.getDirection();
			int nextRow=currentRow;
			int nextCol=currentCol;
			
			if(direction=='U') {
				nextRow--;
			}
			else if (direction =='D') {
				nextRow++;
			}
			else if(direction=='L') {
				nextCol--;
			}
			else if(direction =='R') {
				nextCol++;
			}
			if(nextRow>=0 && nextRow<brett.getDim() && nextCol>=0 && nextCol<brett.getDim()) {
				currentRow=nextRow;
				currentCol=nextCol;
			}
		}
	}

}
