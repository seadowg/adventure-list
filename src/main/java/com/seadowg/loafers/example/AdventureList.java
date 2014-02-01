package com.seadowg.loafers.example;

import com.seadowg.loafers.app.App;
import com.seadowg.loafers.widget.Button;
import com.seadowg.loafers.widget.Input;
import com.seadowg.loafers.widget.List;

public class AdventureList extends App {

  @Override
  public void open() {
    setTitle("Adventure List");

    final List list = new List() {
      @Override
      public void press(String item) {
        remove(item);
      }
    };

    final Input input = new Input();
    new Button("Add") {
      @Override
      public void press() {
        list.add(input.getText());
        input.clear();
      }
    };
  }
}
