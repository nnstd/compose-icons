package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RssBox: ImageVector
    get() {
        if (_RssBox != null) {
            return _RssBox!!
        }
        _RssBox = ImageVector.Builder(
            name = "RssBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                moveTo(7.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 18f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 15f)
                moveTo(6f, 10f)
                verticalLineTo(12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 18f)
                horizontalLineTo(14f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 10f)
                moveTo(6f, 6f)
                verticalLineTo(8f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 18f)
                horizontalLineTo(18f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 6f)
                close()
            }
        }.build()

        return _RssBox!!
    }

@Suppress("ObjectPropertyName")
private var _RssBox: ImageVector? = null
