package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RobotMower: ImageVector
    get() {
        if (_RobotMower != null) {
            return _RobotMower!!
        }
        _RobotMower = ImageVector.Builder(
            name = "RobotMower",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 14f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                curveTo(18.5f, 5f, 23f, 9.5f, 23f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(20.83f)
                curveTo(20.42f, 18.17f, 19.31f, 19f, 18f, 19f)
                curveTo(16.69f, 19f, 15.58f, 18.17f, 15.17f, 17f)
                horizontalLineTo(10f)
                curveTo(9.09f, 18.21f, 7.64f, 19f, 6f, 19f)
                curveTo(3.24f, 19f, 1f, 16.76f, 1f, 14f)
                moveTo(6f, 11f)
                curveTo(4.34f, 11f, 3f, 12.34f, 3f, 14f)
                curveTo(3f, 15.66f, 4.34f, 17f, 6f, 17f)
                curveTo(7.66f, 17f, 9f, 15.66f, 9f, 14f)
                curveTo(9f, 12.34f, 7.66f, 11f, 6f, 11f)
                moveTo(15f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(20.25f)
                curveTo(19.92f, 11.27f, 19.5f, 10.6f, 19f, 10f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _RobotMower!!
    }

@Suppress("ObjectPropertyName")
private var _RobotMower: ImageVector? = null
