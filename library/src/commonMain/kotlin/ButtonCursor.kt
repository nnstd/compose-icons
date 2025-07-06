package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ButtonCursor: ImageVector
    get() {
        if (_ButtonCursor != null) {
            return _ButtonCursor!!
        }
        _ButtonCursor = ImageVector.Builder(
            name = "ButtonCursor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.1f, 15.3f)
                curveTo(18f, 15.4f, 17.8f, 15.5f, 17.7f, 15.6f)
                lineTo(15.3f, 16f)
                lineTo(17f, 19.6f)
                curveTo(17.2f, 20f, 17f, 20.4f, 16.6f, 20.6f)
                lineTo(13.8f, 21.9f)
                curveTo(13.7f, 22f, 13.6f, 22f, 13.5f, 22f)
                curveTo(13.2f, 22f, 12.9f, 21.8f, 12.8f, 21.6f)
                lineTo(11.2f, 18f)
                lineTo(9.3f, 19.5f)
                curveTo(9.2f, 19.6f, 9f, 19.7f, 8.8f, 19.7f)
                curveTo(8.4f, 19.7f, 8f, 19.4f, 8f, 18.9f)
                verticalLineTo(7.5f)
                curveTo(8f, 7f, 8.3f, 6.7f, 8.8f, 6.7f)
                curveTo(9f, 6.7f, 9.2f, 6.8f, 9.3f, 6.9f)
                lineTo(18f, 14.3f)
                curveTo(18.3f, 14.5f, 18.4f, 15f, 18.1f, 15.3f)
                moveTo(6f, 12f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                horizontalLineTo(18.4f)
                lineTo(20.6f, 13.9f)
                curveTo(21.4f, 13.6f, 21.9f, 12.9f, 21.9f, 12f)
                verticalLineTo(4f)
                curveTo(21.9f, 2.9f, 21f, 2f, 19.9f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                verticalLineTo(12f)
                curveTo(2f, 13.1f, 2.9f, 14f, 4f, 14f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _ButtonCursor!!
    }

@Suppress("ObjectPropertyName")
private var _ButtonCursor: ImageVector? = null
