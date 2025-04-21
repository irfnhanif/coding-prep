def longestCommonPrefix(strs):
    res = ""
    for i in range(len(strs[0])):
        for str in strs:
            if i < len(str):
                if str[i] != strs[0][i]:
                    return res
            else:
                return res
        res += strs[0][i]
    return res

print(longestCommonPrefix(["ab","a"]))