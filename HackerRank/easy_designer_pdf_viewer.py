def designerPdfViewer(h, word):
    ad = {chr(i): h[i-97] for i in range(97, 123)}
    return max(ad[char] for char in word) * len(word)

        