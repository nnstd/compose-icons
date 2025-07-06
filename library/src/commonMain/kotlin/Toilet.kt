package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Toilet: ImageVector
    get() {
        if (_Toilet != null) {
            return _Toilet!!
        }
        _Toilet = ImageVector.Builder(
            name = "Toilet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 22f)
                horizontalLineTo(17f)
                verticalLineTo(19.5f)
                curveTo(19.41f, 17.87f, 21f, 15.12f, 21f, 12f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 2f)
                horizontalLineTo(15f)
                curveTo(13.89f, 2f, 13f, 2.9f, 13f, 4f)
                verticalLineTo(12f)
                horizontalLineTo(3f)
                curveTo(3f, 15.09f, 5f, 18f, 9f, 19.5f)
                verticalLineTo(22f)
                moveTo(5.29f, 14f)
                horizontalLineTo(18.71f)
                curveTo(18.14f, 15.91f, 16.77f, 17.5f, 15f, 18.33f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(18.33f)
                curveTo(9f, 18f, 5.86f, 15.91f, 5.29f, 14f)
                moveTo(15f, 4f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                moveTo(16f, 5f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _Toilet!!
    }

@Suppress("ObjectPropertyName")
private var _Toilet: ImageVector? = null
