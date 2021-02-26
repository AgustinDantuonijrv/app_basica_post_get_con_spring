import { Routes } from "@angular/router";
import { CoursesComponentComponent } from "./courses-component/courses-component.component";
import { HomeComponent } from "./home/home.component";
import { QuestionsComponentComponent } from "./questions-component/questions-component.component";

export const routerConfig: Routes = [
  {
      path: 'home',
      component: HomeComponent
  },
  {
      path: 'questions',
      component: QuestionsComponentComponent
  },
  {
      path: 'VideoCourses',
      component: CoursesComponentComponent
  },
  {
      path: '',
      redirectTo: '/home',
      pathMatch: 'full'
  },
  {
      path: '**',
      redirectTo: '/home',
      pathMatch: 'full'
  }
];
