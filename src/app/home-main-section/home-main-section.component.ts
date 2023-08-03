import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home-main-section',
  templateUrl: './home-main-section.component.html',
  styleUrls: ['./home-main-section.component.css']
})
export class HomeMainSectionComponent implements OnInit {

  constructor(private router : Router) { }

  ngOnInit(): void {
  }

  checkSession(){
    if (sessionStorage.length == 0){
      
      this.router.navigate(['/login'])
    }
    else{
      this.router.navigate(['/dashboard'])
    }
  }
  imageObject: Array<object> = [{
    image:'https://ubsapp.com/wp-content/uploads/2022/11/Leave-Management-System-Challenges-and-Features-that-Can-Make-or-Break-your-Business.png',
    thumbImage:'https://ubsapp.com/wp-content/uploads/2022/11/Leave-Management-System-Challenges-and-Features-that-Can-Make-or-Break-your-Business.png',
    alt: 'alt of image',
    order: 1
}]
}
