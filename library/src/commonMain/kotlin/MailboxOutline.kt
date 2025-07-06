package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MailboxOutline: ImageVector
    get() {
        if (_MailboxOutline != null) {
            return _MailboxOutline!!
        }
        _MailboxOutline = ImageVector.Builder(
            name = "MailboxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 4f)
                horizontalLineTo(7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 18f)
                verticalLineTo(9f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 4f)
                moveTo(10f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 9f)
                verticalLineTo(18f)
                moveTo(20f, 18f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                curveTo(12f, 7.92f, 11.65f, 6.86f, 11f, 6f)
                horizontalLineTo(17f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 9f)
                verticalLineTo(18f)
                moveTo(13f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                moveTo(9f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _MailboxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MailboxOutline: ImageVector? = null
