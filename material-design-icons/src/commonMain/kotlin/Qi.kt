package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Qi: ImageVector
    get() {
        if (_Qi != null) {
            return _Qi!!
        }
        _Qi = ImageVector.Builder(
            name = "Qi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.09f, 6.56f)
                verticalLineTo(14.64f)
                curveTo(12.09f, 14.72f, 12f, 14.79f, 11.94f, 14.79f)
                curveTo(9.62f, 14.79f, 7.75f, 12.91f, 7.75f, 10.6f)
                curveTo(7.75f, 8.28f, 9.62f, 6.4f, 11.94f, 6.4f)
                curveTo(12f, 6.4f, 12.09f, 6.47f, 12.09f, 6.56f)
                moveTo(12.09f, 17.86f)
                verticalLineTo(20.29f)
                curveTo(12.06f, 21.69f, 13.12f, 22.87f, 14.5f, 23f)
                curveTo(14.66f, 23f, 14.78f, 22.89f, 14.79f, 22.73f)
                verticalLineTo(4.47f)
                curveTo(14.78f, 4.3f, 14.68f, 4.15f, 14.5f, 4.09f)
                curveTo(10.92f, 2.67f, 6.86f, 4.44f, 5.44f, 8.03f)
                curveTo(4f, 11.63f, 5.79f, 15.69f, 9.38f, 17.11f)
                curveTo(10.16f, 17.42f, 11f, 17.58f, 11.81f, 17.6f)
                curveTo(11.95f, 17.59f, 12.07f, 17.71f, 12.08f, 17.87f)
                moveTo(16.19f, 5.5f)
                verticalLineTo(15.72f)
                curveTo(16.19f, 16f, 16.19f, 16.2f, 16.46f, 16f)
                verticalLineTo(16f)
                curveTo(19.42f, 13.5f, 19.81f, 9.09f, 17.33f, 6.13f)
                curveTo(17.07f, 5.81f, 16.77f, 5.5f, 16.46f, 5.26f)
                curveTo(16.19f, 5.05f, 16.19f, 5.26f, 16.19f, 5.53f)
                moveTo(14.79f, 2.43f)
                curveTo(14.79f, 1.66f, 15.42f, 1.03f, 16.19f, 1.03f)
                curveTo(16.96f, 1.03f, 17.59f, 1.66f, 17.59f, 2.43f)
                curveTo(17.59f, 3.2f, 16.96f, 3.83f, 16.19f, 3.83f)
                verticalLineTo(3.83f)
                curveTo(15.42f, 3.83f, 14.79f, 3.2f, 14.79f, 2.43f)
            }
        }.build()

        return _Qi!!
    }

@Suppress("ObjectPropertyName")
private var _Qi: ImageVector? = null
