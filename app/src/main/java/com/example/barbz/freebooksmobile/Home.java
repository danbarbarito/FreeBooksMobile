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
        listDataHeader.add("Clojure");
        listDataHeader.add("COBOL");
        listDataHeader.add("CoffeeScript");
        listDataHeader.add("ColdFusion");
        listDataHeader.add("Cool");
        listDataHeader.add("Coq");
        listDataHeader.add("D");
        listDataHeader.add("Dart");
        listDataHeader.add("DB2");
        listDataHeader.add("Delphi/Pascal");
        listDataHeader.add("DTrace");
        listDataHeader.add("Elasticsearch");
        listDataHeader.add("Emacs");
        listDataHeader.add("Erland");
        listDataHeader.add("F#");
        listDataHeader.add("Firefox OS");
        listDataHeader.add("Flex");
        listDataHeader.add("Force.com");
        listDataHeader.add("Forth");
        listDataHeader.add("Fortan");
        listDataHeader.add("FreeBSD");
        listDataHeader.add("Git");
        listDataHeader.add("Go");
        listDataHeader.add("Groovy");
        listDataHeader.add("Graphical User Interfaces");
        listDataHeader.add("Graphics Programming");
        listDataHeader.add("Hadoop");
        listDataHeader.add("Haskell");
        listDataHeader.add("HTML/CSS");
        listDataHeader.add("Icon");
        listDataHeader.add("IDL");
        listDataHeader.add("iOS");
        listDataHeader.add("Isabelle/HOL");
        listDataHeader.add("J");
        listDataHeader.add("Java");
        listDataHeader.add("JavaScript");
        listDataHeader.add("Jenkins");
        listDataHeader.add("Language Agnostic");
        listDataHeader.add("LaTeX");
        listDataHeader.add("Linux");
        listDataHeader.add("Lisp");
        listDataHeader.add("Lua");
        listDataHeader.add("Mathematica");
        listDataHeader.add("MATLAB");
        listDataHeader.add("Maven");
        listDataHeader.add("Mercurial");
        listDataHeader.add("Mercury");
        listDataHeader.add("Meta-Lists");
        listDataHeader.add("MySQL");
        listDataHeader.add(".NET Framework");
        listDataHeader.add("Neo4J");
        listDataHeader.add("NoSQL");
        listDataHeader.add("Oberon");
        listDataHeader.add("Objective-C");
        listDataHeader.add("OCaml");
        listDataHeader.add("Octave");
        listDataHeader.add("OpenGL ES");
        listDataHeader.add("OpenSCAD");
        listDataHeader.add("Oracle PL/SQL");
        listDataHeader.add("Oracle Server");
        listDataHeader.add("Parrot/Perl 6");
        listDataHeader.add("PC-BSD");
        listDataHeader.add("Perl");
        listDataHeader.add("PHP");
        listDataHeader.add("PicoLisp");
        listDataHeader.add("PostgreSQL");
        listDataHeader.add("Powershell");
        listDataHeader.add("Processing");
        listDataHeader.add("Prolog");
        listDataHeader.add("Python");
        listDataHeader.add("QML");
        listDataHeader.add("R");
        listDataHeader.add("Racket");
        listDataHeader.add("REBOL");
        listDataHeader.add("Ruby");
        listDataHeader.add("Rust");
        listDataHeader.add("Sage");
        listDataHeader.add("Scala");
        listDataHeader.add("Scheme");
        listDataHeader.add("Scilab");
        listDataHeader.add("Scratch");
        listDataHeader.add("Sed");
        listDataHeader.add("Silverlight");
        listDataHeader.add("Smalltalk");
        listDataHeader.add("SQL");
        listDataHeader.add("Swift");
        listDataHeader.add("Standard ML");
        listDataHeader.add("Subversion");
        listDataHeader.add("Tcl");
        listDataHeader.add("Teradata");
        listDataHeader.add("TeX");
        listDataHeader.add("Tizen");
        listDataHeader.add("TLA");
        listDataHeader.add("TypeScript");
        listDataHeader.add("Unix");
        listDataHeader.add("Verilog");
        listDataHeader.add("VHDL");
        listDataHeader.add("Vim");
        listDataHeader.add("Visual Basic");
        listDataHeader.add("Visual Prolog");
        listDataHeader.add("Web Services");
        listDataHeader.add("Windows 8");
        listDataHeader.add("Windows Phone");
        listDataHeader.add("Workflow");
        listDataHeader.add("xBase (dbase/Clipper/Harbour)");


        // Adding child data
        List<String> c = new ArrayList<String>();
        List<String> cpp = new ArrayList<String>();
        List<String> python = new ArrayList<String>();
        List<String> java = new ArrayList<String>();



        listDataChild.put(listDataHeader.get(0), c); // Header, Child data
        listDataChild.put(listDataHeader.get(1), cpp);
        listDataChild.put(listDataHeader.get(2), python);
        listDataChild.put(listDataHeader.get(3), java);
    }
}
