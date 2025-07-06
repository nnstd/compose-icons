package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookmarkMultiple: ImageVector
    get() {
        if (_BookmarkMultiple != null) {
            return _BookmarkMultiple!!
        }
        _BookmarkMultiple = ImageVector.Builder(
            name = "BookmarkMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 7f)
                verticalLineTo(23f)
                lineTo(10f, 20f)
                lineTo(3f, 23f)
                verticalLineTo(7f)
                curveTo(3f, 5.89f, 3.9f, 5f, 5f, 5f)
                horizontalLineTo(15f)
                moveTo(9f, 1f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 3f)
                verticalLineTo(19f)
                lineTo(19f, 18.13f)
                verticalLineTo(3f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 1f)
                close()
            }
        }.build()

        return _BookmarkMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkMultiple: ImageVector? = null
