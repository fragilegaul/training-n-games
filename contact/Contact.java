package contact;

public class Contact {
    private final int MAX_EMAIL = 3;
    private final int MAX_SOCIAL_MEDIA_LINK = 5;
    private String name;
    private ContactInfo phoneNumber;
    private Email[] emails = new Email[1];
    private Social[] socials = new Social[1];
    private int emailCounter = 0;
    private int socialMediaLinkCounter = 0;

    public Contact(String contactName) {
        this.name = contactName;
    }

    public void rename(String newName) {
        if (name != null && !name.isBlank() && newName != null && !newName.isBlank()) {
            name = newName;
        }
    }
    private class NameContactInfo implements ContactInfo {
        @Override
        public String getValue() {
            return name;
        }
        @Override
        public String getTitle() {
            return "Name";
        }
    }
    public static class Email implements ContactInfo {
        public String beforeAt;
        public String afterAt;

        @Override
        public String getValue() {
            return beforeAt + "@" + afterAt;
        }
        @Override
        public String getTitle() {
            return "Email";
        }
    }
    private void addEmailToContact(Email email) {
        emailCounter++;
        Email[] newEmails = new Email[emailCounter];
        System.arraycopy(emails, 0, newEmails, 0, emails.length);
        newEmails[emailCounter-1] = email;
        emails = new Email[emailCounter];
        System.arraycopy(newEmails, 0, emails, 0, newEmails.length);
    }

    public Email addEmail(String localPart, String domain) {
        if (emailCounter == MAX_EMAIL || localPart == null || domain == null) {
            return null;
        }
        Email email = new Email();
        email.beforeAt = localPart;
        email.afterAt = domain;
        addEmailToContact(email);
        return email;
    }

    public Email addEpamEmail(String firstname, String lastname) {
        if (emailCounter == MAX_EMAIL || firstname == null || lastname == null || firstname.isBlank()
                || lastname.isBlank()) {
            return null;
        }
        Email email = new Email() {
            String eEmailFirstName = firstname;
            String eEmailLastName = lastname;
            @Override
            public String getTitle() {
                return "Epam Email";
            }
            @Override
            public String getValue() {
                return eEmailFirstName + "_" + eEmailLastName + "@epam.com";
            }
        };
        addEmailToContact(email);
        return email;
    }

    public ContactInfo addPhoneNumber(int code, String number) {
        if (phoneNumber != null || code == 0 || number == null || number.isBlank()) {
            return null;
        }
        ContactInfo contactInfo = new ContactInfo() {
            @Override
            public String getValue() {
                return "+" + code + " " + number;
            }
            @Override
            public String getTitle() {
                return "Tel";
            }
        };
        phoneNumber = contactInfo;
        return contactInfo;
    }
    public static class Social implements ContactInfo {
        public String socialId;
        public String socialTitle;
        @Override
        public String getValue() {
            return socialId;
        }
        @Override
        public String getTitle() {
            return socialTitle;
        }
    }
    private void addSocialToContact(Social social) {
        socialMediaLinkCounter++;
        Social[] newSocials = new Social[socialMediaLinkCounter];
        System.arraycopy(socials, 0, newSocials, 0, socials.length);
        newSocials[socialMediaLinkCounter-1] = social;
        socials = new Social[socialMediaLinkCounter];
        System.arraycopy(newSocials, 0, socials, 0, newSocials.length);
    }

    public Social addTwitter(String twitterId) {
        if (socialMediaLinkCounter == MAX_SOCIAL_MEDIA_LINK || twitterId == null || twitterId.isBlank()) {
            return null;
        }
        Social social = new Social() {
            @Override
            public String getTitle() {
                return  "Twitter";
            }
            @Override
            public String getValue() {
                return twitterId;
            }
        };
        addSocialToContact(social);
        return social;
    }

    public Social addInstagram(String instagramId) {
        if (socialMediaLinkCounter == MAX_SOCIAL_MEDIA_LINK || instagramId == null || instagramId.isBlank()) {
            return null;
        }
        Social social = new Social() {
            @Override
            public String getTitle() {
                return "Instagram";
            }
            @Override
            public String getValue() {
                return instagramId;
            }
        };
        addSocialToContact(social);
        return social;
    }

    public Social addSocialMedia(String title, String id) {
        if (socialMediaLinkCounter == MAX_SOCIAL_MEDIA_LINK || title == null || title.isBlank()
                || id == null || id.isBlank()) {
            return null;
        }
        Social social = new Social() {
            @Override
            public String getTitle() {
                return title;
            }
            @Override
            public String getValue() {
                return id;
            }
        };
        addSocialToContact(social);
        return social;
    }
    public ContactInfo[] getInfo() {
        ContactInfo[] contactInfos = new ContactInfo[1];
        int index = 0;
        NameContactInfo nameContactInfo = new NameContactInfo();
        contactInfos[index] = nameContactInfo;
        index++;
        if (phoneNumber != null) {
            ContactInfo[] newContactInfos = new ContactInfo[contactInfos.length+1];
            System.arraycopy(contactInfos, 0, newContactInfos, 0, contactInfos.length);
            newContactInfos[index] = phoneNumber;
            contactInfos = new ContactInfo[newContactInfos.length];
            System.arraycopy(newContactInfos, 0, contactInfos, 0, newContactInfos.length);
            index++;
        }
        if (emailCounter != 0) {
            ContactInfo[] newContactInfos = new ContactInfo[contactInfos.length+emails.length];
            System.arraycopy(contactInfos, 0, newContactInfos, 0, contactInfos.length);
            for (Email email : emails) {
                newContactInfos[index] = email;
                index++;
            }
            contactInfos = new ContactInfo[newContactInfos.length];
            System.arraycopy(newContactInfos, 0, contactInfos, 0, newContactInfos.length);
        }
        if (socialMediaLinkCounter != 0) {
            ContactInfo[] newContactInfos = new ContactInfo[contactInfos.length+socials.length];
            System.arraycopy(contactInfos, 0, newContactInfos, 0, contactInfos.length);
            for (Social social : socials) {
                newContactInfos[index] = social;
                index++;
            }
            contactInfos = new ContactInfo[newContactInfos.length];
            System.arraycopy(newContactInfos, 0, contactInfos, 0, newContactInfos.length);
        }
        return contactInfos;
    }
}