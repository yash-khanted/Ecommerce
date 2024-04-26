import { Routes } from '@angular/router';
import { LayoutComponent } from '../pages/consumer/layout/layout.component';
import { ProductPalleteComponent } from '../pages/consumer/components/product-pallete/product-pallete.component';
import { AddProductFormComponent } from '../pages/seller/add-product-form/add-product-form.component';


export const routes: Routes = [
    {
        path: '',
        component: LayoutComponent
    },
    {
        path: 'seller',
        component: AddProductFormComponent
    }
];
