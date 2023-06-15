import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TablaTransferenciasComponent } from './tabla-transferencias.component';

describe('TablaTransferenciasComponent', () => {
  let component: TablaTransferenciasComponent;
  let fixture: ComponentFixture<TablaTransferenciasComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TablaTransferenciasComponent]
    });
    fixture = TestBed.createComponent(TablaTransferenciasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
