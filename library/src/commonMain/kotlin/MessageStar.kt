package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageStar: ImageVector
    get() {
        if (_MessageStar != null) {
            return _MessageStar!!
        }
        _MessageStar = ImageVector.Builder(
            name = "MessageStar",
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
                moveTo(14.6f, 14f)
                lineTo(12f, 12.4f)
                lineTo(9.4f, 14f)
                lineTo(10.1f, 11f)
                lineTo(7.8f, 9f)
                lineTo(10.8f, 8.7f)
                lineTo(12f, 6f)
                lineTo(13.2f, 8.8f)
                lineTo(16.2f, 9.1f)
                lineTo(13.9f, 11.1f)
                lineTo(14.6f, 14f)
                close()
            }
        }.build()

        return _MessageStar!!
    }

@Suppress("ObjectPropertyName")
private var _MessageStar: ImageVector? = null
