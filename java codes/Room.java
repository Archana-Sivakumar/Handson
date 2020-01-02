class Room{
    int length;
    int breadth;
    int height;
    
    Room(int length,int breadth,int height)
    {
        this.length=length;
        this.breadth=breadth;
        this.height=height; 
    }
    int calculateFloorArea(){
        int floorArea=length*breadth;
        return floorArea;
    }
    int calculatePaintCost(){
        int wallArea=(2*length*height)+(2*breadth*height);
        int paintingCost=wallArea*2;   
        return paintingCost;
    }
}