using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace buoi_4
{
    public class TimeEventArgs : EventArgs
    {
        public DateTime t { get; set; }
        public TimeEventArgs(DateTime d)
        {
            t = d;
        }
    }
}
