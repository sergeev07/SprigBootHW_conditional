package ru.netology.springboothw_conditional.systemProfile;

public class DevProfile implements SystemProfile {

    @Override
    public String getProfile() {
        return "Current profile is dev\n";
    }
}
