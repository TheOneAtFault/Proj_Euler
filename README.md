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
