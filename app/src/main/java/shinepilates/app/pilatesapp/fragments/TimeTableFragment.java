package shinepilates.app.pilatesapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import shinepilates.app.pilatesapp.R;

public class TimeTableFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_timetable, container, false);
        TableLayout timeTable = getView().findViewById(R.id.timetable);
        timeTable.removeAllViews();
        TableRow row = new TableRow(getActivity());
        TextView item0 = new TextView(getActivity());
        TextView item1 = new TextView(getActivity());
        TextView item2 = new TextView(getActivity());
        TextView item3 = new TextView(getActivity());
        TextView item4 = new TextView(getActivity());
        TextView item5 = new TextView(getActivity());
        TextView item6 = new TextView(getActivity());
        TextView item7 = new TextView(getActivity());
        TextView item8 = new TextView(getActivity());


        return root;
    }
}