def groupAnagrams(strs):
    am = {}

    for w in strs:
        sw = "".join(sorted(w))
        if sw in am:
            am[sw].append(w)
        else:
            am[sw] = [w]

    return list(am.values())