package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapSearch: ImageVector
    get() {
        if (_MapSearch != null) {
            return _MapSearch!!
        }
        _MapSearch = ImageVector.Builder(
            name = "MapSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 12f)
                curveTo(18f, 12f, 20f, 14f, 20f, 16.5f)
                curveTo(20f, 17.38f, 19.75f, 18.21f, 19.31f, 18.9f)
                lineTo(22.39f, 22f)
                lineTo(21f, 23.39f)
                lineTo(17.88f, 20.32f)
                curveTo(17.19f, 20.75f, 16.37f, 21f, 15.5f, 21f)
                curveTo(13f, 21f, 11f, 19f, 11f, 16.5f)
                curveTo(11f, 14f, 13f, 12f, 15.5f, 12f)
                moveTo(15.5f, 14f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 16.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 19f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 16.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 14f)
                moveTo(14f, 6.11f)
                lineTo(8f, 4f)
                verticalLineTo(15.89f)
                lineTo(9f, 16.24f)
                verticalLineTo(16.5f)
                curveTo(9f, 17.14f, 9.09f, 17.76f, 9.26f, 18.34f)
                lineTo(8f, 17.9f)
                lineTo(2.66f, 19.97f)
                lineTo(2.5f, 20f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 19.5f)
                verticalLineTo(4.38f)
                curveTo(2f, 4.15f, 2.15f, 3.97f, 2.36f, 3.9f)
                lineTo(8f, 2f)
                lineTo(14f, 4.1f)
                lineTo(19.34f, 2f)
                horizontalLineTo(19.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 2.5f)
                verticalLineTo(11.81f)
                curveTo(18.83f, 10.69f, 17.25f, 10f, 15.5f, 10f)
                curveTo(15f, 10f, 14.5f, 10.06f, 14f, 10.17f)
                verticalLineTo(6.11f)
                close()
            }
        }.build()

        return _MapSearch!!
    }

@Suppress("ObjectPropertyName")
private var _MapSearch: ImageVector? = null
