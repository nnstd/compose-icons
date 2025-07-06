package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VectorCircleVariant: ImageVector
    get() {
        if (_VectorCircleVariant != null) {
            return _VectorCircleVariant!!
        }
        _VectorCircleVariant = ImageVector.Builder(
            name = "VectorCircleVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 9f)
                horizontalLineTo(19.97f)
                curveTo(18.7f, 5.41f, 15.31f, 3f, 11.5f, 3f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 12f)
                curveTo(2.5f, 17f, 6.53f, 21f, 11.5f, 21f)
                curveTo(15.31f, 21f, 18.7f, 18.6f, 20f, 15f)
                horizontalLineTo(22f)
                moveTo(20f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                moveTo(17.82f, 15f)
                curveTo(16.66f, 17.44f, 14.2f, 19f, 11.5f, 19f)
                curveTo(7.64f, 19f, 4.5f, 15.87f, 4.5f, 12f)
                curveTo(4.5f, 8.14f, 7.64f, 5f, 11.5f, 5f)
                curveTo(14.2f, 5f, 16.66f, 6.57f, 17.81f, 9f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
            }
        }.build()

        return _VectorCircleVariant!!
    }

@Suppress("ObjectPropertyName")
private var _VectorCircleVariant: ImageVector? = null
