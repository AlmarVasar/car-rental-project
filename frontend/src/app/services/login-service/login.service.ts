import {Injectable} from '@angular/core';
import {delay, Observable, of, tap} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {adminRole, defaultUserLogin, defaultUserName, defaultUserSurname, emptyRole} from "../../models/authorization";
@Injectable({
  providedIn: 'root'
})
export class LoginService {
  isLoggedIn = false;
  userRole = emptyRole;
  name = defaultUserSurname;
  surname = defaultUserSurname;
  userLogin = defaultUserLogin;
  constructor(
    private http: HttpClient
  ) {
  }
  login(userLogin: string, pass: string): Observable<boolean> {
    return of(true)
      .pipe(
        delay(2000),
        tap(value => {
          this.isLoggedIn = true;
          this.userRole = 'ADMIN';
          this.userLogin = userLogin;
          this.name = 'Maniek';
          this.surname = 'P.';
        })
      )
// response from server:
    // true/false
    // roles
    // name, surname
  }


  logout() {
    this.isLoggedIn = false;
    this.userRole = emptyRole;
    this.name = defaultUserName;
    this.surname = defaultUserSurname;
    this.userLogin = defaultUserLogin;

  }
}
