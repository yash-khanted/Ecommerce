import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductPalleteComponent } from './product-pallete.component';

describe('ProductPalleteComponent', () => {
  let component: ProductPalleteComponent;
  let fixture: ComponentFixture<ProductPalleteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ProductPalleteComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ProductPalleteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
