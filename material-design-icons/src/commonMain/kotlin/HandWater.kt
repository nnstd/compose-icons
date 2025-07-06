package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HandWater: ImageVector
    get() {
        if (_HandWater != null) {
            return _HandWater!!
        }
        _HandWater = ImageVector.Builder(
            name = "HandWater",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.42f, 22.5f)
                horizontalLineTo(5.33f)
                curveTo(3.5f, 22.5f, 2f, 21f, 2f, 19.17f)
                verticalLineTo(13.08f)
                curveTo(2f, 12.18f, 2.36f, 11.33f, 3f, 10.71f)
                lineTo(8.63f, 5.17f)
                curveTo(8.63f, 5.17f, 9.66f, 6.22f, 9.67f, 6.25f)
                curveTo(9.83f, 6.43f, 9.92f, 6.66f, 9.92f, 6.91f)
                curveTo(9.92f, 7.09f, 9.87f, 7.26f, 9.78f, 7.41f)
                curveTo(9.77f, 7.44f, 8f, 10f, 8f, 10f)
                horizontalLineTo(18.67f)
                curveTo(19.36f, 10f, 19.92f, 10.56f, 19.92f, 11.25f)
                curveTo(19.92f, 11.94f, 19.36f, 12.5f, 18.67f, 12.5f)
                horizontalLineTo(12.83f)
                verticalLineTo(13.33f)
                horizontalLineTo(20.75f)
                curveTo(21.44f, 13.33f, 22f, 13.89f, 22f, 14.58f)
                curveTo(22f, 15.28f, 21.44f, 15.83f, 20.75f, 15.83f)
                horizontalLineTo(12.83f)
                verticalLineTo(16.67f)
                horizontalLineTo(19.92f)
                curveTo(20.61f, 16.67f, 21.17f, 17.22f, 21.17f, 17.92f)
                curveTo(21.17f, 18.61f, 20.61f, 19.17f, 19.92f, 19.17f)
                horizontalLineTo(12.83f)
                verticalLineTo(20f)
                horizontalLineTo(17.42f)
                curveTo(18.11f, 20f, 18.67f, 20.56f, 18.67f, 21.25f)
                curveTo(18.67f, 21.94f, 18.11f, 22.5f, 17.42f, 22.5f)
                moveTo(13.5f, 4.8f)
                curveTo(13.5f, 4.8f, 12f, 6.46f, 12f, 7.5f)
                curveTo(12f, 9.5f, 15f, 9.5f, 15f, 7.5f)
                curveTo(15f, 6.46f, 13.5f, 4.8f, 13.5f, 4.8f)
                moveTo(18.5f, 1f)
                curveTo(18.5f, 1f, 16f, 3.76f, 16f, 5.5f)
                curveTo(16f, 8.83f, 21f, 8.83f, 21f, 5.5f)
                curveTo(21f, 3.76f, 18.5f, 1f, 18.5f, 1f)
                close()
            }
        }.build()

        return _HandWater!!
    }

@Suppress("ObjectPropertyName")
private var _HandWater: ImageVector? = null
