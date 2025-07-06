package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MailboxOpenUpOutline: ImageVector
    get() {
        if (_MailboxOpenUpOutline != null) {
            return _MailboxOpenUpOutline!!
        }
        _MailboxOpenUpOutline = ImageVector.Builder(
            name = "MailboxOpenUpOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 12.85f)
                verticalLineTo(6.85f)
                horizontalLineTo(18f)
                verticalLineTo(8.85f)
                horizontalLineTo(16f)
                verticalLineTo(12.85f)
                horizontalLineTo(14f)
                moveTo(18f, 3.85f)
                horizontalLineTo(8f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 8.85f)
                verticalLineTo(17.85f)
                horizontalLineTo(1f)
                verticalLineTo(19.85f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 17.85f)
                verticalLineTo(8.85f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 3.85f)
                moveTo(11f, 17.85f)
                horizontalLineTo(5f)
                verticalLineTo(8.85f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 5.85f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 8.85f)
                verticalLineTo(17.85f)
                moveTo(21f, 17.85f)
                horizontalLineTo(13f)
                verticalLineTo(8.85f)
                curveTo(13f, 7.76f, 12.65f, 6.71f, 12f, 5.85f)
                horizontalLineTo(18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 8.85f)
                verticalLineTo(17.85f)
                close()
            }
        }.build()

        return _MailboxOpenUpOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MailboxOpenUpOutline: ImageVector? = null
