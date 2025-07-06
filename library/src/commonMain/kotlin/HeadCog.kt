package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeadCog: ImageVector
    get() {
        if (_HeadCog != null) {
            return _HeadCog!!
        }
        _HeadCog = ImageVector.Builder(
            name = "HeadCog",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 8.58f)
                curveTo(13.78f, 8.58f, 14.44f, 9.19f, 14.44f, 10f)
                reflectiveCurveTo(13.78f, 11.44f, 13f, 11.44f)
                reflectiveCurveTo(11.58f, 10.78f, 11.58f, 10f)
                reflectiveCurveTo(12.19f, 8.58f, 13f, 8.58f)
                moveTo(13f, 3f)
                curveTo(16.88f, 3f, 20f, 6.14f, 20f, 10f)
                curveTo(20f, 12.8f, 18.37f, 15.19f, 16f, 16.31f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                curveTo(6.89f, 18f, 6f, 17.11f, 6f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(4.5f)
                curveTo(4.08f, 13f, 3.84f, 12.5f, 4.08f, 12.19f)
                lineTo(6f, 9.66f)
                curveTo(6.19f, 5.95f, 9.23f, 3f, 13f, 3f)
                moveTo(16f, 10f)
                curveTo(16f, 9.84f, 16f, 9.75f, 15.94f, 9.61f)
                lineTo(16.83f, 8.95f)
                curveTo(16.88f, 8.91f, 16.92f, 8.77f, 16.88f, 8.67f)
                lineTo(16.08f, 7.31f)
                curveTo(16.03f, 7.22f, 15.89f, 7.17f, 15.8f, 7.22f)
                lineTo(14.81f, 7.64f)
                curveTo(14.63f, 7.45f, 14.39f, 7.31f, 14.16f, 7.22f)
                lineTo(14f, 6.19f)
                curveTo(13.97f, 6.05f, 13.92f, 6f, 13.78f, 6f)
                horizontalLineTo(12.19f)
                curveTo(12.09f, 6f, 12f, 6.05f, 12f, 6.19f)
                lineTo(11.86f, 7.22f)
                curveTo(11.63f, 7.31f, 11.39f, 7.45f, 11.2f, 7.64f)
                lineTo(10.17f, 7.22f)
                curveTo(10.08f, 7.17f, 10f, 7.22f, 9.94f, 7.31f)
                lineTo(9.14f, 8.67f)
                curveTo(9.09f, 8.81f, 9.09f, 8.91f, 9.19f, 8.95f)
                lineTo(10.03f, 9.61f)
                curveTo(10.03f, 9.75f, 10f, 9.89f, 10f, 10f)
                curveTo(10f, 10.13f, 10.03f, 10.27f, 10.03f, 10.41f)
                lineTo(9.19f, 11.06f)
                curveTo(9.09f, 11.11f, 9.09f, 11.2f, 9.14f, 11.3f)
                lineTo(9.94f, 12.7f)
                curveTo(10f, 12.8f, 10.08f, 12.8f, 10.17f, 12.8f)
                lineTo(11.16f, 12.37f)
                curveTo(11.39f, 12.56f, 11.58f, 12.66f, 11.86f, 12.75f)
                lineTo(12f, 13.83f)
                curveTo(12f, 13.92f, 12.09f, 14f, 12.19f, 14f)
                horizontalLineTo(13.78f)
                curveTo(13.92f, 14f, 13.97f, 13.92f, 14f, 13.83f)
                lineTo(14.16f, 12.75f)
                curveTo(14.39f, 12.66f, 14.63f, 12.56f, 14.81f, 12.38f)
                lineTo(15.8f, 12.8f)
                curveTo(15.89f, 12.8f, 16.03f, 12.8f, 16.08f, 12.7f)
                lineTo(16.88f, 11.3f)
                curveTo(16.92f, 11.2f, 16.88f, 11.11f, 16.83f, 11.06f)
                lineTo(16f, 10.41f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _HeadCog!!
    }

@Suppress("ObjectPropertyName")
private var _HeadCog: ImageVector? = null
