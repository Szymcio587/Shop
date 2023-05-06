import { Component, OnInit } from '@angular/core';
import { GameService } from './game.service';
import { Data } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{

  games: any;

  constructor(private gameService: GameService) { }

  ngOnInit() {
    this.getData();
  }

  getData(): void {
    this.gameService.getAllData().subscribe(games => {
      this.games = games;
      console.log(this.games);
    });
  }
}
