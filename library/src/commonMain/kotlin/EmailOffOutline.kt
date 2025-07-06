package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmailOffOutline: ImageVector
    get() {
        if (_EmailOffOutline != null) {
            return _EmailOffOutline!!
        }
        _EmailOffOutline = ImageVector.Builder(
            name = "EmailOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(2.6f, 4.5f)
                curveTo(2.3f, 4.9f, 2f, 5.4f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.1f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(18.1f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(4f, 18f)
                verticalLineTo(8f)
                lineTo(9.6f, 11.5f)
                lineTo(16.1f, 18f)
                horizontalLineTo(4f)
                moveTo(9.2f, 6f)
                lineTo(7.2f, 4f)
                horizontalLineTo(20f)
                curveTo(21.1f, 4f, 22f, 4.9f, 22f, 6f)
                verticalLineTo(18f)
                curveTo(22f, 18.2f, 22f, 18.5f, 21.9f, 18.7f)
                lineTo(20f, 16.8f)
                verticalLineTo(8f)
                lineTo(14.6f, 11.4f)
                lineTo(13.4f, 10.2f)
                lineTo(20f, 6f)
                horizontalLineTo(9.2f)
                close()
            }
        }.build()

        return _EmailOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EmailOffOutline: ImageVector? = null
