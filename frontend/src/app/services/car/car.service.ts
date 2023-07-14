import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Client} from "../../models/client";
import {Observable} from "rxjs";
import {allCarsUrl, allClientsUrl, createCarUrl, createClientUrl} from "../../models/links";
import {Car} from "../../models/car";

@Injectable({
  providedIn: 'root'
})
export class CarService {

  constructor(
    private http : HttpClient
  ) { }

  getAllCars() : Observable<Array<Car>>{
    console.log("calling!!")
    return this.http.get<Array<Car>>(allCarsUrl)
  }

  createCar(car : Car) : Observable<Car> {
    return this.http.post<Car>(createCarUrl, car);
  }


}
