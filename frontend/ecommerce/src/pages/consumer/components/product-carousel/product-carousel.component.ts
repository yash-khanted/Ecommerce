import { Component } from '@angular/core';
import { ProductService } from '../../../../services/product/product.service';
import { Product } from '../../../../model/Product';
import { ProductPalleteComponent } from '../product-pallete/product-pallete.component';
import { NgFor } from '@angular/common';

@Component({
  selector: 'app-product-carousel',
  standalone: true,
  imports: [ProductPalleteComponent, NgFor],
  templateUrl: './product-carousel.component.html',
  styleUrl: './product-carousel.component.css'
})
export class ProductCarouselComponent {
  products: Product[];

  constructor(private productService: ProductService) {
    this.products = this.productService.getMostOrderedProducts();
  }
}
