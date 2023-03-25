public class CharacterCheck implements Checker{
    private static final String ALLOWED_CHARACTERS = "0123456789_abcdefghijklmnoprstuvwxyzABCDEFGHIJKLMNOPRSTUVWXYZ";
    @Override
     public boolean isValid(String s) {
    char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!ALLOWED_CHARACTERS.contains(Character.toString(chars[i]))) {
                return false;
            }
        }
        return true;
    }

}
