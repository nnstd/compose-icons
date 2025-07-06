package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Handball: ImageVector
    get() {
        if (_Handball != null) {
            return _Handball!!
        }
        _Handball = ImageVector.Builder(
            name = "Handball",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.83f, 10.43f)
                arcTo(6.93f, 6.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.39f, 14.86f)
                arcTo(6.64f, 6.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 19.5f)
                lineTo(15.78f, 18.5f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.44f, 16f)
                arcTo(5.22f, 5.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.46f, 13.06f)
                lineTo(9.18f, 23.93f)
                lineTo(7.44f, 22.95f)
                lineTo(10.44f, 17.75f)
                lineTo(8.71f, 16.76f)
                lineTo(7.21f, 19.34f)
                lineTo(5.5f, 18.36f)
                lineTo(10.63f, 9.45f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.8f, 5.46f)
                arcTo(6.91f, 6.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.69f, 1.1f)
                lineTo(11.43f, 2.13f)
                arcTo(4.84f, 4.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.91f, 5.9f)
                arcTo(4.74f, 4.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.21f, 8.93f)
                moveTo(16f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 18f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 5f)
                moveTo(13.5f, 1f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 15f, 2.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 1f)
                close()
            }
        }.build()

        return _Handball!!
    }

@Suppress("ObjectPropertyName")
private var _Handball: ImageVector? = null
