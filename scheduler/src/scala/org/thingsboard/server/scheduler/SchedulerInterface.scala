package scala.org.thingsboard.server.scheduler

import java.util.UUID


trait SchedulingTask {
  val repeatStrategy: RepeatStrategy
  val failOverStrategy: TaskFailOverStrategy
  val taskTypeName: String
}


trait TaskManager {
  def createSchedulingTask(repeatStrategy: RepeatStrategy,
                           failOverStrategy: TaskFailOverStrategy,
                           taskTypeName: String ): UUID

  def cancelTask(taskId: UUID)
}


trait RepeatStrategy {}

case class ConstantTimeRepeatStrategy(startTime: Long, repeatingInterval: Long) extends RepeatStrategy

object TaskDrivenRepeatStrategy extends RepeatStrategy


trait TaskFailOverStrategy

object SkipOnFailStrategy extends  TaskFailOverStrategy

case class ReTryOnFailOverStrategy(attempts: Int, retryInterval: Long) extends TaskFailOverStrategy


trait TaskScheduler {

  def createTask(task: SchedulingTask): UUID

  def cancelTask(taskId: UUID)

  def loadState(): Unit

}


trait Task {
  def run(): Unit
}
