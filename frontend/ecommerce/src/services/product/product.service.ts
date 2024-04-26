import { Injectable } from '@angular/core';
import { Product } from '../../model/Product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  constructor() { }

  public getMostOrderedProducts(): Product[]{
    let products: Product[] = [
      new Product(1, 'Iphone 13', 45000, 'electronics', 'A handheld portable computer', ''),
      new Product(2, 'JK copier paper', 545, 'stattionery', 'A 500 sheet os A4 size paper', '')
    ];

    return products;
  }
}
