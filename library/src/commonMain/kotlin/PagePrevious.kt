package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PagePrevious: ImageVector
    get() {
        if (_PagePrevious != null) {
            return _PagePrevious!!
        }
        _PagePrevious = ImageVector.Builder(
            name = "PagePrevious",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                lineTo(13f, 12f)
                lineTo(17f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 21f)
                moveTo(4f, 15f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                moveTo(4f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                moveTo(4f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                moveTo(21f, 11f)
                horizontalLineTo(24f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _PagePrevious!!
    }

@Suppress("ObjectPropertyName")
private var _PagePrevious: ImageVector? = null
