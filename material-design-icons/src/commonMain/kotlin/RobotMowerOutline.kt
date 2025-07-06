package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RobotMowerOutline: ImageVector
    get() {
        if (_RobotMowerOutline != null) {
            return _RobotMowerOutline!!
        }
        _RobotMowerOutline = ImageVector.Builder(
            name = "RobotMowerOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 14f)
                curveTo(1f, 16.76f, 3.24f, 19f, 6f, 19f)
                curveTo(7.64f, 19f, 9.09f, 18.21f, 10f, 17f)
                horizontalLineTo(15.17f)
                curveTo(15.58f, 18.17f, 16.7f, 19f, 18f, 19f)
                curveTo(19.31f, 19f, 20.42f, 18.17f, 20.83f, 17f)
                horizontalLineTo(23f)
                verticalLineTo(15f)
                curveTo(23f, 9.5f, 18.5f, 5f, 13f, 5f)
                horizontalLineTo(1f)
                verticalLineTo(14f)
                moveTo(21f, 15f)
                horizontalLineTo(10.9f)
                curveTo(10.97f, 14.68f, 11f, 14.34f, 11f, 14f)
                curveTo(11f, 11.24f, 8.76f, 9f, 6f, 9f)
                curveTo(4.87f, 9f, 3.84f, 9.37f, 3f, 10f)
                verticalLineTo(7f)
                horizontalLineTo(12.5f)
                curveTo(15.1f, 7f, 17.42f, 8.16f, 19f, 10f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                horizontalLineTo(20.25f)
                curveTo(20.67f, 12.92f, 20.92f, 13.94f, 21f, 15f)
                moveTo(6f, 11f)
                curveTo(7.66f, 11f, 9f, 12.34f, 9f, 14f)
                curveTo(9f, 15.66f, 7.66f, 17f, 6f, 17f)
                curveTo(4.34f, 17f, 3f, 15.66f, 3f, 14f)
                curveTo(3f, 12.34f, 4.34f, 11f, 6f, 11f)
                close()
            }
        }.build()

        return _RobotMowerOutline!!
    }

@Suppress("ObjectPropertyName")
private var _RobotMowerOutline: ImageVector? = null
