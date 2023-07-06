import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TransferenciasRecibidasComponent } from './transferencias-recibidas.component';

describe('TransferenciasRecibidasComponent', () => {
  let component: TransferenciasRecibidasComponent;
  let fixture: ComponentFixture<TransferenciasRecibidasComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TransferenciasRecibidasComponent]
    });
    fixture = TestBed.createComponent(TransferenciasRecibidasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
