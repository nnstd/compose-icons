package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageFlashOutline: ImageVector
    get() {
        if (_MessageFlashOutline != null) {
            return _MessageFlashOutline!!
        }
        _MessageFlashOutline = ImageVector.Builder(
            name = "MessageFlashOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 17.2f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(22f)
                verticalLineTo(4f)
                curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                verticalLineTo(22f)
                lineTo(6f, 18f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                horizontalLineTo(5.2f)
                lineTo(4f, 17.2f)
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

        return _MessageFlashOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MessageFlashOutline: ImageVector? = null
