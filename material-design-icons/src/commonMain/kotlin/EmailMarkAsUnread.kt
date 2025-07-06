package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmailMarkAsUnread: ImageVector
    get() {
        if (_EmailMarkAsUnread != null) {
            return _EmailMarkAsUnread!!
        }
        _EmailMarkAsUnread = ImageVector.Builder(
            name = "EmailMarkAsUnread",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.84f, 7f)
                horizontalLineTo(16.22f)
                lineTo(10.5f, 4f)
                lineTo(4f, 7.41f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 15f)
                verticalLineTo(7.17f)
                curveTo(2f, 6.5f, 2.28f, 6.06f, 2.81f, 5.81f)
                lineTo(10.5f, 2f)
                lineTo(18.05f, 5.81f)
                curveTo(18.5f, 6.09f, 18.78f, 6.5f, 18.84f, 7f)
                moveTo(7f, 8f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 10f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 21f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 19f)
                verticalLineTo(10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 8f)
                moveTo(20f, 11.67f)
                verticalLineTo(10f)
                lineTo(13.5f, 13.31f)
                lineTo(7f, 10f)
                verticalLineTo(11.67f)
                lineTo(13.5f, 15f)
                lineTo(20f, 11.67f)
                close()
            }
        }.build()

        return _EmailMarkAsUnread!!
    }

@Suppress("ObjectPropertyName")
private var _EmailMarkAsUnread: ImageVector? = null
