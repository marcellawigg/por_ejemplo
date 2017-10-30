class VowelReplacement {
    public static void main (String[] args) {
        vowelReplacement("The world is too much with us; late and soon", "-=,.^^^^^^^^///");
    }

    public static void vowelReplacement(String origString, String replacementString) {
        String outputString = "";
        for (int i = 0; i < origString.length(); i++) {
            char capitalizedLetter = Character.toUpperCase(origString.charAt(i));
            if (capitalizedLetter == 'A' | capitalizedLetter == 'E' | capitalizedLetter == 'I' | capitalizedLetter == 'O' | capitalizedLetter == 'U') {
                outputString += replacementString.substring(0,1);
                replacementString = replacementString.substring(1);   
            } else {
                outputString += origString.substring(i, i+1);
            }
        }
        System.out.println(outputString);
    }
}