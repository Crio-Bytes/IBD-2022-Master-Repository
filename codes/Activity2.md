# Activity 2 Solution

## CPP Solution

> ```cpp
> // Function to find a pair in an array with a given sum using hashing
> void findPair(int nums[], int n, int target) {
>   // create an empty map
>    unordered_map<int, int> map;
>
>    // do for each element
>    for (int i = 0; i < n; i++) {
>        // check if pair (nums[i], target - nums[i]) exists
>
>        // if the difference is seen before, print the pair
>        if (map.find(target - nums[i]) != map.end()) {
>            cout << "Pair found (" << nums[map[target - nums[i]]] << ", "
>                 << nums[i] << ")\n";
>            return;
>        }
>
>        // store index of the current element in the map
>        map[nums[i]] = i;
>    }
>
>    // we reach here if the pair is not found
>    cout << "Pair not found";
>
> }
> ```

## Java Soltuon

> ```java
> public static void findPair(int[] nums, int target) {
>       // create an empty HashMap
>       Map<Integer, Integer> map = new HashMap<>();
>
>       // do for each element
>       for (int i = 0; i < nums.length; i++) {
>            // check if pair (nums[i], target-nums[i]) exists
>
>            // if the difference is seen before, print the pair
>            if (map.containsKey(target - nums[i])){
>                System.out.printf("Pair found (%d, %d)",
>                    nums[map.get(target - nums[i])], nums[i]);
>                return;
>            }
>
>            // store index of the current element in the map
>            map.put(nums[i], i);
>        }
>
>        // we reach here if the pair is not found
>        System.out.println("Pair not found");
>        return ;
> }
>
> ```

## Python solution

> ```python
> def findPair(nums, target):
>
>    # create an empty dictionary
>    d = {}
>
>    # do for each element
>    for i, e in enumerate(nums):
>
>        # check if pair (e, target - e) exists
>
>        # if the difference is seen before, print the pair
>        if target - e in d:
>            print('Pair found', (nums[d.get(target - e)], nums[i]))
>            return
>
>        # store index of the current element in the dictionary
>        d[e] = i
>
>    # No pair with the given sum exists in the list
>    print('Pair not found')
> ```
