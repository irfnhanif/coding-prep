def groupAnagrams(strs): 
    ga = {}

    for str in strs:
        sorted_str = "".join(sorted(str))
        if sorted_str not in ga:
            ga[sorted_str] = [str]
        else:
            ga[sorted_str].append(str)

    return list(ga.values())
        
print(groupAnagrams(["eat","tea","tan","ate","nat","bat"]))