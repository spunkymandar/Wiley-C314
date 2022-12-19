import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { YellowBackGroundDirective } from './yellow-back-ground.directive';
import { BookDetailsComponent } from './book-details/book-details.component';
import { Lognumber } from './lognumber';

import {HttpClientModule} from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    YellowBackGroundDirective,
    BookDetailsComponent,
    Lognumber
    
  ],
  imports: [
    BrowserModule,
    HttpClientModule
     ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
