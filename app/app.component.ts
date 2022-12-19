import { Component } from '@angular/core';
import { BookProcessService } from './book-process.service';
import { Student } from './student';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angulardemo2';
  price=5600.75
  pdate=new Date
  data=43
  name1="angular"

  // constructor(bkprocess:BookProcessService){
  //   this.name1=bkprocess.processData(this.name1);
  // }

  studentList:Student[]=[];

  constructor(private bkdetail:BookProcessService){
    this.bkdetail.getStudents().subscribe(studentList=>this.studentList=studentList);
    //this.bkdetail.addStudent().subscribe();
    
  }
}
