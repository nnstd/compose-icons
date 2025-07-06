package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Tsunami: ImageVector
    get() {
        if (_Tsunami != null) {
            return _Tsunami!!
        }
        _Tsunami = ImageVector.Builder(
            name = "Tsunami",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.67f, 17.63f)
                curveTo(14.87f, 20.43f, 12.55f, 18.03f, 12f, 17.63f)
                curveTo(11.34f, 18.12f, 9.08f, 20.39f, 5.33f, 17.63f)
                curveTo(3.43f, 19.03f, 2.65f, 19f, 2f, 19f)
                verticalLineTo(21f)
                curveTo(3.16f, 21f, 4.3f, 20.68f, 5.33f, 20.07f)
                curveTo(7.39f, 21.29f, 9.94f, 21.29f, 12f, 20.07f)
                curveTo(14.06f, 21.29f, 16.61f, 21.29f, 18.67f, 20.07f)
                curveTo(19.7f, 20.68f, 20.84f, 21f, 22f, 21f)
                verticalLineTo(19f)
                curveTo(21.34f, 19f, 20.5f, 19f, 18.67f, 17.63f)
                moveTo(19.33f, 12f)
                horizontalLineTo(22f)
                verticalLineTo(10f)
                horizontalLineTo(19.33f)
                curveTo(17.5f, 10f, 16f, 8.5f, 16f, 6.67f)
                curveTo(16f, 5.65f, 16.38f, 4.93f, 17.09f, 3.33f)
                curveTo(15.72f, 3.12f, 15.09f, 3f, 14f, 3f)
                curveTo(7.36f, 3f, 2.15f, 8.03f, 2f, 14.5f)
                lineTo(2f, 16.5f)
                curveTo(3.16f, 16.5f, 4.3f, 16.18f, 5.33f, 15.57f)
                curveTo(7.39f, 16.79f, 9.94f, 16.79f, 12f, 15.57f)
                curveTo(14.06f, 16.79f, 16.61f, 16.79f, 18.67f, 15.57f)
                curveTo(19.7f, 16.18f, 20.84f, 16.5f, 22f, 16.5f)
                verticalLineTo(14.5f)
                curveTo(21.34f, 14.5f, 20.5f, 14.5f, 18.67f, 13.13f)
                curveTo(14.87f, 15.93f, 12.55f, 13.53f, 12f, 13.13f)
                curveTo(11.1f, 13.8f, 11.46f, 13.54f, 11.09f, 13.76f)
                curveTo(10.39f, 12.82f, 10f, 11.7f, 10f, 10.5f)
                curveTo(10f, 7.92f, 11.77f, 5.76f, 14.21f, 5.17f)
                curveTo(14.08f, 5.68f, 14f, 6.19f, 14f, 6.67f)
                curveTo(14f, 9.61f, 16.39f, 12f, 19.33f, 12f)
                close()
            }
        }.build()

        return _Tsunami!!
    }

@Suppress("ObjectPropertyName")
private var _Tsunami: ImageVector? = null
