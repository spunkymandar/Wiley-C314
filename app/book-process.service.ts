import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {HttpClient} from '@angular/common/http'
import { Student } from './student';

@Injectable({
  providedIn: 'root'
})
export class BookProcessService {

  constructor(private http:HttpClient) { 
    
  }

  processData(data:string):string{
    return data.toUpperCase();
  }

  getStudents():Observable<Student[]>{
    // return of(this.bookList).pipe(delay(5000))
    return this.http.get<Student[]>("http://localhost:8080/api/students")
   }

  addStudent():Observable<Student>{
      return this.http.post<Student>("http://localhost:8080/api/students",{
        "id": "20",
        "name": "Ramesh",
        "age": "60"
      });
  }


  }
