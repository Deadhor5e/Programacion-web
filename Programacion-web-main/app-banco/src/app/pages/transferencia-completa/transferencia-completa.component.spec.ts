import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TransferenciaCompletaComponent } from './transferencia-completa.component';

describe('TransferenciaCompletaComponent', () => {
  let component: TransferenciaCompletaComponent;
  let fixture: ComponentFixture<TransferenciaCompletaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TransferenciaCompletaComponent]
    });
    fixture = TestBed.createComponent(TransferenciaCompletaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
