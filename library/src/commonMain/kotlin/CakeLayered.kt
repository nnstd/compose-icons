package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CakeLayered: ImageVector
    get() {
        if (_CakeLayered != null) {
            return _CakeLayered!!
        }
        _CakeLayered = ImageVector.Builder(
            name = "CakeLayered",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 21f)
                verticalLineTo(17f)
                curveTo(21f, 15.89f, 20.1f, 15f, 19f, 15f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                curveTo(18f, 10.89f, 17.1f, 10f, 16f, 10f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                curveTo(6.89f, 10f, 6f, 10.89f, 6f, 12f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                curveTo(3.89f, 15f, 3f, 15.89f, 3f, 17f)
                verticalLineTo(21f)
                horizontalLineTo(1f)
                verticalLineTo(23f)
                horizontalLineTo(23f)
                verticalLineTo(21f)
                moveTo(12f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 5f)
                curveTo(14f, 4.62f, 13.9f, 4.27f, 13.71f, 3.97f)
                lineTo(12f, 1f)
                lineTo(10.28f, 3.97f)
                curveTo(10.1f, 4.27f, 10f, 4.62f, 10f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7f)
                close()
            }
        }.build()

        return _CakeLayered!!
    }

@Suppress("ObjectPropertyName")
private var _CakeLayered: ImageVector? = null
