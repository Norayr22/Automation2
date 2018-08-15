package JavaLessons;

import JavaLessons.Polygon.Vertex;

public class TriangleTest {
	public boolean isTriangle(Polygon polygon) {
		Vertex a = polygon.vertices[0];
		Vertex b = polygon.vertices[1];
		Vertex c = polygon.vertices[2];
		return (distanceBtwVertices(a,b) + distanceBtwVertices(b,c) > distanceBtwVertices(a,c))&&
				(distanceBtwVertices(a,b)+distanceBtwVertices(a,c)>distanceBtwVertices(b,c))
				&&(distanceBtwVertices(b,c)+distanceBtwVertices(a,c)>distanceBtwVertices(a,b));   

	}

	public static int distanceBtwVertices(Vertex source, Vertex dest){

		
		int des1 = source.x -dest.x;
		int des2 = source.y -dest.y;


		return (int) Math.sqrt(des1*des1+des2*des2);
	}   
}
