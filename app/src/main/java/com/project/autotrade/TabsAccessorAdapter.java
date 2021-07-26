package com.project.autotrade;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.project.autotrade.Fragment.ChatsFragment;
import com.project.autotrade.Fragment.ContactsFragment;
import com.project.autotrade.Fragment.GroupsFragment;

public class TabsAccessorAdapter extends FragmentPagerAdapter {

    public TabsAccessorAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                ChatsFragment chatsFragment = new ChatsFragment();
                return chatsFragment;

//            case 1:
//                GroupsFragment groupsFragment = new GroupsFragment();
//                return groupsFragment;
//
//            case 2:
//                ContactsFragment contactsFragment = new ContactsFragment();
//                return contactsFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return "Chats";
//
//            case 1:
//                return "Groups";
//
//            case 2:
//                return "Contacts";

            default:
                return null;
        }
    }
}
