package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CircleMultipleOutline: ImageVector
    get() {
        if (_CircleMultipleOutline != null) {
            return _CircleMultipleOutline!!
        }
        _CircleMultipleOutline = ImageVector.Builder(
            name = "CircleMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 4f)
                moveTo(15f, 18f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 6f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 18f)
                moveTo(3f, 12f)
                curveTo(3f, 14.61f, 4.67f, 16.83f, 7f, 17.65f)
                verticalLineTo(19.74f)
                curveTo(3.55f, 18.85f, 1f, 15.73f, 1f, 12f)
                curveTo(1f, 8.27f, 3.55f, 5.15f, 7f, 4.26f)
                verticalLineTo(6.35f)
                curveTo(4.67f, 7.17f, 3f, 9.39f, 3f, 12f)
                close()
            }
        }.build()

        return _CircleMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CircleMultipleOutline: ImageVector? = null
