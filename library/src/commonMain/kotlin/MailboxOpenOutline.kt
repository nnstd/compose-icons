package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MailboxOpenOutline: ImageVector
    get() {
        if (_MailboxOpenOutline != null) {
            return _MailboxOpenOutline!!
        }
        _MailboxOpenOutline = ImageVector.Builder(
            name = "MailboxOpenOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 11f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                moveTo(18f, 4f)
                horizontalLineTo(8f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 9f)
                verticalLineTo(18f)
                horizontalLineTo(1f)
                verticalLineTo(20f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 18f)
                verticalLineTo(9f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 4f)
                moveTo(11f, 18f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 9f)
                verticalLineTo(18f)
                moveTo(21f, 18f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                curveTo(13f, 7.92f, 12.65f, 6.86f, 12f, 6f)
                horizontalLineTo(18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 9f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _MailboxOpenOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MailboxOpenOutline: ImageVector? = null
