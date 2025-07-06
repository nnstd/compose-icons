package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BellCog: ImageVector
    get() {
        if (_BellCog != null) {
            return _BellCog!!
        }
        _BellCog = ImageVector.Builder(
            name = "BellCog",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 12f)
                curveTo(15.13f, 12f, 12f, 15.13f, 12f, 19f)
                curveTo(12f, 19.34f, 12.03f, 19.67f, 12.08f, 20f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                lineTo(5f, 17f)
                verticalLineTo(11f)
                curveTo(5f, 7.9f, 7.03f, 5.17f, 10f, 4.29f)
                verticalLineTo(4f)
                curveTo(10f, 2.9f, 10.9f, 2f, 12f, 2f)
                reflectiveCurveTo(14f, 2.9f, 14f, 4f)
                verticalLineTo(4.29f)
                curveTo(16.97f, 5.17f, 19f, 7.9f, 19f, 11f)
                verticalLineTo(12f)
                moveTo(10f, 21f)
                curveTo(10f, 22.11f, 10.9f, 23f, 12f, 23f)
                curveTo(12.39f, 23f, 12.75f, 22.88f, 13.06f, 22.69f)
                curveTo(12.74f, 22.17f, 12.5f, 21.6f, 12.3f, 21f)
                horizontalLineTo(10f)
                moveTo(23.77f, 20.32f)
                curveTo(23.87f, 20.39f, 23.89f, 20.53f, 23.83f, 20.64f)
                lineTo(22.83f, 22.37f)
                curveTo(22.77f, 22.5f, 22.64f, 22.5f, 22.53f, 22.5f)
                lineTo(21.28f, 21.97f)
                curveTo(21f, 22.17f, 20.75f, 22.34f, 20.44f, 22.47f)
                lineTo(20.25f, 23.79f)
                curveTo(20.23f, 23.91f, 20.13f, 24f, 20f, 24f)
                horizontalLineTo(18f)
                curveTo(17.88f, 24f, 17.77f, 23.91f, 17.75f, 23.79f)
                lineTo(17.57f, 22.47f)
                curveTo(17.25f, 22.34f, 17f, 22.17f, 16.72f, 21.97f)
                lineTo(15.5f, 22.5f)
                curveTo(15.37f, 22.5f, 15.23f, 22.5f, 15.17f, 22.37f)
                lineTo(14.17f, 20.64f)
                curveTo(14.11f, 20.53f, 14.14f, 20.39f, 14.23f, 20.32f)
                lineTo(15.29f, 19.5f)
                curveTo(15.27f, 19.33f, 15.25f, 19.17f, 15.25f, 19f)
                reflectiveCurveTo(15.27f, 18.67f, 15.29f, 18.5f)
                lineTo(14.23f, 17.68f)
                curveTo(14.14f, 17.61f, 14.11f, 17.5f, 14.17f, 17.36f)
                lineTo(15.17f, 15.64f)
                curveTo(15.23f, 15.53f, 15.37f, 15.5f, 15.5f, 15.53f)
                lineTo(16.72f, 16f)
                curveTo(17f, 15.83f, 17.25f, 15.66f, 17.57f, 15.54f)
                lineTo(17.75f, 14.21f)
                curveTo(17.77f, 14.09f, 17.88f, 14f, 18f, 14f)
                horizontalLineTo(20f)
                curveTo(20.13f, 14f, 20.23f, 14.09f, 20.25f, 14.21f)
                lineTo(20.44f, 15.54f)
                curveTo(20.75f, 15.66f, 21f, 15.83f, 21.28f, 16f)
                lineTo(22.53f, 15.53f)
                curveTo(22.64f, 15.5f, 22.77f, 15.53f, 22.83f, 15.64f)
                lineTo(23.83f, 17.36f)
                curveTo(23.89f, 17.5f, 23.87f, 17.61f, 23.77f, 17.68f)
                lineTo(22.72f, 18.5f)
                curveTo(22.74f, 18.67f, 22.75f, 18.84f, 22.75f, 19f)
                reflectiveCurveTo(22.74f, 19.33f, 22.72f, 19.5f)
                lineTo(23.77f, 20.32f)
                moveTo(20.75f, 19f)
                curveTo(20.75f, 18.03f, 19.97f, 17.25f, 19f, 17.25f)
                reflectiveCurveTo(17.25f, 18.03f, 17.25f, 19f)
                reflectiveCurveTo(18.04f, 20.75f, 19f, 20.75f)
                reflectiveCurveTo(20.75f, 19.97f, 20.75f, 19f)
                close()
            }
        }.build()

        return _BellCog!!
    }

@Suppress("ObjectPropertyName")
private var _BellCog: ImageVector? = null
