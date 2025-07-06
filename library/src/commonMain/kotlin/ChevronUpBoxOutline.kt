package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChevronUpBoxOutline: ImageVector
    get() {
        if (_ChevronUpBoxOutline != null) {
            return _ChevronUpBoxOutline!!
        }
        _ChevronUpBoxOutline = ImageVector.Builder(
            name = "ChevronUpBoxOutline",
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
                moveTo(16.59f, 15.71f)
                lineTo(12f, 11.12f)
                lineTo(7.41f, 15.71f)
                lineTo(6f, 14.29f)
                lineTo(12f, 8.29f)
                lineTo(18f, 14.29f)
                lineTo(16.59f, 15.71f)
                close()
            }
        }.build()

        return _ChevronUpBoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronUpBoxOutline: ImageVector? = null
