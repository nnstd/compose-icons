package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SkiCrossCountry: ImageVector
    get() {
        if (_SkiCrossCountry != null) {
            return _SkiCrossCountry!!
        }
        _SkiCrossCountry = ImageVector.Builder(
            name = "SkiCrossCountry",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 14f)
                horizontalLineTo(17.6f)
                verticalLineTo(22f)
                horizontalLineTo(19f)
                verticalLineTo(14f)
                moveTo(6.44f, 22f)
                horizontalLineTo(5f)
                lineTo(7f, 14f)
                horizontalLineTo(8.44f)
                lineTo(6.44f, 22f)
                moveTo(8.76f, 9.54f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(8.32f)
                lineTo(11.61f, 6.31f)
                curveTo(12.04f, 6.14f, 12.5f, 6.13f, 12.96f, 6.27f)
                reflectiveCurveTo(13.79f, 6.69f, 14.06f, 7.1f)
                lineTo(15f, 8.58f)
                curveTo(15.37f, 9.25f, 15.9f, 9.95f, 16.62f, 10.37f)
                curveTo(17.33f, 10.79f, 18.13f, 11f, 19f, 11f)
                verticalLineTo(12.83f)
                curveTo(18f, 12.83f, 17f, 12.62f, 16.13f, 12.2f)
                reflectiveCurveTo(14.5f, 11.06f, 13.88f, 10.37f)
                lineTo(13.31f, 13.16f)
                lineTo(15.28f, 15f)
                verticalLineTo(22f)
                horizontalLineTo(13.4f)
                verticalLineTo(16.5f)
                lineTo(11.5f, 14.55f)
                lineTo(9.77f, 22f)
                horizontalLineTo(7.8f)
                lineTo(10.43f, 8.89f)
                lineTo(8.76f, 9.54f)
                moveTo(16f, 4f)
                curveTo(16f, 5.11f, 15.11f, 6f, 14f, 6f)
                reflectiveCurveTo(12f, 5.11f, 12f, 4f)
                reflectiveCurveTo(12.9f, 2f, 14f, 2f)
                reflectiveCurveTo(16f, 2.9f, 16f, 4f)
                close()
            }
        }.build()

        return _SkiCrossCountry!!
    }

@Suppress("ObjectPropertyName")
private var _SkiCrossCountry: ImageVector? = null
