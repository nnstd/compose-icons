package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PageNextOutline: ImageVector
    get() {
        if (_PageNextOutline != null) {
            return _PageNextOutline!!
        }
        _PageNextOutline = ImageVector.Builder(
            name = "PageNextOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 3f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 3f)
                moveTo(7f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(0f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                lineTo(11f, 12f)
                lineTo(7f, 15f)
                moveTo(20f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                moveTo(20f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                moveTo(17f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _PageNextOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PageNextOutline: ImageVector? = null
