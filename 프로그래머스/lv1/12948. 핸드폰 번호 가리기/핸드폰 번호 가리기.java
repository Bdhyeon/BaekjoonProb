class Solution {
    public String solution(String phone_number) {
        for(int i=0; i<phone_number.length()-4; i++){
            phone_number = phone_number.replaceFirst(String.valueOf(phone_number.charAt(i)), "*");
        }
        return phone_number;
    }
}