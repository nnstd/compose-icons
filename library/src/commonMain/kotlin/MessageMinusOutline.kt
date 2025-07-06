package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageMinusOutline: ImageVector
    get() {
        if (_MessageMinusOutline != null) {
            return _MessageMinusOutline!!
        }
        _MessageMinusOutline = ImageVector.Builder(
            name = "MessageMinusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                verticalLineTo(22f)
                lineTo(6f, 18f)
                horizontalLineTo(20f)
                curveTo(21.1f, 18f, 22f, 17.1f, 22f, 16f)
                verticalLineTo(4f)
                curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                moveTo(20f, 16f)
                horizontalLineTo(5.2f)
                lineTo(4f, 17.2f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                moveTo(8f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _MessageMinusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MessageMinusOutline: ImageVector? = null
