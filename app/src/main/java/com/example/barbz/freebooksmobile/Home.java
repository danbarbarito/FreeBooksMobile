package com.example.barbz.freebooksmobile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

public class Home extends Activity {
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.expandableListView);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Ada");
        listDataHeader.add("Agda");
        listDataHeader.add("Android");
        listDataHeader.add("APL");
        listDataHeader.add("Arduino");
        listDataHeader.add("ASP.NET MVC");
        listDataHeader.add("Assembly Language");
        listDataHeader.add("AutoHotKey");
        listDataHeader.add("Autotools");
        listDataHeader.add("Awk");
        listDataHeader.add("Bash");
        listDataHeader.add("Basic");
        listDataHeader.add("BETA");
        listDataHeader.add("C");
        listDataHeader.add("C++");

        listDataHeader.add("Python");
        listDataHeader.add("Java");

        // Adding child data
        List<String> c = new ArrayList<String>();
        c.add("cbook1");
        c.add("cbook2");
        c.add("cbook3");
        c.add("cbook4");


        List<String> cpp = new ArrayList<String>();
        cpp.add("cppbook1");
        cpp.add("cppbook2");
        cpp.add("cppbook3");
        cpp.add("cppbook4");

        List<String> python = new ArrayList<String>();
        python.add("pybook1");
        python.add("pybook2");
        python.add("pybook3");
        python.add("pybook4");

        List<String> java = new ArrayList<String>();
        java.add("javabook1");
        java.add("javabook2");
        java.add("javabook3");
        java.add("javabook4");


        listDataChild.put(listDataHeader.get(0), c); // Header, Child data
        listDataChild.put(listDataHeader.get(1), cpp);
        listDataChild.put(listDataHeader.get(2), python);
        listDataChild.put(listDataHeader.get(3), java);
    }
}
