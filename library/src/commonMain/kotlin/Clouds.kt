package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Clouds: ImageVector
    get() {
        if (_Clouds != null) {
            return _Clouds!!
        }
        _Clouds = ImageVector.Builder(
            name = "Clouds",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.19f, 12.07f)
                curveTo(19.69f, 11.54f, 20f, 10.82f, 20f, 10f)
                curveTo(20f, 8.3f, 18.7f, 6.84f, 17f, 6.84f)
                horizontalLineTo(14.2f)
                curveTo(14.2f, 4.17f, 12.03f, 2f, 9.36f, 2f)
                curveTo(7.31f, 2f, 5.56f, 3.28f, 4.85f, 5.08f)
                curveTo(2.72f, 5.14f, 1f, 6.89f, 1f, 9.04f)
                curveTo(1f, 11.22f, 2.78f, 13f, 4.96f, 13f)
                horizontalLineTo(8.1f)
                curveTo(8.04f, 13.33f, 8f, 13.66f, 8f, 14f)
                horizontalLineTo(7.5f)
                curveTo(5.57f, 14f, 4f, 15.57f, 4f, 17.5f)
                reflectiveCurveTo(5.57f, 21f, 7.5f, 21f)
                horizontalLineTo(18.5f)
                curveTo(21f, 21f, 23f, 19f, 23f, 16.5f)
                curveTo(23f, 14.26f, 21.34f, 12.41f, 19.19f, 12.07f)
                moveTo(18.5f, 19f)
                horizontalLineTo(7.5f)
                curveTo(6.67f, 19f, 6f, 18.33f, 6f, 17.5f)
                reflectiveCurveTo(6.67f, 16f, 7.5f, 16f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                curveTo(10f, 12.07f, 11.57f, 10.5f, 13.5f, 10.5f)
                reflectiveCurveTo(17f, 12.07f, 17f, 14f)
                horizontalLineTo(18.5f)
                curveTo(19.88f, 14f, 21f, 15.12f, 21f, 16.5f)
                reflectiveCurveTo(19.88f, 19f, 18.5f, 19f)
                close()
            }
        }.build()

        return _Clouds!!
    }

@Suppress("ObjectPropertyName")
private var _Clouds: ImageVector? = null
