import { Component } from '@angular/core';
import { Product } from '../../../model/Product';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-add-product-form',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './add-product-form.component.html',
  styleUrl: './add-product-form.component.css'
})
export class AddProductFormComponent {
  public product!: Product;
  public productForm!: FormGroup;

  /**
   *
   */
  constructor(private formBuilder: FormBuilder) {
    this.CreateForm();
  }
  
  CreateForm() {
    this.productForm = this.formBuilder.group({
      title: [null, Validators.required],
      description: [null],
      price: [0, Validators.min(0)]
    });
  }

  onSubmit() {
    console.log('submit event triggered');
  }
}
