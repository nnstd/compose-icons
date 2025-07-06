package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PinwheelOutline: ImageVector
    get() {
        if (_PinwheelOutline != null) {
            return _PinwheelOutline!!
        }
        _PinwheelOutline = ImageVector.Builder(
            name = "PinwheelOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 23f)
                horizontalLineTo(11f)
                verticalLineTo(16.43f)
                curveTo(9.93f, 17.4f, 8.5f, 18f, 7f, 18f)
                curveTo(3.75f, 18f, 1f, 15.25f, 1f, 12f)
                verticalLineTo(11f)
                horizontalLineTo(7.57f)
                curveTo(6.6f, 9.93f, 6f, 8.5f, 6f, 7f)
                curveTo(6f, 3.75f, 8.75f, 1f, 12f, 1f)
                horizontalLineTo(13f)
                verticalLineTo(7.57f)
                curveTo(14.07f, 6.6f, 15.5f, 6f, 17f, 6f)
                curveTo(20.25f, 6f, 23f, 8.75f, 23f, 12f)
                verticalLineTo(13f)
                horizontalLineTo(16.43f)
                curveTo(17.4f, 14.07f, 18f, 15.5f, 18f, 17f)
                curveTo(18f, 20.25f, 15.25f, 23f, 12f, 23f)
                moveTo(13f, 13.13f)
                verticalLineTo(20.87f)
                curveTo(14.7f, 20.41f, 16f, 18.83f, 16f, 17f)
                curveTo(16f, 15.17f, 14.7f, 13.59f, 13f, 13.13f)
                moveTo(3.13f, 13f)
                curveTo(3.59f, 14.7f, 5.17f, 16f, 7f, 16f)
                curveTo(8.83f, 16f, 10.41f, 14.7f, 10.87f, 13f)
                horizontalLineTo(3.13f)
                moveTo(13.13f, 11f)
                horizontalLineTo(20.87f)
                curveTo(20.41f, 9.3f, 18.82f, 8f, 17f, 8f)
                curveTo(15.18f, 8f, 13.59f, 9.3f, 13.13f, 11f)
                moveTo(11f, 3.13f)
                curveTo(9.3f, 3.59f, 8f, 5.18f, 8f, 7f)
                curveTo(8f, 8.82f, 9.3f, 10.41f, 11f, 10.87f)
                verticalLineTo(3.13f)
                close()
            }
        }.build()

        return _PinwheelOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PinwheelOutline: ImageVector? = null
