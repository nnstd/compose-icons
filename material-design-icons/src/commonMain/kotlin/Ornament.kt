package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Ornament: ImageVector
    get() {
        if (_Ornament != null) {
            return _Ornament!!
        }
        _Ornament = ImageVector.Builder(
            name = "Ornament",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 4f)
                verticalLineTo(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 6f)
                verticalLineTo(7.07f)
                curveTo(18.39f, 8.45f, 20f, 11.04f, 20f, 14f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 14f)
                curveTo(4f, 11.04f, 5.61f, 8.45f, 8f, 7.07f)
                verticalLineTo(6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 5f)
                verticalLineTo(4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 1f)
                moveTo(12f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 4f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                moveTo(12f, 8f)
                curveTo(10.22f, 8f, 8.63f, 8.77f, 7.53f, 10f)
                horizontalLineTo(16.47f)
                curveTo(15.37f, 8.77f, 13.78f, 8f, 12f, 8f)
                moveTo(6.34f, 16f)
                horizontalLineTo(7.59f)
                lineTo(6f, 14.43f)
                curveTo(6.05f, 15f, 6.17f, 15.5f, 6.34f, 16f)
                moveTo(12.59f, 16f)
                lineTo(8.59f, 12f)
                horizontalLineTo(6.41f)
                lineTo(10.41f, 16f)
                horizontalLineTo(12.59f)
                moveTo(17.66f, 12f)
                horizontalLineTo(16.41f)
                lineTo(18f, 13.57f)
                curveTo(17.95f, 13f, 17.83f, 12.5f, 17.66f, 12f)
                moveTo(11.41f, 12f)
                lineTo(15.41f, 16f)
                horizontalLineTo(17.59f)
                lineTo(13.59f, 12f)
                horizontalLineTo(11.41f)
                moveTo(12f, 20f)
                curveTo(13.78f, 20f, 15.37f, 19.23f, 16.47f, 18f)
                horizontalLineTo(7.53f)
                curveTo(8.63f, 19.23f, 10.22f, 20f, 12f, 20f)
                close()
            }
        }.build()

        return _Ornament!!
    }

@Suppress("ObjectPropertyName")
private var _Ornament: ImageVector? = null
