package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RobotVacuum: ImageVector
    get() {
        if (_RobotVacuum != null) {
            return _RobotVacuum!!
        }
        _RobotVacuum = ImageVector.Builder(
            name = "RobotVacuum",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(14.65f, 2f, 17.19f, 3.06f, 19.07f, 4.93f)
                lineTo(17.65f, 6.35f)
                curveTo(16.15f, 4.85f, 14.12f, 4f, 12f, 4f)
                curveTo(9.88f, 4f, 7.84f, 4.84f, 6.35f, 6.35f)
                lineTo(4.93f, 4.93f)
                curveTo(6.81f, 3.06f, 9.35f, 2f, 12f, 2f)
                moveTo(3.66f, 6.5f)
                lineTo(5.11f, 7.94f)
                curveTo(4.39f, 9.17f, 4f, 10.57f, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                curveTo(20f, 10.57f, 19.61f, 9.17f, 18.88f, 7.94f)
                lineTo(20.34f, 6.5f)
                curveTo(21.42f, 8.12f, 22f, 10.04f, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                curveTo(2f, 10.04f, 2.58f, 8.12f, 3.66f, 6.5f)
                moveTo(12f, 6f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 12f)
                curveTo(18f, 13.59f, 17.37f, 15.12f, 16.24f, 16.24f)
                lineTo(14.83f, 14.83f)
                curveTo(14.08f, 15.58f, 13.06f, 16f, 12f, 16f)
                curveTo(10.94f, 16f, 9.92f, 15.58f, 9.17f, 14.83f)
                lineTo(7.76f, 16.24f)
                curveTo(6.63f, 15.12f, 6f, 13.59f, 6f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                moveTo(12f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8f)
                close()
            }
        }.build()

        return _RobotVacuum!!
    }

@Suppress("ObjectPropertyName")
private var _RobotVacuum: ImageVector? = null
