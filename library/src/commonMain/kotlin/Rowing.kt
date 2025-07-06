package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Rowing: ImageVector
    get() {
        if (_Rowing != null) {
            return _Rowing!!
        }
        _Rowing = ImageVector.Builder(
            name = "Rowing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 14.5f)
                lineTo(4f, 19f)
                lineTo(5.5f, 20.5f)
                lineTo(9f, 17f)
                horizontalLineTo(11f)
                lineTo(8.5f, 14.5f)
                moveTo(15f, 1f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 1f)
                moveTo(21f, 21f)
                lineTo(18f, 24f)
                lineTo(15f, 21f)
                verticalLineTo(19.5f)
                lineTo(7.91f, 12.41f)
                curveTo(7.6f, 12.46f, 7.3f, 12.5f, 7f, 12.5f)
                verticalLineTo(10.32f)
                curveTo(8.66f, 10.35f, 10.61f, 9.45f, 11.67f, 8.28f)
                lineTo(13.07f, 6.73f)
                curveTo(13.26f, 6.5f, 13.5f, 6.35f, 13.76f, 6.23f)
                curveTo(14.05f, 6.09f, 14.38f, 6f, 14.72f, 6f)
                horizontalLineTo(14.75f)
                curveTo(16f, 6f, 17f, 7f, 17f, 8.26f)
                verticalLineTo(14f)
                curveTo(17f, 14.85f, 16.65f, 15.62f, 16.08f, 16.17f)
                lineTo(12.5f, 12.59f)
                verticalLineTo(10.32f)
                curveTo(11.87f, 10.84f, 11.07f, 11.34f, 10.21f, 11.71f)
                lineTo(16.5f, 18f)
                horizontalLineTo(18f)
                lineTo(21f, 21f)
                close()
            }
        }.build()

        return _Rowing!!
    }

@Suppress("ObjectPropertyName")
private var _Rowing: ImageVector? = null
