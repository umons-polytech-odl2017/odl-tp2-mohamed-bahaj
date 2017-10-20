package exercise2;

public class ProductionWorker implements Payable {

	public int salaryPerProducedPiece;
	public int pieceProduce=0;

	public ProductionWorker(int salaryPerProducedPiece) {
		this.salaryPerProducedPiece = salaryPerProducedPiece;
	}

	public void produceOnePiece() {pieceProduce++;}

	public int computeSalary() {
		return (pieceProduce*salaryPerProducedPiece);
	}
}
