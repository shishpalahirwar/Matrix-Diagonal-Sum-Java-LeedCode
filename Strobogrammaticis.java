class Solution {
  public boolean Strobogrammaticis(String num) {
    final char[] rotated = {'0', '1', 'n', 'n', 'n', 'n', '9', 'n', '8', '6'};
    int l = 0;
    int r = num.length() - 1;

    while (l <= r)
      if (num.charAt(l++) != rotated[num.charAt(r--) - '0'])
        return false;

    return true;
  }
}
