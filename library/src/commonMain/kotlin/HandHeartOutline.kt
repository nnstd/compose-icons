package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HandHeartOutline: ImageVector
    get() {
        if (_HandHeartOutline != null) {
            return _HandHeartOutline!!
        }
        _HandHeartOutline = ImageVector.Builder(
            name = "HandHeartOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 3.23f)
                curveTo(16.71f, 2.41f, 17.61f, 2f, 18.7f, 2f)
                curveTo(19.61f, 2f, 20.37f, 2.33f, 21f, 3f)
                curveTo(21.63f, 3.67f, 21.96f, 4.43f, 22f, 5.3f)
                curveTo(22f, 6f, 21.67f, 6.81f, 21f, 7.76f)
                reflectiveCurveTo(19.68f, 9.5f, 19.03f, 10.15f)
                curveTo(18.38f, 10.79f, 17.37f, 11.74f, 16f, 13f)
                curveTo(14.61f, 11.74f, 13.59f, 10.79f, 12.94f, 10.15f)
                reflectiveCurveTo(11.63f, 8.71f, 10.97f, 7.76f)
                curveTo(10.31f, 6.81f, 10f, 6f, 10f, 5.3f)
                curveTo(10f, 4.39f, 10.32f, 3.63f, 10.97f, 3f)
                curveTo(11.62f, 2.37f, 12.4f, 2.04f, 13.31f, 2f)
                curveTo(14.38f, 2f, 15.27f, 2.41f, 16f, 3.23f)
                moveTo(22f, 19f)
                verticalLineTo(20f)
                lineTo(14f, 22.5f)
                lineTo(7f, 20.56f)
                verticalLineTo(22f)
                horizontalLineTo(1f)
                verticalLineTo(11f)
                horizontalLineTo(8.97f)
                lineTo(15.13f, 13.3f)
                curveTo(16.25f, 13.72f, 17f, 14.8f, 17f, 16f)
                horizontalLineTo(19f)
                curveTo(20.66f, 16f, 22f, 17.34f, 22f, 19f)
                moveTo(5f, 20f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                moveTo(19.9f, 18.57f)
                curveTo(19.74f, 18.24f, 19.39f, 18f, 19f, 18f)
                horizontalLineTo(13.65f)
                curveTo(13.11f, 18f, 12.58f, 17.92f, 12.07f, 17.75f)
                lineTo(9.69f, 16.96f)
                lineTo(10.32f, 15.06f)
                lineTo(12.7f, 15.85f)
                curveTo(13f, 15.95f, 15f, 16f, 15f, 16f)
                curveTo(15f, 15.63f, 14.77f, 15.3f, 14.43f, 15.17f)
                lineTo(8.61f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(18.5f)
                lineTo(13.97f, 20.41f)
                lineTo(19.9f, 18.57f)
                close()
            }
        }.build()

        return _HandHeartOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HandHeartOutline: ImageVector? = null
