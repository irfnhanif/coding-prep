def encode(strs):
    return "$".join(strs)

def decode(s: str):
    return list(s.split("$"))