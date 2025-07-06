package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DoorClosedCancel: ImageVector
    get() {
        if (_DoorClosedCancel != null) {
            return _DoorClosedCancel!!
        }
        _DoorClosedCancel = ImageVector.Builder(
            name = "DoorClosedCancel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 11f)
                curveTo(9f, 11f, 11f, 9f, 11f, 6.5f)
                curveTo(11f, 4f, 9f, 2f, 6.5f, 2f)
                curveTo(4f, 2f, 2f, 4f, 2f, 6.5f)
                curveTo(2f, 9f, 4f, 11f, 6.5f, 11f)
                moveTo(3.92f, 5f)
                lineTo(8f, 9.09f)
                curveTo(7.58f, 9.35f, 7.06f, 9.5f, 6.5f, 9.5f)
                curveTo(4.84f, 9.5f, 3.5f, 8.16f, 3.5f, 6.5f)
                curveTo(3.5f, 5.94f, 3.65f, 5.42f, 3.92f, 5f)
                moveTo(9.5f, 6.5f)
                curveTo(9.5f, 7.06f, 9.35f, 7.58f, 9.09f, 8f)
                lineTo(5f, 3.92f)
                curveTo(5.42f, 3.65f, 5.94f, 3.5f, 6.5f, 3.5f)
                curveTo(8.16f, 3.5f, 9.5f, 4.84f, 9.5f, 6.5f)
                moveTo(10f, 12f)
                curveTo(10.81f, 11.46f, 11.5f, 10.77f, 12f, 9.97f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(12.83f)
                curveTo(12.66f, 4.28f, 12.37f, 3.61f, 12f, 3f)
                horizontalLineTo(19f)
                curveTo(20.11f, 3f, 21f, 3.89f, 21f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(21f)
                horizontalLineTo(2f)
                verticalLineTo(19f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                moveTo(16f, 11f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _DoorClosedCancel!!
    }

@Suppress("ObjectPropertyName")
private var _DoorClosedCancel: ImageVector? = null
