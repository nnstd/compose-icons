package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Duck: ImageVector
    get() {
        if (_Duck != null) {
            return _Duck!!
        }
        _Duck = ImageVector.Builder(
            name = "Duck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 6.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 8f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 6.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 5f)
                moveTo(10f, 2f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 7f)
                curveTo(15f, 8.7f, 14.15f, 10.2f, 12.86f, 11.1f)
                curveTo(14.44f, 11.25f, 16.22f, 11.61f, 18f, 12.5f)
                curveTo(21f, 14f, 22f, 12f, 22f, 12f)
                curveTo(22f, 12f, 21f, 21f, 15f, 21f)
                horizontalLineTo(9f)
                curveTo(9f, 21f, 4f, 21f, 4f, 16f)
                curveTo(4f, 13f, 7f, 12f, 6f, 10f)
                curveTo(2f, 10f, 2f, 6.5f, 2f, 6.5f)
                curveTo(3f, 7f, 4.24f, 7f, 5f, 6.65f)
                curveTo(5.19f, 4.05f, 7.36f, 2f, 10f, 2f)
                close()
            }
        }.build()

        return _Duck!!
    }

@Suppress("ObjectPropertyName")
private var _Duck: ImageVector? = null
