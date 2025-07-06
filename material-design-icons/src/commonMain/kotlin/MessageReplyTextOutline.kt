package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageReplyTextOutline: ImageVector
    get() {
        if (_MessageReplyTextOutline != null) {
            return _MessageReplyTextOutline!!
        }
        _MessageReplyTextOutline = ImageVector.Builder(
            name = "MessageReplyTextOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 11f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                moveTo(18f, 7f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                moveTo(22f, 4f)
                verticalLineTo(22f)
                lineTo(18f, 18f)
                horizontalLineTo(4f)
                curveTo(2.9f, 18f, 2f, 17.11f, 2f, 16f)
                verticalLineTo(4f)
                curveTo(2f, 2.9f, 2.9f, 2f, 4f, 2f)
                horizontalLineTo(20f)
                curveTo(21.1f, 2f, 22f, 2.89f, 22f, 4f)
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                horizontalLineTo(18.83f)
                lineTo(20f, 17.17f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _MessageReplyTextOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MessageReplyTextOutline: ImageVector? = null
