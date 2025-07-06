package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmailMultipleOutline: ImageVector
    get() {
        if (_EmailMultipleOutline != null) {
            return _EmailMultipleOutline!!
        }
        _EmailMultipleOutline = ImageVector.Builder(
            name = "EmailMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 6f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                curveTo(0.895f, 22f, 0f, 21.11f, 0f, 20f)
                verticalLineTo(6f)
                horizontalLineTo(2f)
                moveTo(24f, 4f)
                curveTo(24f, 2.9f, 23.1f, 2f, 22f, 2f)
                horizontalLineTo(6f)
                curveTo(4.9f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(16f)
                curveTo(4f, 17.1f, 4.9f, 18f, 6f, 18f)
                horizontalLineTo(22f)
                curveTo(23.1f, 18f, 24f, 17.1f, 24f, 16f)
                verticalLineTo(4f)
                moveTo(22f, 4f)
                lineTo(14f, 9f)
                lineTo(6f, 4f)
                horizontalLineTo(22f)
                moveTo(22f, 16f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                lineTo(14f, 11f)
                lineTo(22f, 6f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _EmailMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EmailMultipleOutline: ImageVector? = null
