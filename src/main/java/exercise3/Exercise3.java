package exercise3;

public class Exercise3 {
	public static void main(String[] args) {
		new Panel(new Drawable[] {
			new ConvexPolygon(new Point[] {
				new Point(10, 10),
					new Point(200, 200),
					new Point(300, 10)
			})
		});
	}
}
