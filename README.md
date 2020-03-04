# Proj_Euler
 PureFrustration

Task #5 - brute force
```c#
static void Main(string[] args)
        {
            int[] divisions = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14,15,16,17,18,19,20 };
            int subject = 20;
            int result = 0;
            bool done = false;
            int positiveMatch = 0;
            while (!done) {
                foreach(var i in divisions)
                {
                    
                    if ((subject % i) != 0)//reset
                    {

                        positiveMatch = 0;
                        break;
                    }
                    else//continue
                    {
                        positiveMatch++;
                        if (positiveMatch == divisions.Length)
                        {
                            done = true;
                            result = subject;
                        }
                    }
                }
                subject++;
            }

            Console.WriteLine(result);
            Console.ReadLine();
        }
    }
```

===Sum Prime C#===
```C#
class Program
    {
        static void Main(string[] args)
        {
            var input = Convert.ToInt32(Console.ReadLine());

            bool[] primes = new bool[input + 1];
            Array.Fill(primes, true);

            for (int i = 2; i*i < input; i++)
            {
                if (primes[i])
                {
                    for (int j = i*i; j < input; j+=i)
                    {
                        //Console.WriteLine(j);
                        primes[j] = false;
                    }
                }
            }

            List<int> primeNumbers = new List<int>();
            for (int i = 2; i < input; i++)
            {
                if (primes[i])
                {
                    primeNumbers.Add(i);
                }
            }
            //Console.WriteLine($"{string.Join(", ", primeNumbers)}");

            long sum = 0;
            foreach (var item in primeNumbers)
            {
                sum += item;
            }
            Console.WriteLine(sum);

            Console.ReadLine();
        }
    }
    ```
