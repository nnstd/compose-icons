package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChevronLeftBoxOutline: ImageVector
    get() {
        if (_ChevronLeftBoxOutline != null) {
            return _ChevronLeftBoxOutline!!
        }
        _ChevronLeftBoxOutline = ImageVector.Builder(
            name = "ChevronLeftBoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                moveTo(15.71f, 7.41f)
                lineTo(11.12f, 12f)
                lineTo(15.71f, 16.59f)
                lineTo(14.29f, 18f)
                lineTo(8.29f, 12f)
                lineTo(14.29f, 6f)
                lineTo(15.71f, 7.41f)
                close()
            }
        }.build()

        return _ChevronLeftBoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronLeftBoxOutline: ImageVector? = null
