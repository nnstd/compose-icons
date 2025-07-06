package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookmarkMultipleOutline: ImageVector
    get() {
        if (_BookmarkMultipleOutline != null) {
            return _BookmarkMultipleOutline!!
        }
        _BookmarkMultipleOutline = ImageVector.Builder(
            name = "BookmarkMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 1f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 3f)
                verticalLineTo(19f)
                lineTo(19f, 18.13f)
                verticalLineTo(3f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 1f)
                moveTo(15f, 20f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                lineTo(10f, 17.82f)
                lineTo(15f, 20f)
                moveTo(15f, 5f)
                curveTo(16.11f, 5f, 17f, 5.9f, 17f, 7f)
                verticalLineTo(23f)
                lineTo(10f, 20f)
                lineTo(3f, 23f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 5f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _BookmarkMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkMultipleOutline: ImageVector? = null
