package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RobotExcited: ImageVector
    get() {
        if (_RobotExcited != null) {
            return _RobotExcited!!
        }
        _RobotExcited = ImageVector.Builder(
            name = "RobotExcited",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 14f)
                horizontalLineTo(21f)
                curveTo(21f, 10.13f, 17.87f, 7f, 14f, 7f)
                horizontalLineTo(13f)
                verticalLineTo(5.73f)
                curveTo(13.6f, 5.39f, 14f, 4.74f, 14f, 4f)
                curveTo(14f, 2.9f, 13.11f, 2f, 12f, 2f)
                reflectiveCurveTo(10f, 2.9f, 10f, 4f)
                curveTo(10f, 4.74f, 10.4f, 5.39f, 11f, 5.73f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                curveTo(6.13f, 7f, 3f, 10.13f, 3f, 14f)
                horizontalLineTo(2f)
                curveTo(1.45f, 14f, 1f, 14.45f, 1f, 15f)
                verticalLineTo(18f)
                curveTo(1f, 18.55f, 1.45f, 19f, 2f, 19f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                curveTo(3f, 21.11f, 3.9f, 22f, 5f, 22f)
                horizontalLineTo(19f)
                curveTo(20.11f, 22f, 21f, 21.11f, 21f, 20f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                curveTo(22.55f, 19f, 23f, 18.55f, 23f, 18f)
                verticalLineTo(15f)
                curveTo(23f, 14.45f, 22.55f, 14f, 22f, 14f)
                moveTo(8.68f, 17.04f)
                lineTo(7.5f, 15.86f)
                lineTo(6.32f, 17.04f)
                lineTo(5.14f, 15.86f)
                lineTo(7.5f, 13.5f)
                lineTo(9.86f, 15.86f)
                lineTo(8.68f, 17.04f)
                moveTo(17.68f, 17.04f)
                lineTo(16.5f, 15.86f)
                lineTo(15.32f, 17.04f)
                lineTo(14.14f, 15.86f)
                lineTo(16.5f, 13.5f)
                lineTo(18.86f, 15.86f)
                lineTo(17.68f, 17.04f)
                close()
            }
        }.build()

        return _RobotExcited!!
    }

@Suppress("ObjectPropertyName")
private var _RobotExcited: ImageVector? = null
