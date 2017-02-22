package de.aaronoe.popularmovies.DetailPage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import de.aaronoe.popularmovies.Movies.MovieItem;

/**
 *
 * Created by aaron on 21.02.17.
 */

class TabsAdapter extends FragmentPagerAdapter {

    private MovieItem movieItem;

    TabsAdapter(FragmentManager fm, MovieItem movie) {
        super(fm);
        this.movieItem = movie;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return DetailPageInfoFragment.newInstance(movieItem);
            case 1: return DetailPageVideosFragment.newInstance(movieItem);
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case 0: return "Info";
            case 1: return "Videos";
        }
        return "";
    }
}