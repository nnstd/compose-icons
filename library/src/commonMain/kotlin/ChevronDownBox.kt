package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChevronDownBox: ImageVector
    get() {
        if (_ChevronDownBox != null) {
            return _ChevronDownBox!!
        }
        _ChevronDownBox = ImageVector.Builder(
            name = "ChevronDownBox",
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
                moveTo(12f, 15.71f)
                lineTo(6f, 9.71f)
                lineTo(7.41f, 8.29f)
                lineTo(12f, 12.88f)
                lineTo(16.59f, 8.29f)
                lineTo(18f, 9.71f)
                lineTo(12f, 15.71f)
                close()
            }
        }.build()

        return _ChevronDownBox!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronDownBox: ImageVector? = null
