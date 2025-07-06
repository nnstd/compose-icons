package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Shower: ImageVector
    get() {
        if (_Shower != null) {
            return _Shower!!
        }
        _Shower = ImageVector.Builder(
            name = "Shower",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 14f)
                verticalLineTo(15f)
                curveTo(21f, 16.91f, 19.93f, 18.57f, 18.35f, 19.41f)
                lineTo(19f, 22f)
                horizontalLineTo(17f)
                lineTo(16.5f, 20f)
                curveTo(16.33f, 20f, 16.17f, 20f, 16f, 20f)
                horizontalLineTo(8f)
                curveTo(7.83f, 20f, 7.67f, 20f, 7.5f, 20f)
                lineTo(7f, 22f)
                horizontalLineTo(5f)
                lineTo(5.65f, 19.41f)
                curveTo(4.07f, 18.57f, 3f, 16.91f, 3f, 15f)
                verticalLineTo(14f)
                horizontalLineTo(2f)
                verticalLineTo(12f)
                horizontalLineTo(20f)
                verticalLineTo(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 4f)
                curveTo(18.5f, 4f, 18.12f, 4.34f, 18f, 4.79f)
                curveTo(18.63f, 5.33f, 19f, 6.13f, 19f, 7f)
                horizontalLineTo(13f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 4f)
                curveTo(16.06f, 4f, 16.11f, 4f, 16.17f, 4f)
                curveTo(16.58f, 2.84f, 17.69f, 2f, 19f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 5f)
                verticalLineTo(14f)
                horizontalLineTo(21f)
                verticalLineTo(14f)
                moveTo(19f, 14f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 18f)
                horizontalLineTo(16f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 15f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _Shower!!
    }

@Suppress("ObjectPropertyName")
private var _Shower: ImageVector? = null
