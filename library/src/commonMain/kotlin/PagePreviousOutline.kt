package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PagePreviousOutline: ImageVector
    get() {
        if (_PagePreviousOutline != null) {
            return _PagePreviousOutline!!
        }
        _PagePreviousOutline = ImageVector.Builder(
            name = "PagePreviousOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(2f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 3f)
                moveTo(17f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(24f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                lineTo(13f, 12f)
                lineTo(17f, 15f)
                moveTo(4f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                moveTo(4f, 9f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                moveTo(4f, 17f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _PagePreviousOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PagePreviousOutline: ImageVector? = null
