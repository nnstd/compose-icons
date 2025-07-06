package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Bathtub: ImageVector
    get() {
        if (_Bathtub != null) {
            return _Bathtub!!
        }
        _Bathtub = ImageVector.Builder(
            name = "Bathtub",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 5f)
                curveTo(8.11f, 5f, 9f, 5.9f, 9f, 7f)
                reflectiveCurveTo(8.11f, 9f, 7f, 9f)
                reflectiveCurveTo(5f, 8.11f, 5f, 7f)
                reflectiveCurveTo(5.9f, 5f, 7f, 5f)
                moveTo(20f, 13f)
                verticalLineTo(4.83f)
                curveTo(20f, 3.27f, 18.73f, 2f, 17.17f, 2f)
                curveTo(16.42f, 2f, 15.7f, 2.3f, 15.17f, 2.83f)
                lineTo(13.92f, 4.08f)
                curveTo(13.76f, 4.03f, 13.59f, 4f, 13.41f, 4f)
                curveTo(13f, 4f, 12.64f, 4.12f, 12.33f, 4.32f)
                lineTo(15.09f, 7.08f)
                curveTo(15.29f, 6.77f, 15.41f, 6.4f, 15.41f, 6f)
                curveTo(15.41f, 5.82f, 15.38f, 5.66f, 15.34f, 5.5f)
                lineTo(16.59f, 4.24f)
                curveTo(16.74f, 4.09f, 16.95f, 4f, 17.17f, 4f)
                curveTo(17.63f, 4f, 18f, 4.37f, 18f, 4.83f)
                verticalLineTo(13f)
                horizontalLineTo(11.15f)
                curveTo(10.85f, 12.79f, 10.58f, 12.55f, 10.33f, 12.28f)
                lineTo(8.93f, 10.73f)
                curveTo(8.74f, 10.5f, 8.5f, 10.35f, 8.24f, 10.23f)
                curveTo(7.93f, 10.08f, 7.59f, 10f, 7.24f, 10f)
                curveTo(6f, 10f, 5f, 11f, 5f, 12.25f)
                verticalLineTo(13f)
                horizontalLineTo(2f)
                verticalLineTo(19f)
                curveTo(2f, 20.1f, 2.9f, 21f, 4f, 21f)
                curveTo(4f, 21.55f, 4.45f, 22f, 5f, 22f)
                horizontalLineTo(19f)
                curveTo(19.55f, 22f, 20f, 21.55f, 20f, 21f)
                curveTo(21.1f, 21f, 22f, 20.1f, 22f, 19f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _Bathtub!!
    }

@Suppress("ObjectPropertyName")
private var _Bathtub: ImageVector? = null
