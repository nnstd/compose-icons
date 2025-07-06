package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CheckboxMultipleBlankCircleOutline: ImageVector
    get() {
        if (_CheckboxMultipleBlankCircleOutline != null) {
            return _CheckboxMultipleBlankCircleOutline!!
        }
        _CheckboxMultipleBlankCircleOutline = ImageVector.Builder(
            name = "CheckboxMultipleBlankCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 10f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 18f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 10f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 2f)
                moveTo(14f, 4f)
                curveTo(17.32f, 4f, 20f, 6.69f, 20f, 10f)
                curveTo(20f, 13.32f, 17.32f, 16f, 14f, 16f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 10f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 4f)
                moveTo(4.93f, 5.82f)
                curveTo(3.08f, 7.34f, 2f, 9.61f, 2f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 20f)
                curveTo(10.64f, 20f, 11.27f, 19.92f, 11.88f, 19.77f)
                curveTo(10.12f, 19.38f, 8.5f, 18.5f, 7.17f, 17.29f)
                curveTo(5.22f, 16.25f, 4f, 14.21f, 4f, 12f)
                curveTo(4f, 11.7f, 4.03f, 11.41f, 4.07f, 11.11f)
                curveTo(4.03f, 10.74f, 4f, 10.37f, 4f, 10f)
                curveTo(4f, 8.56f, 4.32f, 7.13f, 4.93f, 5.82f)
                close()
            }
        }.build()

        return _CheckboxMultipleBlankCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CheckboxMultipleBlankCircleOutline: ImageVector? = null
