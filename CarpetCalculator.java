public class CarpetCalculator{
int Area;
int TotalCost;
int CarpetCost = 8;

    public int RoomDimension (int length,int width){
        
        return length * width;
    }

    public int RoomCarpet (int length, int width){
        Area = RoomDimension(length, width);
        TotalCost = Area * CarpetCost;
        return TotalCost;
    }
}