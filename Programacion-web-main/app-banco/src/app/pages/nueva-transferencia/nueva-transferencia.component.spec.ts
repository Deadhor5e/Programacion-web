import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NuevaTransferenciaComponent } from './nueva-transferencia.component';

describe('NuevaTransferenciaComponent', () => {
  let component: NuevaTransferenciaComponent;
  let fixture: ComponentFixture<NuevaTransferenciaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [NuevaTransferenciaComponent]
    });
    fixture = TestBed.createComponent(NuevaTransferenciaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
