import { Component, Input} from '@angular/core';
import { Product } from '../../../../model/Product';

@Component({
  selector: 'app-product-pallete',
  standalone: true,
  imports: [],
  templateUrl: './product-pallete.component.html',
  styleUrl: './product-pallete.component.css',
  interpolation: ['$', '$'],
})
export class ProductPalleteComponent {
  
  @Input({
    required: true,
  })
  public product!: Product;

  constructor() { }
}
