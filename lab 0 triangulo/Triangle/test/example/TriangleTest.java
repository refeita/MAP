package example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest { 
	 
    @Test 
    public void equilateralTriangleHaveEqualSides() throws Exception { 
        Triangle triangle = new Triangle(2, 2, 2); 
 
        assertEquals(TriangleKind.EQUILATERAL, triangle.getKind()); 
    } 
    
    @Test 
    public void isoscelesTriangleHaveEqualSides() throws Exception { 
        Triangle triangle = new Triangle(2, 2, 1); 
 
        assertEquals(TriangleKind.ISOSCELES, triangle.getKind()); 
    } 
    
    @Test 
    public void isoscelesTriangleHaveEqualSides2() throws Exception { 
        Triangle triangle = new Triangle(2, 1, 2); 
 
        assertEquals(TriangleKind.ISOSCELES, triangle.getKind()); 
    } 
   
    @Test 
    public void isoscelesTriangleHaveEqualSides3() throws Exception { 
        Triangle triangle = new Triangle(2, 2, 1); 
 
        assertEquals(TriangleKind.ISOSCELES, triangle.getKind()); 
    } 
    
    @Test 
    public void scaleneTriangleNotHaveEqualSides() throws Exception { 
        Triangle triangle = new Triangle(6,9,10); 
 
        assertEquals(TriangleKind.SCALENE, triangle.getKind()); 
    } 
    
   
    @Test 
    public double triangleSizes() throws Exception { 
        Triangle triangle = new Triangle(6.4,9,1); 
        
        return triangle.getNumberOfUniqueSides();


    } 
 }