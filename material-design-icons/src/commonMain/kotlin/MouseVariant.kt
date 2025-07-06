package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MouseVariant: ImageVector
    get() {
        if (_MouseVariant != null) {
            return _MouseVariant!!
        }
        _MouseVariant = ImageVector.Builder(
            name = "MouseVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 7f)
                horizontalLineTo(10f)
                verticalLineTo(2.1f)
                curveTo(12.28f, 2.56f, 14f, 4.58f, 14f, 7f)
                moveTo(4f, 7f)
                curveTo(4f, 4.58f, 5.72f, 2.56f, 8f, 2.1f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                moveTo(14f, 12f)
                curveTo(14f, 14.42f, 12.28f, 16.44f, 10f, 16.9f)
                verticalLineTo(18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 21f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 18f)
                verticalLineTo(13f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 9f)
                horizontalLineTo(22f)
                lineTo(21f, 10f)
                lineTo(22f, 11f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 13f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 23f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 18f)
                verticalLineTo(16.9f)
                curveTo(5.72f, 16.44f, 4f, 14.42f, 4f, 12f)
                verticalLineTo(9f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _MouseVariant!!
    }

@Suppress("ObjectPropertyName")
private var _MouseVariant: ImageVector? = null
