package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MailboxOpen: ImageVector
    get() {
        if (_MailboxOpen != null) {
            return _MailboxOpen!!
        }
        _MailboxOpen = ImageVector.Builder(
            name = "MailboxOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 4f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 9f)
                verticalLineTo(18f)
                horizontalLineTo(1f)
                verticalLineTo(20f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 18f)
                verticalLineTo(9f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 4f)
                horizontalLineTo(8f)
                moveTo(8f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 9f)
                verticalLineTo(18f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 6f)
                moveTo(14f, 11f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _MailboxOpen!!
    }

@Suppress("ObjectPropertyName")
private var _MailboxOpen: ImageVector? = null
