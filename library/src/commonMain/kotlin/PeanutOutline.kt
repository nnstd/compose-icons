package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PeanutOutline: ImageVector
    get() {
        if (_PeanutOutline != null) {
            return _PeanutOutline!!
        }
        _PeanutOutline = ImageVector.Builder(
            name = "PeanutOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 23f)
                curveTo(11.53f, 23f, 11.07f, 22.95f, 10.61f, 22.85f)
                curveTo(7.1f, 22.1f, 4.87f, 18.64f, 5.62f, 15.13f)
                curveTo(5.87f, 13.95f, 6.45f, 12.87f, 7.28f, 12f)
                curveTo(7.62f, 11.64f, 7.62f, 11.08f, 7.28f, 10.72f)
                curveTo(5.2f, 8.14f, 5.6f, 4.36f, 8.18f, 2.28f)
                reflectiveCurveTo(14.54f, 0.607f, 16.62f, 3.19f)
                curveTo(18.39f, 5.38f, 18.39f, 8.5f, 16.62f, 10.72f)
                curveTo(16.33f, 11.13f, 16.37f, 11.7f, 16.72f, 12.06f)
                curveTo(19.17f, 14.68f, 19.04f, 18.8f, 16.41f, 21.25f)
                curveTo(15.22f, 22.37f, 13.64f, 23f, 12f, 23f)
                moveTo(12f, 3f)
                curveTo(11.09f, 3f, 10.2f, 3.31f, 9.5f, 3.89f)
                curveTo(8.55f, 4.65f, 8f, 5.79f, 8f, 7f)
                curveTo(8f, 7.91f, 8.31f, 8.79f, 8.88f, 9.5f)
                curveTo(9.84f, 10.64f, 9.77f, 12.33f, 8.73f, 13.41f)
                curveTo(7.03f, 15.22f, 7.13f, 18.07f, 8.94f, 19.77f)
                reflectiveCurveTo(13.6f, 21.38f, 15.3f, 19.56f)
                curveTo(16.92f, 17.83f, 16.92f, 15.14f, 15.3f, 13.41f)
                curveTo(14.23f, 12.32f, 14.15f, 10.6f, 15.12f, 9.41f)
                curveTo(16.5f, 7.69f, 16.22f, 5.17f, 14.5f, 3.79f)
                curveTo(14f, 3.41f, 13.47f, 3.14f, 12.88f, 3f)
                curveTo(12.59f, 3f, 12.29f, 3f, 12f, 3f)
                moveTo(12f, 6f)
                curveTo(12f, 6.55f, 12.45f, 7f, 13f, 7f)
                reflectiveCurveTo(14f, 6.55f, 14f, 6f)
                reflectiveCurveTo(13.55f, 5f, 13f, 5f)
                reflectiveCurveTo(12f, 5.45f, 12f, 6f)
                moveTo(14f, 19f)
                curveTo(14.55f, 19f, 15f, 18.55f, 15f, 18f)
                reflectiveCurveTo(14.55f, 17f, 14f, 17f)
                reflectiveCurveTo(13f, 17.45f, 13f, 18f)
                reflectiveCurveTo(13.45f, 19f, 14f, 19f)
                moveTo(13f, 16f)
                curveTo(13.55f, 16f, 14f, 15.55f, 14f, 15f)
                reflectiveCurveTo(13.55f, 14f, 13f, 14f)
                reflectiveCurveTo(12f, 14.45f, 12f, 15f)
                reflectiveCurveTo(12.45f, 16f, 13f, 16f)
                moveTo(11f, 18f)
                curveTo(11.55f, 18f, 12f, 17.55f, 12f, 17f)
                reflectiveCurveTo(11.55f, 16f, 11f, 16f)
                reflectiveCurveTo(10f, 16.45f, 10f, 17f)
                reflectiveCurveTo(10.45f, 18f, 11f, 18f)
                close()
            }
        }.build()

        return _PeanutOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PeanutOutline: ImageVector? = null
