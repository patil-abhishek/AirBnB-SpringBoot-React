package pes.ooad.airbnb.converter;

import pes.ooad.airbnb.model.user.User;
import pes.ooad.airbnb.model.user.UserOTP;
import pes.ooad.airbnb.model.user.UserProfile;

public class UserConverter {
    public static User userOTPtoUser(UserOTP userOTP) {
        User user = new User();
        user.setFirstname(userOTP.getFirstname());
        user.setLastname(userOTP.getLastname());
        user.setPhone(userOTP.getPhone());
        user.setEmail(userOTP.getEmail());
        user.setPassword(userOTP.getPassword());
        return user;
    }

    public static UserProfile userToUserProfile(User user) {
        UserProfile userProfile = new UserProfile();
        userProfile.setFirstname(user.getFirstname());
        userProfile.setLastname(user.getLastname());
        userProfile.setImage(user.getImage());
        userProfile.setEmail(user.getEmail());
        userProfile.setProperties(user.getProperties());
        userProfile.setFavoriteProperties(user.getFavoriteProperties());
        userProfile.setEmail(user.getEmail());
        return userProfile;
    }


}
