package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MathCompass: ImageVector
    get() {
        if (_MathCompass != null) {
            return _MathCompass!!
        }
        _MathCompass = ImageVector.Builder(
            name = "MathCompass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 19.88f)
                verticalLineTo(22f)
                lineTo(18.2f, 20.83f)
                lineTo(13.41f, 11.83f)
                curveTo(14.07f, 11.62f, 14.67f, 11.28f, 15.19f, 10.83f)
                lineTo(20f, 19.88f)
                moveTo(15f, 7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10f)
                curveTo(11.85f, 10f, 11.71f, 10f, 11.56f, 10f)
                lineTo(5.8f, 20.83f)
                lineTo(4f, 22f)
                verticalLineTo(19.88f)
                lineTo(9.79f, 9f)
                curveTo(8.69f, 7.77f, 8.79f, 5.87f, 10.03f, 4.76f)
                curveTo(10.57f, 4.28f, 11.27f, 4f, 12f, 4f)
                verticalLineTo(2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 3f)
                verticalLineTo(4.18f)
                curveTo(14.2f, 4.6f, 15f, 5.73f, 15f, 7f)
                moveTo(13f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 7f)
                close()
            }
        }.build()

        return _MathCompass!!
    }

@Suppress("ObjectPropertyName")
private var _MathCompass: ImageVector? = null
