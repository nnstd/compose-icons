package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CoatRack: ImageVector
    get() {
        if (_CoatRack != null) {
            return _CoatRack!!
        }
        _CoatRack = ImageVector.Builder(
            name = "CoatRack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.33f, 7.78f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.66f, 8.89f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 13f, 10f)
                verticalLineTo(7.82f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11f, 7.82f)
                verticalLineTo(10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.34f, 8.89f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.67f, 7.78f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 13.46f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 22f)
                horizontalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 20f)
                verticalLineTo(13.46f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.33f, 7.78f)
                moveTo(12f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 4f)
                close()
            }
        }.build()

        return _CoatRack!!
    }

@Suppress("ObjectPropertyName")
private var _CoatRack: ImageVector? = null
