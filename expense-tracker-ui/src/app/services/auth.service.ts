import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class AuthService {
  private http = inject(HttpClient);
  private apiUrl = 'http://localhost:8080/api/auth';

  register(userData: any): Observable<string> {
    return this.http.post(`${this.apiUrl}/register`, userData, { responseType: 'text' });
  }

  login(credentials: any): Observable<string> {
    return this.http.post(`${this.apiUrl}/login`, credentials, { responseType: 'text' });
  }

  saveToken(token: string) {
    localStorage.setItem('token', token);
  }

  getToken(token: string) {
    return localStorage.getItem('token');
  }

  logout() {
    localStorage.removeItem('token');
  }
}
