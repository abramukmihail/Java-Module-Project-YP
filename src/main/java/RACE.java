class Race {
    String liderCar=" ";
    int liderDistance=0;
    void race(String nameCar,int speedCar){
        int distance=speedCar*24;
        if(distance>liderDistance)
        {
            liderDistance=distance;
            liderCar=nameCar;
        }
    }

}
