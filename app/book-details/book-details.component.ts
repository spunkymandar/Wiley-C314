import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-book-details',
  templateUrl: './book-details.component.html',
  styleUrls: ['./book-details.component.css']
})
export class BookDetailsComponent implements OnInit {

  bookStatus=false;

  Books=[
    {"BookName":"Learn Java9","BookAuthor":"Peter Gustav"},
    {"BookName":"Angular Professional","BookAuthor":"Patric Simon"},
    {"BookName":"Spring MicroServices","BookAuthor":"Wilson Jerome"}
  ];

  constructor() { }

  checkBookStatus(){
    if(this.Books.length==0)
    return false;
    else
    return true;
  }
  ngOnInit(): void {
  }

}
