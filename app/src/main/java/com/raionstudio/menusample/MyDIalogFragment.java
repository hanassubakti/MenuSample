package com.raionstudio.menusample;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by hanas on 30/10/2014.
 */
public class MyDIalogFragment extends DialogFragment {


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder theDialog=new AlertDialog.Builder(getActivity());
        theDialog.setTitle("sample Dialog");
        theDialog.setMessage("hello im a dialog");
        theDialog.setPositiveButton("OK",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(),"you clicked yes",Toast.LENGTH_SHORT).show();
            }
        });

        theDialog.setNegativeButton("Cancel",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(),"you clicked cancel",Toast.LENGTH_SHORT).show();
            }
        });
        return theDialog.create();
    }
}
