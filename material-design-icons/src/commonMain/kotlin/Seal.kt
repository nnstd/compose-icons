package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Seal: ImageVector
    get() {
        if (_Seal != null) {
            return _Seal!!
        }
        _Seal = ImageVector.Builder(
            name = "Seal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.39f, 19.37f)
                lineTo(16.38f, 18f)
                lineTo(15f, 22f)
                lineTo(11.92f, 16f)
                lineTo(9f, 22f)
                lineTo(7.62f, 18f)
                lineTo(3.61f, 19.37f)
                lineTo(6.53f, 13.37f)
                curveTo(5.57f, 12.17f, 5f, 10.65f, 5f, 9f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 9f)
                curveTo(19f, 10.65f, 18.43f, 12.17f, 17.47f, 13.37f)
                lineTo(20.39f, 19.37f)
                moveTo(7f, 9f)
                lineTo(9.69f, 10.34f)
                lineTo(9.5f, 13.34f)
                lineTo(12f, 11.68f)
                lineTo(14.5f, 13.33f)
                lineTo(14.33f, 10.34f)
                lineTo(17f, 9f)
                lineTo(14.32f, 7.65f)
                lineTo(14.5f, 4.67f)
                lineTo(12f, 6.31f)
                lineTo(9.5f, 4.65f)
                lineTo(9.67f, 7.66f)
                lineTo(7f, 9f)
                close()
            }
        }.build()

        return _Seal!!
    }

@Suppress("ObjectPropertyName")
private var _Seal: ImageVector? = null
