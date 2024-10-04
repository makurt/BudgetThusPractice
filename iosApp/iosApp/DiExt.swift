import Foundation
import Shared

extension Di {
   func get<T>(
     for type: T.Type = T.self,
     parameters: [Any] = []
   ) -> T {
     self.get(
       type: type,
       parameters: parameters
     ) as! T
   }
 }
