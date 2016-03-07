package yu.exercise.com.sunshineyu.activities;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import yu.exercise.com.sunshineyu.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static class PlaceHolderFragment extends Fragment {

        private ArrayAdapter<String> mForecastAdapter;

        public PlaceHolderFragment(){

        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.fragment_main, container);


            String[] forecastArray = {
                    "Today - Sunny - 88/63",
                    "Tomorrow - Foggy - 70/40",
                    "hfiwuefhwhvdvlvlsk",
                    "fuehwiwe",
                    "ufehwihfwih",
                    "uhpiauehp"
                    ,            };

            List<String> weekForecast = new ArrayList<String>(
                    Arrays.asList(forecastArray));

            mForecastAdapter = new ArrayAdapter<String>
                    (getActivity(), R.layout.list_item_forecast, R.id.tvListItemForecast,weekForecast);

            ListView listView = (ListView) rootView.findViewById(R.id.listView_forecast);
            listView.setAdapter(mForecastAdapter);
            return rootView;
        }
    }
}
