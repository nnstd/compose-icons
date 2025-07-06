package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PenLock: ImageVector
    get() {
        if (_PenLock != null) {
            return _PenLock!!
        }
        _PenLock = ImageVector.Builder(
            name = "PenLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.7f, 7f)
                curveTo(21.4f, 7.4f, 21f, 7.7f, 21f, 8f)
                curveTo(21f, 8.3f, 21.3f, 8.6f, 21.6f, 9f)
                curveTo(22.1f, 9.5f, 22.6f, 9.9f, 22.5f, 10.4f)
                curveTo(22.5f, 10.9f, 22f, 11.4f, 21.5f, 11.9f)
                lineTo(17.4f, 16f)
                lineTo(16f, 14.7f)
                lineTo(20.2f, 10.5f)
                lineTo(19.2f, 9.5f)
                lineTo(17.8f, 10.9f)
                lineTo(14f, 7.1f)
                lineTo(18f, 3.3f)
                curveTo(18.4f, 2.9f, 19f, 2.9f, 19.4f, 3.3f)
                lineTo(21.7f, 5.6f)
                curveTo(22.1f, 6f, 22.1f, 6.7f, 21.7f, 7f)
                moveTo(4f, 17.2f)
                lineTo(13.6f, 7.6f)
                lineTo(17.3f, 11.4f)
                lineTo(7.8f, 21f)
                horizontalLineTo(4f)
                verticalLineTo(17.2f)
                moveTo(8f, 5f)
                verticalLineTo(4.5f)
                curveTo(8f, 3.1f, 6.9f, 2f, 5.5f, 2f)
                curveTo(4.1f, 2f, 3f, 3.1f, 3f, 4.5f)
                verticalLineTo(5f)
                curveTo(2.4f, 5f, 2f, 5.4f, 2f, 6f)
                verticalLineTo(10f)
                curveTo(2f, 10.6f, 2.4f, 11f, 3f, 11f)
                horizontalLineTo(8f)
                curveTo(8.6f, 11f, 9f, 10.6f, 9f, 10f)
                verticalLineTo(6f)
                curveTo(9f, 5.4f, 8.6f, 5f, 8f, 5f)
                moveTo(7f, 5f)
                horizontalLineTo(4f)
                verticalLineTo(4.5f)
                curveTo(4f, 3.7f, 4.7f, 3f, 5.5f, 3f)
                curveTo(6.3f, 3f, 7f, 3.7f, 7f, 4.5f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _PenLock!!
    }

@Suppress("ObjectPropertyName")
private var _PenLock: ImageVector? = null
