package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RulerSquareCompass: ImageVector
    get() {
        if (_RulerSquareCompass != null) {
            return _RulerSquareCompass!!
        }
        _RulerSquareCompass = ImageVector.Builder(
            name = "RulerSquareCompass",
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
                arcTo(4.94f, 4.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.19f, 10.83f)
                moveTo(15f, 7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10f)
                arcTo(3.27f, 3.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.56f, 10f)
                lineTo(5.8f, 20.83f)
                lineTo(4f, 22f)
                verticalLineTo(19.88f)
                lineTo(9.79f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 4f)
                verticalLineTo(2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 3f)
                verticalLineTo(4.18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 7f)
                moveTo(13f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 7f)
                moveTo(4.22f, 10f)
                lineTo(6f, 11.8f)
                lineTo(4.56f, 14.56f)
                lineTo(2.1f, 12.1f)
                moveTo(12f, 17.76f)
                lineTo(10.5f, 16.25f)
                lineTo(9f, 19f)
                lineTo(12f, 22f)
                lineTo(15f, 19f)
                lineTo(13.53f, 16.23f)
                moveTo(19.78f, 10f)
                lineTo(18f, 11.8f)
                lineTo(19.5f, 14.56f)
                lineTo(21.9f, 12.1f)
                close()
            }
        }.build()

        return _RulerSquareCompass!!
    }

@Suppress("ObjectPropertyName")
private var _RulerSquareCompass: ImageVector? = null
