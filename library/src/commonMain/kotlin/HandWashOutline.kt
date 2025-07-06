package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HandWashOutline: ImageVector
    get() {
        if (_HandWashOutline != null) {
            return _HandWashOutline!!
        }
        _HandWashOutline = ImageVector.Builder(
            name = "HandWashOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 5f)
                lineTo(17.62f, 6.37f)
                lineTo(19f, 7f)
                lineTo(17.62f, 7.63f)
                lineTo(17f, 9f)
                lineTo(16.36f, 7.63f)
                lineTo(15f, 7f)
                lineTo(16.36f, 6.37f)
                lineTo(17f, 5f)
                moveTo(20f, 14f)
                curveTo(21.1f, 14f, 22f, 13.1f, 22f, 12f)
                reflectiveCurveTo(20f, 8f, 20f, 8f)
                reflectiveCurveTo(18f, 10.9f, 18f, 12f)
                reflectiveCurveTo(18.9f, 14f, 20f, 14f)
                moveTo(11f, 6.1f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                curveTo(13.57f, 4f, 14.1f, 4.17f, 14.55f, 4.45f)
                lineTo(16f, 3f)
                curveTo(15.15f, 2.39f, 14.13f, 2f, 13f, 2f)
                horizontalLineTo(7.5f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(6.11f)
                curveTo(7.22f, 6.5f, 5.8f, 7.79f, 5.25f, 9.5f)
                horizontalLineTo(7.41f)
                curveTo(7.94f, 8.61f, 8.89f, 8f, 10f, 8f)
                curveTo(11.62f, 8f, 12.94f, 9.29f, 13f, 10.9f)
                lineTo(15f, 11.65f)
                verticalLineTo(11f)
                curveTo(15f, 8.58f, 13.28f, 6.56f, 11f, 6.1f)
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

        return _HandWashOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HandWashOutline: ImageVector? = null
