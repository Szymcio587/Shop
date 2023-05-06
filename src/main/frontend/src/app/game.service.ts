import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Data } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class GameService {

  private gameUrl = "http://localhost:8080/games"

  constructor(private http: HttpClient) { }

  getAllData(): Observable<Data[]> {
    return this.http.get<Data[]>(this.gameUrl);
  }

  WriteData(): void {
    this.http.get('http://localhost:8080/games').subscribe((data: any) => {
      console.log(data);
    });
  }
}
