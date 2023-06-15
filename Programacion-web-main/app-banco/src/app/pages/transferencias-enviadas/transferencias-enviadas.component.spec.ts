import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TransferenciasEnviadasComponent } from './transferencias-enviadas.component';

describe('TransferenciasEnviadasComponent', () => {
  let component: TransferenciasEnviadasComponent;
  let fixture: ComponentFixture<TransferenciasEnviadasComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TransferenciasEnviadasComponent]
    });
    fixture = TestBed.createComponent(TransferenciasEnviadasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
