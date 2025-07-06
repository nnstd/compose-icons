package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Chandelier: ImageVector
    get() {
        if (_Chandelier != null) {
            return _Chandelier!!
        }
        _Chandelier = ImageVector.Builder(
            name = "Chandelier",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 13.1f)
                curveTo(15f, 14.76f, 13.66f, 16.1f, 12f, 16.1f)
                reflectiveCurveTo(9f, 14.76f, 9f, 13.1f)
                reflectiveCurveTo(10.34f, 10.1f, 12f, 10.1f)
                reflectiveCurveTo(15f, 11.44f, 15f, 13.1f)
                moveTo(9f, 2f)
                verticalLineTo(3f)
                curveTo(9f, 4.11f, 9.9f, 5f, 11f, 5f)
                verticalLineTo(9.1f)
                curveTo(11.32f, 9.04f, 11.66f, 9f, 12f, 9f)
                reflectiveCurveTo(12.68f, 9.04f, 13f, 9.1f)
                verticalLineTo(5f)
                curveTo(14.11f, 5f, 15f, 4.11f, 15f, 3f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                moveTo(4f, 11.1f)
                curveTo(2.34f, 11.1f, 1f, 12.44f, 1f, 14.1f)
                reflectiveCurveTo(2.34f, 17.1f, 4f, 17.1f)
                reflectiveCurveTo(7f, 15.76f, 7f, 14.1f)
                reflectiveCurveTo(5.66f, 11.1f, 4f, 11.1f)
                moveTo(20f, 11.1f)
                curveTo(18.34f, 11.1f, 17f, 12.44f, 17f, 14.1f)
                reflectiveCurveTo(18.34f, 17.1f, 20f, 17.1f)
                reflectiveCurveTo(23f, 15.76f, 23f, 14.1f)
                reflectiveCurveTo(21.66f, 11.1f, 20f, 11.1f)
                moveTo(20f, 18.1f)
                curveTo(19.32f, 18.1f, 18.67f, 17.96f, 18.08f, 17.71f)
                curveTo(17.6f, 17.95f, 17.07f, 18.1f, 16.5f, 18.1f)
                curveTo(15.39f, 18.1f, 14.41f, 17.57f, 13.77f, 16.77f)
                curveTo(13.22f, 17f, 12.63f, 17.1f, 12f, 17.1f)
                reflectiveCurveTo(10.78f, 17f, 10.23f, 16.77f)
                curveTo(9.59f, 17.57f, 8.61f, 18.1f, 7.5f, 18.1f)
                curveTo(6.93f, 18.1f, 6.4f, 17.95f, 5.92f, 17.71f)
                curveTo(5.33f, 17.96f, 4.68f, 18.1f, 4f, 18.1f)
                curveTo(3.73f, 18.1f, 3.46f, 18.06f, 3.2f, 18f)
                curveTo(4.21f, 19.29f, 5.76f, 20.1f, 7.5f, 20.1f)
                curveTo(8.83f, 20.1f, 10.05f, 19.63f, 11f, 18.84f)
                verticalLineTo(21.1f)
                curveTo(11f, 21.65f, 11.45f, 22.1f, 12f, 22.1f)
                curveTo(12.55f, 22.1f, 13f, 21.65f, 13f, 21.1f)
                verticalLineTo(18.84f)
                curveTo(13.95f, 19.63f, 15.17f, 20.1f, 16.5f, 20.1f)
                curveTo(18.24f, 20.1f, 19.79f, 19.29f, 20.8f, 18f)
                curveTo(20.54f, 18.06f, 20.27f, 18.1f, 20f, 18.1f)
                close()
            }
        }.build()

        return _Chandelier!!
    }

@Suppress("ObjectPropertyName")
private var _Chandelier: ImageVector? = null
