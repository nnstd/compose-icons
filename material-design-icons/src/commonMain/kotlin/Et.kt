package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Et: ImageVector
    get() {
        if (_Et != null) {
            return _Et!!
        }
        _Et = ImageVector.Builder(
            name = "Et",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 8.78f)
                lineTo(21.71f, 7.22f)
                curveTo(21.45f, 7.42f, 20.53f, 8f, 19.77f, 8f)
                curveTo(19.26f, 8f, 18.3f, 7.75f, 17.45f, 7.53f)
                curveTo(16.39f, 7.26f, 15.39f, 7f, 14.6f, 7f)
                curveTo(14f, 7f, 13.43f, 7.15f, 12.93f, 7.35f)
                curveTo(12.62f, 5.45f, 11f, 4f, 9f, 4f)
                curveTo(4.58f, 4f, 2f, 7.58f, 2f, 12f)
                curveTo(2f, 16.42f, 5.58f, 19f, 10f, 19f)
                curveTo(12.06f, 19f, 13.93f, 18.43f, 15.34f, 17.39f)
                lineTo(15f, 21.29f)
                lineTo(17f, 21.47f)
                lineTo(18f, 9.74f)
                curveTo(18.66f, 9.89f, 19.27f, 10f, 19.77f, 10f)
                curveTo(21.38f, 10f, 22.84f, 8.91f, 23f, 8.78f)
                moveTo(9f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 10f)
                horizontalLineTo(4.23f)
                curveTo(4.8f, 7.67f, 6.39f, 6f, 9f, 6f)
                moveTo(10f, 17f)
                curveTo(6.69f, 17f, 4f, 15.31f, 4f, 12f)
                horizontalLineTo(9f)
                curveTo(10.6f, 12f, 11.83f, 11.17f, 12.5f, 9.91f)
                verticalLineTo(9.91f)
                curveTo(12.76f, 9.71f, 13.85f, 9f, 14.6f, 9f)
                curveTo(14.94f, 9f, 15.5f, 9.11f, 16.05f, 9.25f)
                lineTo(15.65f, 13.89f)
                curveTo(14.82f, 15.95f, 12.6f, 17f, 10f, 17f)
                close()
            }
        }.build()

        return _Et!!
    }

@Suppress("ObjectPropertyName")
private var _Et: ImageVector? = null
