package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmoticonExcitedOutline: ImageVector
    get() {
        if (_EmoticonExcitedOutline != null) {
            return _EmoticonExcitedOutline!!
        }
        _EmoticonExcitedOutline = ImageVector.Builder(
            name = "EmoticonExcitedOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(6.47f, 2f, 2f, 6.47f, 2f, 12f)
                curveTo(2f, 17.53f, 6.47f, 22f, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                curveTo(22f, 6.47f, 17.5f, 2f, 12f, 2f)
                moveTo(12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                moveTo(13f, 9.94f)
                lineTo(14.06f, 11f)
                lineTo(15.12f, 9.94f)
                lineTo(16.18f, 11f)
                lineTo(17.24f, 9.94f)
                lineTo(15.12f, 7.82f)
                lineTo(13f, 9.94f)
                moveTo(8.88f, 9.94f)
                lineTo(9.94f, 11f)
                lineTo(11f, 9.94f)
                lineTo(8.88f, 7.82f)
                lineTo(6.76f, 9.94f)
                lineTo(7.82f, 11f)
                lineTo(8.88f, 9.94f)
                moveTo(12f, 17.5f)
                curveTo(14.33f, 17.5f, 16.31f, 16.04f, 17.11f, 14f)
                horizontalLineTo(6.89f)
                curveTo(7.69f, 16.04f, 9.67f, 17.5f, 12f, 17.5f)
                close()
            }
        }.build()

        return _EmoticonExcitedOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EmoticonExcitedOutline: ImageVector? = null
