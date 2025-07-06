package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BottleWine: ImageVector
    get() {
        if (_BottleWine != null) {
            return _BottleWine!!
        }
        _BottleWine = ImageVector.Builder(
            name = "BottleWine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 21f)
                verticalLineTo(11f)
                curveTo(9f, 9f, 10f, 7.25f, 11f, 7f)
                verticalLineTo(2.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 2f)
                horizontalLineTo(12.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 2.5f)
                verticalLineTo(7f)
                curveTo(14f, 7.25f, 15f, 9f, 15f, 11f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 22f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _BottleWine!!
    }

@Suppress("ObjectPropertyName")
private var _BottleWine: ImageVector? = null
