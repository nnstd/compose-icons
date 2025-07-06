package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarDoorLock: ImageVector
    get() {
        if (_CarDoorLock != null) {
            return _CarDoorLock!!
        }
        _CarDoorLock = ImageVector.Builder(
            name = "CarDoorLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.8f, 17f)
                verticalLineTo(15.5f)
                curveTo(7.8f, 14.1f, 6.4f, 13f, 5f, 13f)
                reflectiveCurveTo(2.2f, 14.1f, 2.2f, 15.5f)
                verticalLineTo(17f)
                curveTo(1.6f, 17f, 1f, 17.6f, 1f, 18.2f)
                verticalLineTo(21.7f)
                curveTo(1f, 22.4f, 1.6f, 23f, 2.2f, 23f)
                horizontalLineTo(7.7f)
                curveTo(8.4f, 23f, 9f, 22.4f, 9f, 21.8f)
                verticalLineTo(18.3f)
                curveTo(9f, 17.6f, 8.4f, 17f, 7.8f, 17f)
                moveTo(6.5f, 17f)
                horizontalLineTo(3.5f)
                verticalLineTo(15.5f)
                curveTo(3.5f, 14.7f, 4.2f, 14.2f, 5f, 14.2f)
                reflectiveCurveTo(6.5f, 14.7f, 6.5f, 15.5f)
                verticalLineTo(17f)
                moveTo(21f, 3f)
                horizontalLineTo(11f)
                lineTo(3f, 11f)
                verticalLineTo(11.44f)
                curveTo(3.61f, 11.17f, 4.29f, 11f, 5f, 11f)
                curveTo(7.6f, 11f, 9.8f, 13.06f, 9.8f, 15.5f)
                verticalLineTo(15.75f)
                curveTo(10.53f, 16.36f, 11f, 17.28f, 11f, 18.3f)
                verticalLineTo(21f)
                horizontalLineTo(22f)
                verticalLineTo(4f)
                curveTo(22f, 3.45f, 21.55f, 3f, 21f, 3f)
                moveTo(19f, 16f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                moveTo(20f, 11f)
                horizontalLineTo(5.83f)
                lineTo(11.83f, 5f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _CarDoorLock!!
    }

@Suppress("ObjectPropertyName")
private var _CarDoorLock: ImageVector? = null
