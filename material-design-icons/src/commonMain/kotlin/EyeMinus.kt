package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EyeMinus: ImageVector
    get() {
        if (_EyeMinus != null) {
            return _EyeMinus!!
        }
        _EyeMinus = ImageVector.Builder(
            name = "EyeMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4.5f)
                arcTo(11.8f, 11.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 12f)
                arcTo(11.8f, 11.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 19.5f)
                horizontalLineTo(13.1f)
                arcTo(3.8f, 3.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 18.5f)
                arcTo(9.9f, 9.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.2f, 16.8f)
                lineTo(12f, 17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 17f, 12f)
                arcTo(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.9f, 12.9f)
                arcTo(5.2f, 5.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 12.5f)
                arcTo(5.6f, 5.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.3f, 13.5f)
                arcTo(10.1f, 10.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 12f)
                arcTo(11.8f, 11.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4.5f)
                moveTo(12f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 15f, 12f)
                arcTo(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                moveTo(15f, 17.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(23f)
                verticalLineTo(17.5f)
                close()
            }
        }.build()

        return _EyeMinus!!
    }

@Suppress("ObjectPropertyName")
private var _EyeMinus: ImageVector? = null
