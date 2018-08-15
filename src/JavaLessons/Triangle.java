package JavaLessons;

import JavaLessons.Polygon.Vertex;

public class Triangle implements TriangleFactory{

	private final Polygon triangle;


	public Triangle(Vertex a,Vertex b,Vertex c){

		triangle = new Polygon(a,b,c);

	}

	private boolean isValidVertices(Polygon triangle){
		Vertex a = triangle.vertices[0];
		Vertex b = triangle.vertices[1];
		Vertex c = triangle.vertices[2];
		return (distanceBtwVertices(a,b) + distanceBtwVertices(b,c) > distanceBtwVertices(a,c))&&
				(distanceBtwVertices(a,b)+distanceBtwVertices(a,c)>distanceBtwVertices(b,c))
				&&(distanceBtwVertices(b,c)+distanceBtwVertices(a,c)>distanceBtwVertices(a,b));   

	}

	private int distanceBtwVertices(Vertex source, Vertex dest){


		int des1 = Math.abs(source.x -dest.x);
		int des2 = Math.abs(source.y -dest.y);
		
		
	return (int) Math.sqrt(des1*des1+des2*des2);
	}    


	public Polygon getTriangle() throws InvalidVerticesCombinationException{
		if(isValidVertices(triangle)){  
			return triangle;
		}else{
			throw new InvalidVerticesCombinationException("Please review given vertices.");
		}        
	}

}





