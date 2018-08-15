package JavaLessons;


public final class Polygon {
	 public final Vertex[] vertices;

	 public Polygon(Vertex... vertices) {
	   this.vertices = vertices;
	 }
	

	public final class Vertex {
	 public final int x;
	 public final int y;

	 public Vertex(int x, int y) {
	   this.x = x;
	   this.y = y;
	 }
	}


}