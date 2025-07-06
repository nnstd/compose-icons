package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FireCircle: ImageVector
    get() {
        if (_FireCircle != null) {
            return _FireCircle!!
        }
        _FireCircle = ImageVector.Builder(
            name = "FireCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.66f, 14.18f)
                curveTo(14.69f, 14.29f, 14.7f, 14.4f, 14.7f, 14.5f)
                curveTo(14.73f, 15.15f, 14.44f, 15.85f, 13.97f, 16.28f)
                curveTo(13.75f, 16.47f, 13.39f, 16.67f, 13.11f, 16.75f)
                curveTo(12.23f, 17.06f, 11.35f, 16.62f, 10.83f, 16.11f)
                curveTo(11.77f, 15.89f, 12.32f, 15.21f, 12.5f, 14.5f)
                curveTo(12.62f, 13.89f, 12.37f, 13.38f, 12.27f, 12.78f)
                curveTo(12.17f, 12.2f, 12.19f, 11.71f, 12.4f, 11.18f)
                curveTo(12.55f, 11.47f, 12.71f, 11.77f, 12.9f, 12f)
                curveTo(13.5f, 12.78f, 14.45f, 13.12f, 14.66f, 14.18f)
                moveTo(22f, 12f)
                curveTo(22f, 17.5f, 17.5f, 22f, 12f, 22f)
                reflectiveCurveTo(2f, 17.5f, 2f, 12f)
                reflectiveCurveTo(6.5f, 2f, 12f, 2f)
                reflectiveCurveTo(22f, 6.5f, 22f, 12f)
                moveTo(17.16f, 12.56f)
                lineTo(17.06f, 12.36f)
                curveTo(16.9f, 12f, 16.45f, 11.38f, 16.45f, 11.38f)
                curveTo(16.27f, 11.15f, 16.05f, 10.94f, 15.85f, 10.74f)
                curveTo(15.32f, 10.27f, 14.73f, 9.94f, 14.22f, 9.45f)
                curveTo(13.05f, 8.31f, 12.79f, 6.44f, 13.54f, 5f)
                curveTo(12.79f, 5.18f, 12.14f, 5.58f, 11.58f, 6.03f)
                curveTo(9.55f, 7.65f, 8.75f, 10.5f, 9.71f, 12.95f)
                curveTo(9.74f, 13.03f, 9.77f, 13.11f, 9.77f, 13.21f)
                curveTo(9.77f, 13.38f, 9.65f, 13.53f, 9.5f, 13.6f)
                curveTo(9.31f, 13.67f, 9.13f, 13.63f, 9f, 13.5f)
                curveTo(8.93f, 13.46f, 8.9f, 13.42f, 8.87f, 13.37f)
                curveTo(8f, 12.26f, 7.84f, 10.66f, 8.43f, 9.39f)
                curveTo(7.12f, 10.45f, 6.41f, 12.24f, 6.5f, 13.92f)
                curveTo(6.56f, 14.31f, 6.6f, 14.7f, 6.74f, 15.09f)
                curveTo(6.85f, 15.56f, 7.06f, 16f, 7.3f, 16.44f)
                curveTo(8.14f, 17.78f, 9.61f, 18.75f, 11.19f, 18.94f)
                curveTo(12.87f, 19.15f, 14.67f, 18.85f, 15.96f, 17.7f)
                curveTo(17.4f, 16.4f, 17.9f, 14.33f, 17.16f, 12.56f)
                close()
            }
        }.build()

        return _FireCircle!!
    }

@Suppress("ObjectPropertyName")
private var _FireCircle: ImageVector? = null
