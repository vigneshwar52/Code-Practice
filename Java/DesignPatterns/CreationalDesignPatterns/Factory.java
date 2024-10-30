package DesignPatterns.CreationalDesignPatterns;

interface shape {
    void draw();
}

class circle implements shape {
    @Override
    public void draw() {
        System.out.println("draw Circle");
    }    
}

class square implements shape {
    @Override
    public void draw() {
        System.out.println("draw Square");
    }   
}

class shapeFactory {
    public static shape createShape(String shape) {
        if(shape.isEmpty() ||shape == null){
            System.out.println("Please provide shape to proceed");
            return null;
        }else if(shape.equalsIgnoreCase("circle")){
            return new circle();
        }else if(shape.equalsIgnoreCase("square")){
            return new square();
        }
        return null;
    }
}

public class Factory {
    public static void main(String[] args) {
        shape sh = shapeFactory.createShape("square");
        sh.draw();
    }
}
