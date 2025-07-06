package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmoticonTongue: ImageVector
    get() {
        if (_EmoticonTongue != null) {
            return _EmoticonTongue!!
        }
        _EmoticonTongue = ImageVector.Builder(
            name = "EmoticonTongue",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(7.27f, 11f)
                curveTo(7.1f, 10.71f, 7f, 10.36f, 7f, 10f)
                curveTo(7f, 8.89f, 7.89f, 8f, 9f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 10f)
                curveTo(11f, 10.36f, 10.9f, 10.71f, 10.73f, 11f)
                curveTo(10.39f, 10.4f, 9.74f, 10f, 9f, 10f)
                curveTo(8.26f, 10f, 7.61f, 10.4f, 7.27f, 11f)
                moveTo(16f, 15f)
                horizontalLineTo(15f)
                curveTo(15f, 17f, 14.1f, 18f, 13f, 18f)
                curveTo(11.9f, 18f, 11f, 17f, 11f, 15f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                moveTo(16.73f, 11f)
                curveTo(16.39f, 10.4f, 15.74f, 10f, 15f, 10f)
                curveTo(14.26f, 10f, 13.61f, 10.4f, 13.27f, 11f)
                curveTo(13.1f, 10.71f, 13f, 10.36f, 13f, 10f)
                curveTo(13f, 8.89f, 13.89f, 8f, 15f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 10f)
                curveTo(17f, 10.36f, 16.9f, 10.71f, 16.73f, 11f)
                close()
            }
        }.build()

        return _EmoticonTongue!!
    }

@Suppress("ObjectPropertyName")
private var _EmoticonTongue: ImageVector? = null
