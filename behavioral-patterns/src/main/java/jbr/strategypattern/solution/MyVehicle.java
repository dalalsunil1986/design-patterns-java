package jbr.strategypattern.solution;

import jbr.common.VehicleType;
import jbr.common.model.Vehicle;

public class MyVehicle {

  public static void main(String[] args) {
    Vehicle car = assemble(VehicleType.CAR);
    System.out.println(car.getVehicleType());
  }

  public static Vehicle assemble(VehicleType vehicleType) {
    CarAssembler carAssembler = new CarAssembler();
    BikeAssembler bikeAssembler = new BikeAssembler();
    Vehicle vehicle = null;

    switch (vehicleType) {
    case CAR:
      vehicle = carAssembler.assemble();
      break;
    case BIKE:
      vehicle = bikeAssembler.assemble();
      break;
    default:
      break;
    // add implementations for new type of vehicles
    }

    return vehicle;
  }

}
