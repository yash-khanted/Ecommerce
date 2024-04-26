import { Component } from '@angular/core';
import { NavbarComponent } from '../components/navbar/navbar.component';
import { FooterComponent } from '../components/footer/footer.component';
import { AdvertisementCarouselComponent } from '../components/advertisement-carousel/advertisement-carousel.component';
import { ProductCarouselComponent } from '../components/product-carousel/product-carousel.component';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [NavbarComponent, FooterComponent, AdvertisementCarouselComponent, ProductCarouselComponent],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {
  
}
