using System;

public class Solution {
    public string solution(string s, string skip, int index) 
    {
        char[] _StringArray = s.ToCharArray();
        char[] _StrSkipArray = skip.ToCharArray();

        ChangeValue(ref _StringArray, _StrSkipArray, index);

        return new string(_StringArray);
    }

    private void ChangeValue(ref char[] _strArray, char[] strSkipArray, int Index)
    {
        for (int i = 0; i < _strArray.Length; ++i)
            {
                for (int j = 0; j < Index; ++j)
                {
                    char CopyValue = _strArray[i];

                    CopyValue += (char)1;

                    if (CopyValue > 'z')
                        CopyValue = 'a';

                    for (int k = 0; k < strSkipArray.Length; ++k)
                    {
                        if (CopyValue == strSkipArray[k])
                        {
                            CopyValue += (char)1;

                            if (CopyValue > 'z')
                                CopyValue = 'a';
                            k = -1;
                        }
                    }

                    _strArray[i] = CopyValue;
                }
            } 
    }
}