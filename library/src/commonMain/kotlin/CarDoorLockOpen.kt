package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarDoorLockOpen: ImageVector
    get() {
        if (_CarDoorLockOpen != null) {
            return _CarDoorLockOpen!!
        }
        _CarDoorLockOpen = ImageVector.Builder(
            name = "CarDoorLockOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 21f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                curveTo(11f, 15.26f, 10.6f, 14.61f, 10f, 14.26f)
                curveTo(10f, 14.18f, 10f, 14.09f, 10f, 14f)
                curveTo(10f, 12.87f, 9.63f, 11.84f, 9f, 11f)
                horizontalLineTo(20f)
                verticalLineTo(5f)
                horizontalLineTo(11.83f)
                lineTo(7.28f, 9.55f)
                curveTo(6.6f, 9.2f, 5.82f, 9f, 5f, 9f)
                lineTo(11f, 3f)
                horizontalLineTo(21f)
                curveTo(21.27f, 3f, 21.5f, 3.11f, 21.71f, 3.29f)
                curveTo(21.9f, 3.5f, 22f, 3.74f, 22f, 4f)
                verticalLineTo(21f)
                moveTo(19f, 14f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                horizontalLineTo(19f)
                verticalLineTo(14f)
                moveTo(7.8f, 16f)
                horizontalLineTo(3.5f)
                verticalLineTo(13.5f)
                curveTo(3.5f, 12.7f, 4.2f, 12.2f, 5f, 12.2f)
                curveTo(5.8f, 12.2f, 6.5f, 12.7f, 6.5f, 13.5f)
                verticalLineTo(14f)
                horizontalLineTo(7.8f)
                verticalLineTo(13.5f)
                curveTo(7.8f, 12.1f, 6.4f, 11f, 5f, 11f)
                curveTo(3.6f, 11f, 2.2f, 12.1f, 2.2f, 13.5f)
                verticalLineTo(16f)
                curveTo(1.6f, 16f, 1f, 16.6f, 1f, 17.2f)
                verticalLineTo(20.7f)
                curveTo(1f, 21.4f, 1.6f, 22f, 2.2f, 22f)
                horizontalLineTo(7.7f)
                curveTo(8.4f, 22f, 9f, 21.4f, 9f, 20.8f)
                verticalLineTo(17.3f)
                curveTo(9f, 16.6f, 8.4f, 16f, 7.8f, 16f)
                close()
            }
        }.build()

        return _CarDoorLockOpen!!
    }

@Suppress("ObjectPropertyName")
private var _CarDoorLockOpen: ImageVector? = null
