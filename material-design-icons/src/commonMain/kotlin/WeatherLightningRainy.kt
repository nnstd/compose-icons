package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WeatherLightningRainy: ImageVector
    get() {
        if (_WeatherLightningRainy != null) {
            return _WeatherLightningRainy!!
        }
        _WeatherLightningRainy = ImageVector.Builder(
            name = "WeatherLightningRainy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.5f, 13.59f)
                curveTo(5f, 13.87f, 5.14f, 14.5f, 4.87f, 14.96f)
                curveTo(4.59f, 15.44f, 4f, 15.6f, 3.5f, 15.33f)
                verticalLineTo(15.33f)
                curveTo(2f, 14.47f, 1f, 12.85f, 1f, 11f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 6f)
                curveTo(7f, 3.65f, 9.3f, 2f, 12f, 2f)
                curveTo(15.43f, 2f, 18.24f, 4.66f, 18.5f, 8.03f)
                lineTo(19f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 10f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                curveTo(9.5f, 4f, 7.45f, 5.82f, 7.06f, 8.19f)
                curveTo(6.73f, 8.07f, 6.37f, 8f, 6f, 8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 11f)
                curveTo(3f, 12.11f, 3.6f, 13.08f, 4.5f, 13.6f)
                verticalLineTo(13.59f)
                moveTo(9.5f, 11f)
                horizontalLineTo(12.5f)
                lineTo(10.5f, 15f)
                horizontalLineTo(12.5f)
                lineTo(8.75f, 22f)
                lineTo(9.5f, 17f)
                horizontalLineTo(7f)
                lineTo(9.5f, 11f)
                moveTo(17.5f, 18.67f)
                curveTo(17.5f, 19.96f, 16.5f, 21f, 15.25f, 21f)
                curveTo(14f, 21f, 13f, 19.96f, 13f, 18.67f)
                curveTo(13f, 17.12f, 15.25f, 14.5f, 15.25f, 14.5f)
                curveTo(15.25f, 14.5f, 17.5f, 17.12f, 17.5f, 18.67f)
                close()
            }
        }.build()

        return _WeatherLightningRainy!!
    }

@Suppress("ObjectPropertyName")
private var _WeatherLightningRainy: ImageVector? = null
