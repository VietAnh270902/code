using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace buoi_4
{
    public class AnaLogClock
    {
        public void ShowAC(object o, TimeEventArgs e)
        {
            DateTime d = DateTime.Now;
            Console.WriteLine("AC: {0}:{1}:{2}:{3}", e.t.Hour, e.t.Minute, e.t.Second, e.t.Millisecond);
        }
    }
}
