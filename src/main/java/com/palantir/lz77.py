class LZ77():
    """ Author: Nick Balkissoon 4/28/17
        LZ77 compression """

    def compress(self, stream):
        compressionDict = {}
        index = 0

        try:
            while stream[index]:

                # current character in stream
                char = stream[index]

                # add a new set (empty) of patterns if this is the first time seeing this character
                if char not in compressionDict:
                    compressionDict[char] = []

                # enumerate through all patterns for this character
                for j, pattern in enumerate(compressionDict[char]):

                    # properties of this pattern
                    startingIndex = pattern[0]
                    offset = pattern[1]
                    occurences = pattern[2]

                    # if this is the second occurence in any new pattern
                    if occurences == 1 and char:
                        offset = index - startingIndex
                        occurences = 2
                        compressionDict[char][j] = (startingIndex, offset, occurences)

                        # mark this character as "compressed" (i.e. part of a pattern)
                        char = None
                        break

                    # if this is part of an existing pattern
                    if startingIndex + offset * (occurences) == index and char:
                        occurences+=1
                        # add this occurence to the pattern, and continue
                        compressionDict[char][j] = (startingIndex, offset, occurences)
                        char = None
                        break

                if char:
                    # create a new pattern with new starting point and unkown offset (will be determined next time we see this character)
                    pattern = (index, None, 1)
                    compressionDict[char].append(pattern)
                    char = None

                index+=1

        except:
            return compressionDict


lz77 = LZ77()
print lz77.compress("abababababcdcdcdcdcdcyrrrrryrrrrry")