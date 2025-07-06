package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageReplyOutline: ImageVector
    get() {
        if (_MessageReplyOutline != null) {
            return _MessageReplyOutline!!
        }
        _MessageReplyOutline = ImageVector.Builder(
            name = "MessageReplyOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                verticalLineTo(16f)
                curveTo(2f, 17.1f, 2.9f, 18f, 4f, 18f)
                horizontalLineTo(18f)
                lineTo(22f, 22f)
                verticalLineTo(4f)
                curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                moveTo(20f, 17.2f)
                lineTo(18.8f, 16f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(17.2f)
                close()
            }
        }.build()

        return _MessageReplyOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MessageReplyOutline: ImageVector? = null
