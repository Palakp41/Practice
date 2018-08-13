public class TableAndRobot {
    public static class Robot{
        public static final int TABLE_DIMENSIONS = 5;
        public static int x;
        public static int y;
        public static String dir;
        public Robot(){
            x = 0;
            y = 0;
            dir = "";
        }
        public static void place(int a, int b, String d){
            if(a>0 && a<5 && b>0 && b<5){
                x = a;
                y = b;
            }
            if(d == "NORTH" || d == "SOUTH" || d == "WEST" || d == "EAST"){
                dir = d;
            }
        }
        public static void move(){
            if(dir == "NORTH" && y<5){
                y++;
            }
            if(dir == "SOUTH" && y>0){
                y--;
            }
            if(dir == "WEST" && x<5){
                x++;
            }
            if(dir == "EAST" && x>0){
                x--;
            }
        }
        public static void changeDir(String lr){
            if(dir == "NORTH" && lr == "LEFT"){
                dir = "WEST";
            }
            else if(dir == "NORTH" && lr == "RIGHT"){
                dir = "EAST";
            }
            else if(dir == "SOUTH" && lr == "LEFT"){
                dir = "EAST";
            }
            else if(dir == "SOUTH" && lr == "RIGHT"){
                dir = "WEST";
            }
            else if(dir == "WEST" && lr == "LEFT"){
                dir = "SOUTH";
            }
            else if(dir == "WEST" && lr == "RIGHT"){
                dir = "NORTH";
            }
            else if(dir == "EAST" && lr == "LEFT"){
                dir = "NORTH";
            }
            else if(dir == "EAST" && lr == "RIGHT"){
                dir = "SOUTH";
            }
        }
        public static String report(){
            return x + "," + y + "," + dir;
        }
    }
    public static void main(String args[]) {
        Robot r = new Robot();
        System.out.println("PLACE: 0, 0, NORTH");
        r.place(0, 0, "NORTH");
        System.out.println("MOVE");
        r.move();
        System.out.println("REPORT");
        System.out.println("OUTPUT: " + r.report());
        System.out.println("PLACE: 0, 0, NORTH");
        r.place(0, 0, "NORTH");
        System.out.println("LEFT");
        r.changeDir("LEFT");
        System.out.println("REPORT");
        System.out.println("OUTPUT: " + r.report());
        System.out.println("PLACE: 0, 0, NORTH");
        r.place(0, 0, "NORTH");
        System.out.println("RIGHT");
        r.changeDir("RIGHT");
        System.out.println("REPORT");
        System.out.println("OUTPUT: " + r.report());
    }
}