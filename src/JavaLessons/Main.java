package JavaLessons;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import JavaLessons.Polygon.Vertex;

public class Main {
	@Test()
	public void test1() throws InvalidVerticesCombinationException {
		MockTriangleFactory factory = new MockTriangleFactory();

		TriangleTest triangleTest = new TriangleTest();



		Polygon polygon = new Polygon();

		Vertex vertex1 = polygon.new Vertex(0, 0);
		Vertex vertex2 = polygon.new Vertex(3, 4);
		Vertex vertex3 = polygon.new Vertex(4, 0);
//	    по данным кординатам можно строить треугольник(5,4,4)
//		(0,0,0) это стороны треугольника
		
		
		factory.setVertex1(vertex1);
		factory.setVertex2(vertex2);
		factory.setVertex3(vertex3);

		boolean actual = triangleTest.isTriangle(factory.getTriangle());

		assertEquals(actual, true);
	}
	@Test()
	public void test2() throws InvalidVerticesCombinationException {
		MockTriangleFactory factory = new MockTriangleFactory();

		TriangleTest triangleTest = new TriangleTest();



		Polygon polygon = new Polygon();

		Vertex vertex1 = polygon.new Vertex(0, 0);
		Vertex vertex2 = polygon.new Vertex(10, 10);
		Vertex vertex3 = polygon.new Vertex(4, 4);
//	    по данным кординатам не можно строить треугольник
//		как видно из него не можно получить треугольник,так как сумма двух сторон меньше чем третьая сторона

		
		
		factory.setVertex1(vertex1);
		factory.setVertex2(vertex2);
		factory.setVertex3(vertex3);

		boolean actual = triangleTest.isTriangle(factory.getTriangle());

		assertEquals(actual, false);
	}
	@Test()
	public void test3() throws InvalidVerticesCombinationException {
		MockTriangleFactory factory = new MockTriangleFactory();

		TriangleTest triangleTest = new TriangleTest();



		Polygon polygon = new Polygon();

		Vertex vertex1 = polygon.new Vertex(0, 0);
		Vertex vertex2 = polygon.new Vertex(0, 0);
		Vertex vertex3 = polygon.new Vertex(0, 0);
//	    по данным кординатам не можно строить треугольник(0,0,0)
//		(0,0,0) это стороны треугольника
//		как видно из него не можно получить треугольник
		
		
		factory.setVertex1(vertex1);
		factory.setVertex2(vertex2);
		factory.setVertex3(vertex3);

		boolean actual = triangleTest.isTriangle(factory.getTriangle());

		assertEquals(actual, false);
	}


}






