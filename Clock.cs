using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace buoi_4
{
    public delegate void SecondHandler(object o, TimeEventArgs e);
    public class Clock
    {
        

        public event SecondHandler OnSecondchange;
        public void run()
        {
            while (true)
            {
                Thread.Sleep(1000);// chayj theo don vi 1000ms.
                if(OnSecondchange != null)
                {
                    OnSecondchange(this, new TimeEventArgs(DateTime.Now));
                }

            }
        }
    }
}
