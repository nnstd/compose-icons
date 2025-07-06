package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmoticonDevil: ImageVector
    get() {
        if (_EmoticonDevil != null) {
            return _EmoticonDevil!!
        }
        _EmoticonDevil = ImageVector.Builder(
            name = "EmoticonDevil",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.5f, 2.09f)
                curveTo(21.6f, 3f, 20.13f, 3.73f, 18.31f, 4.25f)
                curveTo(16.59f, 2.84f, 14.39f, 2f, 12f, 2f)
                curveTo(9.61f, 2f, 7.41f, 2.84f, 5.69f, 4.25f)
                curveTo(3.87f, 3.73f, 2.4f, 3f, 1.5f, 2.09f)
                curveTo(1.53f, 3.72f, 2.35f, 5.21f, 3.72f, 6.4f)
                curveTo(2.63f, 8f, 2f, 9.92f, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                curveTo(22f, 9.92f, 21.37f, 8f, 20.28f, 6.4f)
                curveTo(21.65f, 5.21f, 22.47f, 3.72f, 22.5f, 2.09f)
                moveTo(7.5f, 8.5f)
                lineTo(10.5f, 10f)
                curveTo(10.5f, 10.8f, 9.8f, 11.5f, 9f, 11.5f)
                curveTo(8.2f, 11.5f, 7.5f, 10.8f, 7.5f, 10f)
                verticalLineTo(8.5f)
                moveTo(12f, 17.23f)
                curveTo(10.25f, 17.23f, 8.71f, 16.5f, 7.81f, 15.42f)
                lineTo(9.23f, 14f)
                curveTo(9.68f, 14.72f, 10.75f, 15.23f, 12f, 15.23f)
                curveTo(13.25f, 15.23f, 14.32f, 14.72f, 14.77f, 14f)
                lineTo(16.19f, 15.42f)
                curveTo(15.29f, 16.5f, 13.75f, 17.23f, 12f, 17.23f)
                moveTo(16.5f, 10f)
                curveTo(16.5f, 10.8f, 15.8f, 11.5f, 15f, 11.5f)
                curveTo(14.2f, 11.5f, 13.5f, 10.8f, 13.5f, 10f)
                lineTo(16.5f, 8.5f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _EmoticonDevil!!
    }

@Suppress("ObjectPropertyName")
private var _EmoticonDevil: ImageVector? = null
