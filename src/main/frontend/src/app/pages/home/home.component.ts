import { Component, OnInit } from '@angular/core';
import { GameService } from 'src/app/game.service';
import { Data } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{
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
