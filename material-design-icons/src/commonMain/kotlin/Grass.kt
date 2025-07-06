package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Grass: ImageVector
    get() {
        if (_Grass != null) {
            return _Grass!!
        }
        _Grass = ImageVector.Builder(
            name = "Grass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                horizontalLineTo(2f)
                verticalLineTo(18f)
                horizontalLineTo(7.75f)
                curveTo(7f, 15.19f, 4.81f, 13f, 2f, 12.26f)
                curveTo(2.64f, 12.1f, 3.31f, 12f, 4f, 12f)
                curveTo(8.42f, 12f, 12f, 15.58f, 12f, 20f)
                moveTo(22f, 12.26f)
                curveTo(21.36f, 12.1f, 20.69f, 12f, 20f, 12f)
                curveTo(17.07f, 12f, 14.5f, 13.58f, 13.12f, 15.93f)
                curveTo(13.41f, 16.59f, 13.65f, 17.28f, 13.79f, 18f)
                curveTo(13.92f, 18.65f, 14f, 19.32f, 14f, 20f)
                horizontalLineTo(22f)
                verticalLineTo(18f)
                horizontalLineTo(16.24f)
                curveTo(17f, 15.19f, 19.19f, 13f, 22f, 12.26f)
                moveTo(15.64f, 11f)
                curveTo(16.42f, 8.93f, 17.87f, 7.18f, 19.73f, 6f)
                curveTo(15.44f, 6.16f, 12f, 9.67f, 12f, 14f)
                verticalLineTo(14f)
                curveTo(12.95f, 12.75f, 14.2f, 11.72f, 15.64f, 11f)
                moveTo(11.42f, 8.85f)
                curveTo(10.58f, 6.66f, 8.88f, 4.89f, 6.7f, 4f)
                curveTo(8.14f, 5.86f, 9f, 8.18f, 9f, 10.71f)
                curveTo(9f, 10.92f, 8.97f, 11.12f, 8.96f, 11.32f)
                curveTo(9.39f, 11.56f, 9.79f, 11.84f, 10.18f, 12.14f)
                curveTo(10.39f, 10.96f, 10.83f, 9.85f, 11.42f, 8.85f)
                close()
            }
        }.build()

        return _Grass!!
    }

@Suppress("ObjectPropertyName")
private var _Grass: ImageVector? = null
