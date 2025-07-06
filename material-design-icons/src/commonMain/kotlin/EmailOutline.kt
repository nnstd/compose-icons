package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmailOutline: ImageVector
    get() {
        if (_EmailOutline != null) {
            return _EmailOutline!!
        }
        _EmailOutline = ImageVector.Builder(
            name = "EmailOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 6f)
                curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
                horizontalLineTo(4f)
                curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.1f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(20f)
                curveTo(21.1f, 20f, 22f, 19.1f, 22f, 18f)
                verticalLineTo(6f)
                moveTo(20f, 6f)
                lineTo(12f, 11f)
                lineTo(4f, 6f)
                horizontalLineTo(20f)
                moveTo(20f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                lineTo(12f, 13f)
                lineTo(20f, 8f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _EmailOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EmailOutline: ImageVector? = null
