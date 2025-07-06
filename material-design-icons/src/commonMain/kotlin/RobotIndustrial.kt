package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RobotIndustrial: ImageVector
    get() {
        if (_RobotIndustrial != null) {
            return _RobotIndustrial!!
        }
        _RobotIndustrial = ImageVector.Builder(
            name = "RobotIndustrial",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.41f, 4f)
                lineTo(16f, 6.41f)
                verticalLineTo(6.59f)
                lineTo(18.41f, 9f)
                horizontalLineTo(22f)
                verticalLineTo(11f)
                horizontalLineTo(17.59f)
                lineTo(16f, 9.41f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 10f)
                verticalLineTo(7.5f)
                horizontalLineTo(9.86f)
                curveTo(9.77f, 7.87f, 9.62f, 8.22f, 9.42f, 8.55f)
                lineTo(15.18f, 19f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 19f)
                horizontalLineTo(10.61f)
                lineTo(5.92f, 10.5f)
                curveTo(4.12f, 10.47f, 2.56f, 9.24f, 2.11f, 7.5f)
                curveTo(1.56f, 5.36f, 2.85f, 3.18f, 5f, 2.63f)
                curveTo(7.13f, 2.08f, 9.31f, 3.36f, 9.86f, 5.5f)
                horizontalLineTo(13f)
                verticalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 1f)
                horizontalLineTo(16f)
                verticalLineTo(3.59f)
                lineTo(17.59f, 2f)
                horizontalLineTo(22f)
                verticalLineTo(4f)
                horizontalLineTo(18.41f)
                moveTo(6f, 4.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 6.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 8.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 6.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 4.5f)
                close()
            }
        }.build()

        return _RobotIndustrial!!
    }

@Suppress("ObjectPropertyName")
private var _RobotIndustrial: ImageVector? = null
