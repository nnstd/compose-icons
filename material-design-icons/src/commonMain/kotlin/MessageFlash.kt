package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageFlash: ImageVector
    get() {
        if (_MessageFlash != null) {
            return _MessageFlash!!
        }
        _MessageFlash = ImageVector.Builder(
            name = "MessageFlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 4f)
                curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                verticalLineTo(22f)
                lineTo(6f, 18f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                horizontalLineTo(22f)
                verticalLineTo(4f)
                moveTo(22.5f, 16f)
                horizontalLineTo(20.3f)
                lineTo(22f, 12f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                verticalLineTo(23f)
                lineTo(22.5f, 16f)
                close()
            }
        }.build()

        return _MessageFlash!!
    }

@Suppress("ObjectPropertyName")
private var _MessageFlash: ImageVector? = null
