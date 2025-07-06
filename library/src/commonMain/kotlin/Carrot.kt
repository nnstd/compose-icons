package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Carrot: ImageVector
    get() {
        if (_Carrot != null) {
            return _Carrot!!
        }
        _Carrot = ImageVector.Builder(
            name = "Carrot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 10f)
                lineTo(15.8f, 11f)
                horizontalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 11.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 12f)
                horizontalLineTo(15.6f)
                lineTo(14.6f, 17f)
                horizontalLineTo(12.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 18f)
                horizontalLineTo(14.4f)
                lineTo(14f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 20f)
                lineTo(9f, 15f)
                horizontalLineTo(10.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 14.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 14f)
                horizontalLineTo(8.8f)
                lineTo(8f, 10f)
                curveTo(8f, 8.8f, 8.93f, 7.77f, 10.29f, 7.29f)
                lineTo(8.9f, 5.28f)
                curveTo(8.59f, 4.82f, 8.7f, 4.2f, 9.16f, 3.89f)
                curveTo(9.61f, 3.57f, 10.23f, 3.69f, 10.55f, 4.14f)
                lineTo(11f, 4.8f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 3f)
                verticalLineTo(5.28f)
                lineTo(14.5f, 3.54f)
                curveTo(14.83f, 3.12f, 15.47f, 3.07f, 15.89f, 3.43f)
                curveTo(16.31f, 3.78f, 16.36f, 4.41f, 16f, 4.84f)
                lineTo(13.87f, 7.35f)
                curveTo(15.14f, 7.85f, 16f, 8.85f, 16f, 10f)
                close()
            }
        }.build()

        return _Carrot!!
    }

@Suppress("ObjectPropertyName")
private var _Carrot: ImageVector? = null
