package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MailboxUp: ImageVector
    get() {
        if (_MailboxUp != null) {
            return _MailboxUp!!
        }
        _MailboxUp = ImageVector.Builder(
            name = "MailboxUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 9f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                moveTo(22f, 9f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20f)
                horizontalLineTo(2f)
                verticalLineTo(9f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 4f)
                horizontalLineTo(17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 9f)
                moveTo(10f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 9f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                moveTo(16f, 7f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _MailboxUp!!
    }

@Suppress("ObjectPropertyName")
private var _MailboxUp: ImageVector? = null
