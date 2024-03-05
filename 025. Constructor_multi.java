/* We can create multiple constructors. */

class Cuboid {

    int width;
    int height;
    int depth;

    Cuboid(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Cuboid(int width, int height) {
        this.width = width;
        this.height = height;
        this.depth = 10;
    }

    Cuboid(int dimension) {
        width = dimension;
        height = dimension;
        depth = dimension;
    }

    Cuboid() {
        this.width = 5;
        this.height = 5;
        this.depth = 5;
    }

    int volume() {
        return width * height * depth;
    }
}

public class Constructor_multi {
    public static void main(String[] args) {
        
        int volume;

        Cuboid standard_Cuboid = new Cuboid(10, 20, 15);
        volume = standard_Cuboid.volume();
        System.out.println("Volume of Simple Cuboid => " + volume);

        Cuboid default_depth_Cuboid = new Cuboid(10, 20);
        volume = default_depth_Cuboid.volume();
        System.out.println("Volume of Cuboid with default depth => " + volume);

        Cuboid cube = new Cuboid(10);
        volume = cube.volume();
        System.out.println("Volume of cube => " + volume);

        Cuboid default_Cuboid = new Cuboid();
        volume = default_Cuboid.volume();
        System.out.println("Volume of default Cuboid => " + volume);
    }
}
