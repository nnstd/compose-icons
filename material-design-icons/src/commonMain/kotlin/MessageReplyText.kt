package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageReplyText: ImageVector
    get() {
        if (_MessageReplyText != null) {
            return _MessageReplyText!!
        }
        _MessageReplyText = ImageVector.Builder(
            name = "MessageReplyText",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 8f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                moveTo(18f, 11f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                moveTo(18f, 14f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                moveTo(22f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 2f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 18f)
                horizontalLineTo(18f)
                lineTo(22f, 22f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _MessageReplyText!!
    }

@Suppress("ObjectPropertyName")
private var _MessageReplyText: ImageVector? = null
