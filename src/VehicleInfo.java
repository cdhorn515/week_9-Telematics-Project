/**
 * Created by cdhorn on 7/21/17.
 */
public class VehicleInfo {

    private int VIN;
    private double milesTraveled;
    private double gasConsumed;
    private double odometerAtLastOilChange;
    private double engineSizeInLiters;



    public double getMilesPerGallon(double milesTraveled, double gasConsumed) {
        return milesTraveled / gasConsumed;
    }

    //empty constructor (java bean)
    public VehicleInfo() {
        getMilesPerGallon(getMilesTraveled(), getGasConsumed());
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public double getMilesTraveled() {
        return milesTraveled;
    }
    public void setMilesTraveled(double milesTraveled) {
        this.milesTraveled = milesTraveled;
    }
    public double getGasConsumed() {
        return gasConsumed;
    }
    public void setGasConsumed(double gasConsumed) {
        this.gasConsumed = gasConsumed;
    }
    public double getOdometerAtLastOilChange() {
        return odometerAtLastOilChange;
    }
    public void setOdometerAtLastOilChange(double odometerAtLastOilChange) {
        this.odometerAtLastOilChange = odometerAtLastOilChange;
    }
    public double getEngineSizeInLiters() {
        return engineSizeInLiters;
    }
    public void setEngineSizeInLiters(double engineSizeInLiters) {
        this.engineSizeInLiters = engineSizeInLiters;
    }
}
