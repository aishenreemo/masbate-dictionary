package com.example.masbate_dictionary.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class HomeView extends VerticalLayout {

    public HomeView() {
        Div banner = new Div();
        banner.addClassName("banner");
        banner.addClassName("debug");

        H1 header = new H1("Explore Masbate");
        header.addClassName("debug");

        banner.add(header);

        TextField searchTextField = new TextField();
        Button searchBtn = new Button("Find");
        Div search = new Div();
        search.addClassName("search");
        search.addClassName("debug");
        search.add(searchTextField);
        search.add(searchBtn);

        banner.add(search);

        Span randomWordBtn = new Span("Random Word");
        randomWordBtn.addClassName("random-word");
        randomWordBtn.addClassName("debug");

        banner.add(randomWordBtn);

        Div sections = new Div("test");
        sections.addClassName("sections");
        sections.addClassName("debug");

        add(banner);
        add(sections);
        addClassName("home");
        addClassName("debug");
    }
}
